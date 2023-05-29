package lt.marius.pom.utils;

import org.apache.commons.io.*;
import org.openqa.selenium.*;
import org.testng.*;

import java.io.*;
import java.time.*;
import java.time.format.*;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            takeScreenshot();
        }
    }

    private void takeScreenshot() {
        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
        File screenshotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

        String dir = "./screenshots/";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HH_mm_SSS");
        String date = LocalDateTime.now().format(formatter);


        String fileName = "new_screenshot" + date + ".png";
        File copyToFile = new File("%s%s".formatted(dir, fileName));

        try {
            FileUtils.copyFile(screenshotFile, copyToFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}