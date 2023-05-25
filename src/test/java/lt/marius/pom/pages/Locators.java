package lt.marius.pom.pages;

import org.openqa.selenium.By;

public class Locators {

    public class Egzotika {

        public class CustomerAccount {

            public static By createAnAccountLink = By.xpath("//a[contains(text(),'Create an Account')]");

            public static By loginLink = By.xpath("//li[@class='link authorization-link']//" +
                    "a[contains(text(),'Sign In')]");

            public static By userFirstName = By.xpath("//*[@id=\"firstname\"]");
            public static By userLastName = By.xpath("//*[@id=\"lastname\"]");
            public static By userEmail = By.xpath("//*[@id=\"email_address\"]");
            public static By userPassword = By.xpath("//*[@id=\"password\"]");
            public static By userPasswordConfirmation = By.xpath("//*[@id=\"password-confirmation\"]");
            public static By buttonCreateAnAccount = By.xpath("//button[@class='action submit primary']//" +
                    "span[contains(text(),'Create an Account')]");

            public static By signInEmail = By.xpath("//*[@id=\"email\"]");
            public static By signInPassword = By.xpath("//*[@id=\"pass\"]");
            public static By buttonSignIn = By.xpath("//*[@id=\"send2\"]");

            public static By contactInformation = By.xpath("//div[@class='box box-information']//" +
                    "div[@class='box-content']//p");
            public static By errorNotification = By.xpath("//div[contains(text(),'The account sign-in " +
                    "was incorrect or your account is disabled temporarily. Please wait and try again later.')]");
        }

        public class Tyres {

            public static By linkGroup = By.xpath("//div[@class='products wrapper list                products-list']//a");
        }
    }

}




