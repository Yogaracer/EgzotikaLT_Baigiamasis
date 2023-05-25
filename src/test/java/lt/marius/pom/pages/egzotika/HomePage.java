package lt.marius.pom.pages.egzotika;

import lt.marius.pom.pages.Common;
import lt.marius.pom.pages.Locators;
import org.testng.annotations.Test;

public class HomePage {
    public static void open() {
        Common.setUpDriver();
        Common.openUrl("https://www.egzotika.lt/en/");
    }

    public static void clickOnCreateAnAccountHeaderLink() {
        Common.clickOnElement(Locators.Egzotika.Home.createAnAccountLink);
    }

    public static void clickOnLoginHeaderLink() {
        Common.clickOnElement(Locators.Egzotika.Home.loginLink);
    }


}
