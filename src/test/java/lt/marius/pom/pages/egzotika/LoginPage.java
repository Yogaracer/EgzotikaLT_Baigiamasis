package lt.marius.pom.pages.egzotika;

import lt.marius.pom.pages.Common;
import lt.marius.pom.pages.Locators;

public class LoginPage {
    public static void open() {
        Common.setUpDriver();
        Common.openUrl("https://www.egzotika.lt/en/customer/account/login/referer/aHR0cHM6Ly93d3cuZWd6b3Rpa2EubHQvZW4v/");
    }

    public static void insertEmailAddress(String messageEmail) {
        Common.sendKeysToElement(Locators.Egzotika.Login.inputUserEmail, messageEmail);
    }

    public static void insertPassword(String messagePassword) {
        Common.sendKeysToElement(Locators.Egzotika.Login.inputUserPassword, messagePassword);
    }

    public static void clickOnButtonSignIn() {
        Common.clickOnElement(Locators.Egzotika.Login.buttonSignIn);
    }

    public static String readErrorNotification() {
        return Common.getTextFromElement(Locators.Egzotika.Login.errorNotification);
    }
}
