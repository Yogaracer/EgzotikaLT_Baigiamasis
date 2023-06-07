package lt.marius.pom.pages;

import lt.marius.pom.utils.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.*;

import java.time.*;
import java.util.*;


public class Common {

    public static void setUpDriver() {
        Driver.setDriver();
    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void closeDriver() {
        Driver.closeDriver();
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    public static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    private static List<WebElement> getElements(By locator) {
        return Driver.getDriver().findElements(locator);
    }

    public static void sendKeysToElement(By locator, String sendKeys) {
        getElement(locator).sendKeys(sendKeys);
    }

    public static void clickOnElement(By locator) {
        getElement(locator).click();
    }

    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }

    public static void waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void clickOnElementByAction(By locator) {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(getElement(locator)).
                click().
                build().
                perform();
    }

    public static void executeSendKeysWithActions(By locator) {
        Actions actions = new Actions(Driver.getDriver());
        actions.
                click(getElement(locator))
                .sendKeys(Keys.ENTER)
                .build()
                .perform();
    }

    public static List<String> getTextFromElements(By locator) {

        List<String> listOfElementsText = new ArrayList<>();

        for (WebElement element : getElements(locator)) {
            listOfElementsText.add(element.getText());
        }
        return listOfElementsText;
    }

}