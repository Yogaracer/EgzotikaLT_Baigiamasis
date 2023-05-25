package lt.marius.pom.tests.egzotika;

import lt.marius.pom.pages.egzotika.*;
import lt.marius.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerAccountTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        CustomerAccountPage.open();
    }

    @Test
    public static void testNewUserRegistrationWithValidData() {
        String messageFirstName = "Tomas1";
        String messageLastName = "Tomaitis1";
        String messageEmail = "tomastomaitis1@gmail.com";
        String messagePassword = "9876dropdown";

        String expectedResult = "Tomas1 Tomaitis1\ntomastomaitis1@gmail.com";
        String actualResult;

        CustomerAccountPage.clickOnCreateAnAccountHeaderLink();
        CustomerAccountPage.insertUserFirstName(messageFirstName);
        CustomerAccountPage.insertUserLastName(messageLastName);
        CustomerAccountPage.insertUserEmailAddress(messageEmail);
        CustomerAccountPage.insertUserPassword(messagePassword);
        CustomerAccountPage.confirmUserPassword(messagePassword);
        CustomerAccountPage.clickOnButtonCreateAnAccount();
        actualResult = CustomerAccountPage.readContactInformation();

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public static void testLoginWithValidData() {
        String messageEmail = "xxxxpaulaitis@gmail.com";
        String messagePassword = "Baigiamasis12345678";

        String expectedResult = "xxxx Paulaitis\nxxxxpaulaitis@gmail.com";
        String actualResult;

        CustomerAccountPage.insertSigninEmailAddress(messageEmail);
        CustomerAccountPage.insertSigninPassword(messagePassword);
        CustomerAccountPage.clickOnButtonSignIn();
        actualResult = CustomerAccountPage.readContactInformation();

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public static void testLoginWithInValidData() {

        String messageEmail = "++++@gmail.com";
        String messagePassword = "Baigiamasis12345678";

        String expectedResult = "The account sign-in was incorrect or your account is disabled temporarily. Please " +
                "wait and try again later.";
        String actualResult;

        CustomerAccountPage.insertSigninEmailAddress(messageEmail);
        CustomerAccountPage.insertSigninPassword(messagePassword);
        CustomerAccountPage.clickOnButtonSignIn();

        actualResult = CustomerAccountPage.readErrorNotification();

        Assert.assertEquals(actualResult, expectedResult);
    }
}

