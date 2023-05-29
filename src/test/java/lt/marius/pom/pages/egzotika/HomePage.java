package lt.marius.pom.pages.egzotika;

import lt.marius.pom.pages.Common;
import lt.marius.pom.pages.Locators;


public class HomePage {
    public static void open() {
        Common.setUpDriver();
        Common.openUrl("https://www.egzotika.lt/en/");
    }

    public static void sleep(int millis) {
        Common.sleep(millis);
    }

    public static void clickOnSignInHeaderLink() {
        Common.clickOnElementByAction(Locators.Egzotika.Home.menuItemSignInLink);
    }

    public static void clickOnCreateAnAccountHeaderLink() {
        Common.clickOnElement(Locators.Egzotika.Home.menuItemAnAccountLink);
    }

    public static void clickOnTyresWidthSelector() {
        Common.clickOnElementByAction(Locators.Egzotika.Home.tyresWidthSelector);
    }

    public static void enterTyresWidth(String messageWidth) {
        Common.sendKeysToElement(Locators.Egzotika.Home.tyresWidth, messageWidth);
    }

    public static void confirmTyresWidth() {
        Common.executeSendKeysWithActions(Locators.Egzotika.Home.tyresWidth);
    }

    public static void clickOnTyresHeightSelector() {
        Common.clickOnElementByAction(Locators.Egzotika.Home.tyresHeightSelector);
    }

    public static void enterTyresHeight(String messageHeight) {
        Common.sendKeysToElement(Locators.Egzotika.Home.tyresHeight, messageHeight);
    }

    public static void confirmTyresHeight() {
        Common.executeSendKeysWithActions(Locators.Egzotika.Home.tyresHeight);
    }

    public static void clickOnRimSizeSelector() {
        Common.clickOnElementByAction(Locators.Egzotika.Home.rimSizeSelector);
    }

    public static void enterRimSize(String messageRimSize) {
        Common.sendKeysToElement(Locators.Egzotika.Home.rimSize, messageRimSize);
    }

    public static void confirmRimSize() {
        Common.executeSendKeysWithActions(Locators.Egzotika.Home.rimSize);
    }

    public static void clickOnTyresSeasonSelector() {
        Common.clickOnElementByAction(Locators.Egzotika.Home.tyresSeasonSelector);
    }

    public static void enterTyresSeason(String messageSeason) {
        Common.sendKeysToElement(Locators.Egzotika.Home.tyresSeason, messageSeason);
    }

    public static void confirmTyresSeason() {
        Common.executeSendKeysWithActions(Locators.Egzotika.Home.tyresSeason);
    }

    public static void clickOnButtonSearch() {
        Common.clickOnElementByAction(Locators.Egzotika.Home.buttonSearch);
    }

    public static void clickOnMenuItemTyres() {Common.clickOnElementByAction(Locators.Egzotika.Home.menuItemTyres); }
}




