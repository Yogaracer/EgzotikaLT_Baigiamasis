package lt.marius.pom.pages.egzotika;

import lt.marius.pom.pages.*;

public class CartPage {

    public static String readMessageFromCart() {

        return Common.getTextFromElement(Locators.Egzotika.Cart.itemsInCart);
    }
}