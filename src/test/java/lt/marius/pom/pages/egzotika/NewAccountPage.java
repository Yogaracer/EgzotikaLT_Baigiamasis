package lt.marius.pom.pages.egzotika;

import lt.marius.pom.pages.Common;
import lt.marius.pom.pages.Locators;

public class NewAccountPage {
    public static void open() {

        Common.setUpDriver();
        Common.openUrl("https://www.egzotika.lt/en/customer/account/create/");
    }

    public static void insertFirstName(String messageFirstName) {
        Common.sendKeysToElement(Locators.Egzotika.NewAccount.inputFirstName, messageFirstName);
    }

    public static void insertLastName(String messageLastName) {
        Common.sendKeysToElement(Locators.Egzotika.NewAccount.inputLastName, messageLastName);
    }

    public static void insertEmailAddress(String messageEmail) {
        Common.sendKeysToElement(Locators.Egzotika.NewAccount.inputUserEmail, messageEmail);
    }

    public static void insertUserPassword(String messagePassword) {
        Common.sendKeysToElement(Locators.Egzotika.NewAccount.inputUserPassword, messagePassword);
    }

    public static void confirmUserPassword(String messagePassword) {
        Common.sendKeysToElement(Locators.Egzotika.NewAccount.confirmUserPassword, messagePassword);
    }

    public static void clickOnButtonCreateAnAccount() {
        Common.clickOnElement(Locators.Egzotika.NewAccount.buttonCreateAnAccount);
    }
}

