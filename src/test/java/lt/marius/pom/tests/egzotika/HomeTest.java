package lt.marius.pom.tests.egzotika;

import lt.marius.pom.pages.egzotika.HomePage;
import lt.marius.pom.pages.egzotika.LoginPage;
import lt.marius.pom.pages.egzotika.MyAccountPage;
import lt.marius.pom.pages.egzotika.NewAccountPage;
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
        String messageFirstName = "xxxx";
        String messageLastName = "Paulaitis";
        String messageEmail = "xxxxpaulaitis@gmail.com";
        String messagePassword = "Baigiamasis12345678";

        String expectedResult = "xxxx Paulaitis\nxxxxpaulaitis@gmail.com";
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
}
