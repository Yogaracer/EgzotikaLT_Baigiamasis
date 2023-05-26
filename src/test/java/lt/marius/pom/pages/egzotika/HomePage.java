package lt.marius.pom.pages.egzotika;

import lt.marius.pom.pages.Common;
import lt.marius.pom.pages.Locators;

public class HomePage {
    public static void open() {
        Common.setUpDriver();
        Common.openUrl("https://www.egzotika.lt/en/");
    }

    public static void clickOnSignInHeaderLink() {
        Common.clickOnElementByAction(Locators.Egzotika.Home.menuItemSignInLink);
    }

    public static void clickOnCreateAnAccountHeaderLink() {
        Common.clickOnElement(Locators.Egzotika.Home.menuItemAnAccountLink);
    }

    public static void clickOnMenuItemTyres() {
        Common.clickOnElementByAction(Locators.Egzotika.Home.menuItemTyres);
    }

  }



