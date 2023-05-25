package lt.marius.pom.pages;

import org.openqa.selenium.By;

public class Locators {


    public class Egzotika {


        public class Home {

            public static By createAnAccountLink = By.xpath("//a[contains(text(),'Create an Account')]");
            public static By loginLink = By.xpath("//li[@class='link authorization-link']//" +
                    "a[contains(text(),'Sign In')]");
        }

        public class NewAccount {

            public static By inputFirstName = By.xpath("//*[@id=\"firstname\"]");

            public static By inputLastName = By.xpath("//*[@id=\"lastname\"]");

            public static By inputUserEmail = By.xpath("//*[@id=\"email_address\"]");

            public static By inputUserPassword = By.xpath("//*[@id=\"password\"]");

            public static By confirmUserPassword = By.xpath("//*[@id=\"password-confirmation\"]");

            public static By buttonCreateAnAccount = By.xpath("//button[@class='action submit primary']//" +
                    "span[contains(text(),'Create an Account')]");

        }

        public class Login {

            public static By inputUserEmail = By.xpath("//*[@id=\"email\"]");
            public static By inputUserPassword = By.xpath("//*[@id=\"pass\"]");
            public static By buttonSignIn = By.xpath("//*[@id=\"send2\"]");
            public static By errorNotification = By.xpath("//div[contains(text(),'The account sign-in " +
                    "was incorrect or your account is disabled temporarily. Please wait and try again later.')]");
        }

        public class MyAccount {

            public static By contactInformation = By.xpath("//div[@class='box box-information']//" +
                    "div[@class='box-content']//p");
        }


        public class Padangos {

            public static By linkGroup = By.xpath("//div[@class='products wrapper list                products-list']//a");
        }
    }
}




