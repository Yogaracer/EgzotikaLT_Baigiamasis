package lt.marius.pom.pages;

import org.openqa.selenium.By;

public class Locators {

    public class Egzotika {

        public class Home {

            public static By menuItemSignInLink = By.xpath("//div[@class='page-wrapper']//" +
                    "a[contains(text(),'Sign In')]");
            public static By menuItemAnAccountLink = By.xpath("//a[contains(text(),'Create an Account')]");

            public static By tyresWidthSelector = By.xpath("//form[@class='by-dimensions']//div[@class='control'][1]//span");
            public static By tyresWidth = By.xpath("//form[@class='by-dimensions']//div[@class='control'][1]//div[@class='chosen-drop']//input");

            public static By tyresHeightSelector = By.xpath("//form[@class='by-dimensions']//div[@class='control'][2]//span");
            public static By tyresHeight = By.xpath("//form[@class='by-dimensions']//div[@class='control'][2]//div[@class='chosen-drop']//input");

            public static By rimSizeSelector = By.xpath("//form[@class='by-dimensions']//div[@class='control'][3]//span");
            public static By rimSize = By.xpath("//form[@class='by-dimensions']//div[@class='control'][3]//div[@class='chosen-drop']//input");

            public static By tyresSeasonSelector =By.xpath("//form[@class='by-dimensions']//div[@class='control'][4]//span");
            public static By tyresSeason = By.xpath("//form[@class='by-dimensions']//div[@class='control'][4]//div[@class='chosen-drop']//input");

            public static By buttonSearch = By.xpath("//div[@class='search-container']//button[@title='Search']");
        }

        public class CustomerAccount {

            public static By userFirstName = By.xpath("//*[@id='firstname']");
            public static By userLastName = By.xpath("//*[@id='lastname']");
            public static By userEmail = By.xpath("//*[@id='email_address']");
            public static By userPassword = By.xpath("//*[@id='password']");
            public static By userPasswordConfirmation = By.xpath("//*[@id='password-confirmation']");
            public static By buttonCreateAnAccount = By.xpath("//button[@class='action submit primary']//" +
                    "span[contains(text(),'Create an Account')]");

            public static By signInEmail = By.xpath("//*[@id='email']");
            public static By signInPassword = By.xpath("//*[@id='pass']");
            public static By buttonSignIn = By.xpath("//div[@class='page-wrapper']//button[@id='send2']");

            public static By contactInformation = By.xpath("//div[@class='box box-information']//" +
                    "div[@class='box-content']//p");
            public static By signInErrorNotification = By.xpath("//div[contains(text(),'The account sign-in " +
                    "was incorrect or your account is disabled temporarily. Please wait and try again later.')]");
            public static By repeatedRegistrationErrorNotification = By.xpath("//div[@class='messages']//" +
                    "div[@data-bind=contains(text(),'There is already an account with this email address.')]");
            public static By headerLinkName = By.xpath("//div[@class='page-wrapper']//" +
                    "span[@class='dashboard']");
        }

        public class TyresCatalog {

            public static By tyresSizeAttributes = By.xpath("//div[@id='amasty-shopby-product-list']//span[@class='attribute-item size']");
                }
    }
}





