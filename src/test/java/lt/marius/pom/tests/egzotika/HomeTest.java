package lt.marius.pom.tests.egzotika;

import lt.marius.pom.pages.Common;
import lt.marius.pom.pages.egzotika.*;
import lt.marius.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        HomePage.open();
        MyAccountPage.open();

    }

    @Test
    public static void testNewUserRegistrationWithValidData() {
        String messageFirstName = "MarkusasVanDaikas";
        String messageLastName = "IsKalnu";
        String messageEmail = "Markusasiskalnu@gmail.com";
        String messagePassword = "123niekonepadarys";

        String expectedResult = "MarkusasVanDaikas IsKalnu\nMarkusasiskalnu@gmail.com";
        String actualResult;

        HomePage.clickOnCreateAnAccountHeaderLink();
        NewAccountPage.insertFirstName(messageFirstName);
        NewAccountPage.insertLastName(messageLastName);
        NewAccountPage.insertEmailAddress(messageEmail);
        NewAccountPage.insertUserPassword(messagePassword);
        NewAccountPage.confirmUserPassword(messagePassword);
        NewAccountPage.clickOnButtonCreateAnAccount();
        actualResult = MyAccountPage.readContactInformation();

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public static void testLoginWithValidData() {
        String messageEmail = "xxxxpaulaitis@gmail.com";
        String messagePassword = "Baigiamasis12345678";

        String expectedResult = "xxxx Paulaitis\nxxxxpaulaitis@gmail.com";
        String actualResult;

        HomePage.clickOnLoginHeaderLink();
        LoginPage.insertEmailAddress(messageEmail);
        LoginPage.insertPassword(messagePassword);
        LoginPage.clickOnButtonSignIn();
        actualResult = MyAccountPage.readContactInformation();

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public static void testLoginWithInValidData() {
        String messageEmail = "++++@gmail.com";
        String messagePassword = "Baigiamasis12345678";

        String expectedResult = "The account sign-in was incorrect or your account is disabled temporarily. Please " +
                "wait and try again later.";
        String actualResult;

        HomePage.clickOnLoginHeaderLink();
        LoginPage.insertEmailAddress(messageEmail);
        LoginPage.insertPassword(messagePassword);
        LoginPage.clickOnButtonSignIn();

        actualResult = LoginPage.readErrorNotification();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public static void testProductValidLinks() {
        String attributeName = "href";
        boolean expectedResult = true;
        boolean actualResult;

        PadangosPage.open();
        actualResult = PadangosPage.verifyIfAllLinksAreValid(attributeName);

        Assert.assertEquals(actualResult, expectedResult);
    }


}

