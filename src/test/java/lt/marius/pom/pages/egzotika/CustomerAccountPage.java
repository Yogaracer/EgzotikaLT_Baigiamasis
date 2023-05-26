package lt.marius.pom.pages.egzotika;

import lt.marius.pom.pages.Common;
import lt.marius.pom.pages.Locators;

public class CustomerAccountPage {

    public static void insertUserFirstName(String messageFirstName) {
        Common.sendKeysToElement(Locators.Egzotika.CustomerAccount.userFirstName, messageFirstName);
    }

    public static void insertUserLastName(String messageLastName) {
        Common.sendKeysToElement(Locators.Egzotika.CustomerAccount.userLastName, messageLastName);
    }

    public static void insertUserEmailAddress(String messageEmail) {
        Common.sendKeysToElement(Locators.Egzotika.CustomerAccount.userEmail, messageEmail);
    }

    public static void insertUserPassword(String messagePassword) {
        Common.sendKeysToElement(Locators.Egzotika.CustomerAccount.userPassword, messagePassword);
    }

    public static void confirmUserPassword(String messagePassword) {
        Common.sendKeysToElement(Locators.Egzotika.CustomerAccount.userPasswordConfirmation, messagePassword);
    }

    public static void clickOnButtonCreateAnAccount() {
        Common.clickOnElement(Locators.Egzotika.CustomerAccount.buttonCreateAnAccount);
    }

    public static String readContactInformation() {

        return Common.getTextFromElement(Locators.Egzotika.CustomerAccount.contactInformation);
    }

    public static void insertSigninEmailAddress(String messageEmail) {
        Common.sendKeysToElement(Locators.Egzotika.CustomerAccount.signInEmail, messageEmail);
    }

    public static void insertSigninPassword(String messagePassword) {
        Common.sendKeysToElement(Locators.Egzotika.CustomerAccount.signInPassword, messagePassword);
    }

    public static void clickOnButtonSignIn() {
        Common.clickOnElement(Locators.Egzotika.CustomerAccount.buttonSignIn);
    }

    public static String readErrorNotification() {
        return Common.getTextFromElement(Locators.Egzotika.CustomerAccount.signInErrorNotification);
    }

    public static String readRegistrationErrorNotification() {
        return Common.getTextFromElement(Locators.Egzotika.CustomerAccount.repeatedRegistrationErrorNotification);
    }

    public static String readHeaderLinkName() {
        return Common.getTextFromElement(Locators.Egzotika.CustomerAccount.headerLinkName);
    }
}
