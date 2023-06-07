package lt.marius.pom.tests.egzotika;

import lt.marius.pom.pages.egzotika.AccountPage;
import lt.marius.pom.pages.egzotika.HomePage;
import lt.marius.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        HomePage.open();
    }

    @Test
    public static void testNewUserRegistrationWithValidData() {
        String messageFirstName = "Jonas";
        String messageLastName = "Bliudaitis";
        String messageEmail = "Jonasbliudaitis@gmail.com";
        String messagePassword = "9825dropdown";

        String expectedResult = "Jonas Bliudaitis\nJonasbliudaitis@gmail.com";
        String actualResult;

        HomePage.clickOnCreateAnAccountHeaderLink();
        AccountPage.insertUserFirstName(messageFirstName);
        AccountPage.insertUserLastName(messageLastName);
        AccountPage.insertUserEmailAddress(messageEmail);
        AccountPage.insertUserPassword(messagePassword);
        AccountPage.confirmUserPassword(messagePassword);
        AccountPage.clickOnButtonCreateAnAccount();
        actualResult = AccountPage.readContactInformation();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public static void testNewUserRegistrationWithInValidData() {
        String messageFirstName = "Buda";
        String messageLastName = "Budaitis";
        String messageEmail = "budabudaitis@gmail.com";
        String messagePassword = "9898dropdown";

        String expectedResult = "There is already an account with this email address. If you are sure that it is your " +
                "email address, click here to get your password and access your account.";
        String actualResult;

        HomePage.clickOnCreateAnAccountHeaderLink();
        AccountPage.insertUserFirstName(messageFirstName);
        AccountPage.insertUserLastName(messageLastName);
        AccountPage.insertUserEmailAddress(messageEmail);
        AccountPage.insertUserPassword(messagePassword);
        AccountPage.confirmUserPassword(messagePassword);
        AccountPage.clickOnButtonCreateAnAccount();
        actualResult = AccountPage.readRegistrationErrorNotification();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public static void testLoginWithValidData() {
        String messageEmail = "muda@gmail.com";
        String messagePassword = "9878dropdown";

        String expectedResult = "Your Dashboard";
        String actualResult;

        HomePage.clickOnSignInHeaderLink();
        AccountPage.insertSignInEmailAddress(messageEmail);
        AccountPage.insertSignInPassword(messagePassword);
        AccountPage.clickOnButtonSignIn();
        actualResult = AccountPage.readHeaderLinkName();

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public static void testLoginWithInValidData() {

        String messageEmail = "++++@gmail.com";
        String messagePassword = "Baigiamasis12345678";

        String expectedResult = "The account sign-in was incorrect or your account is disabled temporarily. Please " +
                "wait and try again later.";
        String actualResult;

        HomePage.clickOnSignInHeaderLink();
        AccountPage.insertSignInEmailAddress(messageEmail);
        AccountPage.insertSignInPassword(messagePassword);
        AccountPage.clickOnButtonSignIn();

        actualResult = AccountPage.readErrorNotification();

        Assert.assertEquals(actualResult, expectedResult);
    }
}