package lt.marius.pom.pages;

import lt.marius.pom.utils.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.*;

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

    private static Select getSelectElement(By locator) {
        WebElement element = getElement(locator);
        Select selectElement = new Select(element);
        return selectElement;
    }

    public static List<Boolean> getStatusesOfSelectedOptionsGroup(By locator, List<String> selectValues) {
        List<Boolean> selectedStatusList = new ArrayList<>();
        List<WebElement> elements = getSelectElement(locator).getAllSelectedOptions();

        for (WebElement element : elements) {
            selectedStatusList.add(element.isSelected());
        }
        return selectedStatusList;
    }

    public static String getElementAttributeValue(By locator, String attributeName) {
        return getElement(locator).getAttribute(attributeName);
    }

    public static String getWindowHandleName() {
        return Driver.getDriver().getWindowHandle();
    }

    public static String getWindowHandleNames(String windowHandleName) {
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();
        for (String childWindowName : allWindowHandles) {
            if (!childWindowName.equals(windowHandleName)) {
                return childWindowName;
            }
        }
        return windowHandleName;
    }

    public static void switchToWindow(String name) {
        Driver.getDriver().switchTo().window(name);
    }

    public static void closeWindow() {
        Driver.getDriver().close();
    }

    public static void maximizeWindow() {
        Driver.getDriver().manage().window().maximize();
    }

    public static void clickOnElementByAction(By locator) {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(getElement(locator)).
                click().
                build().
                perform();
    }

    public static void clickRightOnElementWithAction(By locator) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(getElement(locator)).
                contextClick().
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

    public static void setAttributeValueWithJavascriptExecutor(By locator, String attributeName, String value) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        javascriptExecutor.executeScript(
                "arguments[0].%s='%s';".formatted(attributeName, value),
                getElement(locator)
        );
    }

    public static List<String> getTextFromElements(By locator) {

        List<String> listOfElementsText = new ArrayList<>();

        for (WebElement element : getElements(locator)) {
            listOfElementsText.add(element.getText());
        }
        return listOfElementsText;
    }

 }



