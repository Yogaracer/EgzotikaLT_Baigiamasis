package lt.marius.pom.pages.egzotika;

import lt.marius.pom.pages.Common;
import lt.marius.pom.pages.Locators;

public class MyAccountPage {

    public static void open() {
        Common.setUpDriver();
        Common.openUrl("https://www.egzotika.lt/en/customer/account/");
    }

    public static String readContactInformation() {
        return Common.getTextFromElement(Locators.Egzotika.MyAccount.contactInformation);
    }
}
