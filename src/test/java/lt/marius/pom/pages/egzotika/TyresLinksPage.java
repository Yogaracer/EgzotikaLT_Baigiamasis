package lt.marius.pom.pages.egzotika;

import lt.marius.pom.pages.Common;
import lt.marius.pom.pages.Locators;

public class TyresLinksPage {
    private static String attributeName;

    public static void open() {
        Common.setUpDriver();
        Common.openUrl("https://www.egzotika.lt/en/tyres");
    }

    public static boolean verifyIfAllLinksAreValid(String attributeName) {
        TyresLinksPage.attributeName = attributeName;
        return Common.verifyAllLinks(Locators.Egzotika.Tyres.linkGroup, attributeName);
    }
}
