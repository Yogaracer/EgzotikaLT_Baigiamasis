package lt.marius.pom.pages.egzotika;

import lt.marius.pom.pages.*;

import java.util.*;

public class TyresPage {

    public static void open() {
        Common.setUpDriver();
        Common.openUrl("https://www.egzotika.lt/en/tyres");
    }
    public static void sleep(int millis) {
        Common.sleep(millis);
    }
    public static List<String> readFoundTyresSizeAttributes() {
        return Common.getTextFromElements(Locators.Egzotika.Tyres.tyresSizeAttributes);
    }
    public static void chooseTyresSeason1() {
        Common.clickOnElementByAction(Locators.Egzotika.Tyres.allSeasonTyres);
    }
    public static void chooseTyresSeason2() {
        Common.clickOnElementByAction(Locators.Egzotika.Tyres.winterTyres);
    }
    public static void chooseTyresSeason3() {
        Common.clickOnElementByAction(Locators.Egzotika.Tyres.summerTyres);
    }

    public static void addToCartProduct1() {
        Common.clickOnElementByAction(Locators.Egzotika.Tyres.buttonAddProduct1ToCart);
    }
    public static void addToCartProduct2() {
        Common.clickOnElementByAction(Locators.Egzotika.Tyres.buttonAddProduct2ToCart);
    }
    public static void addToCartProduct3() {
        Common.clickOnElementByAction(Locators.Egzotika.Tyres.buttonAddProduct3ToCart);
    }
}




