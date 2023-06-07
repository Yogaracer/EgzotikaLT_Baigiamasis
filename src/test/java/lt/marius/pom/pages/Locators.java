package lt.marius.pom.pages;

import org.openqa.selenium.By;

public class Locators {

    public class Egzotika {

        public class Home {

            public static By menuItemSignInLink = By.xpath(
                    "//div[@class='page-wrapper']//a[contains(text(),'Sign In')]");
            public static By menuItemAnAccountLink = By.xpath("//a[contains(text(),'Create an Account')]");

            public static By tyresWidthSelector = By.xpath(
                    "//form[@class='by-dimensions']//div[@class='control'][1]//span");
            public static By tyresWidth = By.xpath(
                    "//form[@class='by-dimensions']//div[@class='control'][1]//" +
                            "div[@class='chosen-drop']//input");

            public static By tyresHeightSelector = By.xpath(
                    "//form[@class='by-dimensions']//div[@class='control'][2]//span");
            public static By tyresHeight = By.xpath(
                    "//form[@class='by-dimensions']//div[@class='control'][2]//" +
                            "div[@class='chosen-drop']//input");

            public static By rimSizeSelector = By.xpath("//form[@class='by-dimensions']//div[@class='control'][3]//div");
            public static By rimSize = By.xpath(
                    "//form[@class='by-dimensions']//div[@class='control'][3]//div[@class='chosen-drop']//input");

            public static By tyresSeasonSelector = By.xpath(
                    "//form[@class='by-dimensions']//div[@class='control'][4]//span");
            public static By tyresSeason = By.xpath(
                    "//form[@class='by-dimensions']//div[@class='control'][4]//" +
                            "div[@class='chosen-drop']//input");

            public static By buttonSearch = By.xpath(
                    "//div[@class='search-container']//button[@title='Search']");

            public static By menuItemTyres = By.xpath(
                    "//div[@class='mega-content']//span[contains(text(),'Tyres')]");
        }

        public class CustomerAccount {

            public static By userFirstName = By.xpath("//*[@id='firstname']");
            public static By userLastName = By.xpath("//*[@id='lastname']");
            public static By userEmail = By.xpath("//*[@id='email_address']");
            public static By userPassword = By.xpath("//*[@id='password']");
            public static By userPasswordConfirmation = By.xpath("//*[@id='password-confirmation']");
            public static By buttonCreateAnAccount = By.xpath(
                    "//button[@class='action submit primary']//span[contains(text(),'Create an Account')]");

            public static By signInEmail = By.xpath("//*[@id='email']");
            public static By signInPassword = By.xpath("//*[@id='pass']");
            public static By buttonSignIn = By.xpath("//div[@class='page-wrapper']//button[@id='send2']");

            public static By contactInformation = By.xpath(
                    "//div[@class='box box-information']//div[@class='box-content']//p");
            public static By signInErrorNotification = By.xpath("//div[contains(text(),'The account sign-in " +
                    "was incorrect or your account is disabled temporarily. Please wait and try again later.')]");
            public static By repeatedRegistrationErrorNotification = By.xpath("//div[@class='messages']//" +
                    "div[@data-bind=contains(text(),'There is already an account with this email address.')]");
            public static By headerLinkName = By.xpath(
                    "//div[@class='page-wrapper']//span[@class='dashboard']");
        }

        public class Tyres {

            public static By allSeasonTyres = By.xpath(
                    "//div[@class='block-content filter-content']//form[@class='am-ranges ']//" +
                            "li[@data-label='Allseason']");
            public static By winterTyres = By.xpath(
                    "//div[@class='block-content filter-content']//form[@class='am-ranges ']//" +
                            "li[@data-label='Winter']");
            public static By summerTyres = By.xpath(
                    "//div[@class='block-content filter-content']//form[@class='am-ranges ']//" +
                            "li[@data-label='Summer']");
            public static By buttonAddProduct1ToCart = By.xpath("//form[@data-product-sku='R0000719']//button");
            public static By buttonAddProduct2ToCart = By.xpath("//form[@data-product-sku='R0002331']//button");
            public static By buttonAddProduct3ToCart = By.xpath("//form[@data-product-sku='STM00006']//button");
            public static By menuItemTyres = By.xpath(
                    "//div[@class='mega-content']//a[@id='sm_megamenu_28']");
            public static By tyresSizeSeason = By.xpath("//div[@id='amasty-shopby-product-list']//" +
                    "span[@class='attribute-item tire-season']");
            public static By tyresSizeAttributes = By.xpath(
                    "//div[@id='amasty-shopby-product-list']//span[@class='attribute-item size']");
            public static By seasonMenu = By.xpath(
                    "//div[@class='block-content filter-content']//ol[@class='items am-filter-items-tire_season                -am-multiselect']");
        }

        public class Cart {
            public static By itemsInCart = By.xpath("//div[@id='opc-sidebar']//strong[@role='heading']//span");
            public static By orderSummaryList = By.xpath("//div[@class='order-summary hoverable']");
        }
    }
}