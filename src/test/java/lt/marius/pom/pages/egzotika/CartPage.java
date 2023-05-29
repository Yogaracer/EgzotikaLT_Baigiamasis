package lt.marius.pom.pages.egzotika;

import lt.marius.pom.pages.*;

public class CartPage {

    public static void open() {
        Common.setUpDriver();
        Common.openUrl("https://www.egzotika.lt/en/onestepcheckout");
    }

    public static void clickOnMenuItemTyres() {
        Common.clickOnElementByAction(Locators.Egzotika.Cart.menuItemTyres);
    }

    public static String readMessageFromCart() {
        return Common.getTextFromElement(Locators.Egzotika.Cart.itemsInCart);
    }
}
