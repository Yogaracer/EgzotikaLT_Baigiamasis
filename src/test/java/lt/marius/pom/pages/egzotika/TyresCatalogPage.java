package lt.marius.pom.pages.egzotika;

import lt.marius.pom.pages.*;

import java.util.*;

public class TyresCatalogPage {

    public static void open() {
        Common.setUpDriver();
        Common.openUrl("https://www.egzotika.lt/en/tyres");
    }

    public static List<String> readSearchedTyresSizeAttributes() {
        return Common.getTextFromElements(Locators.Egzotika.TyresCatalog.tyresSizeAttributes);
    }
}
