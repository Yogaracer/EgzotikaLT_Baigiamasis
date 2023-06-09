package lt.marius.pom.tests.egzotika;

import lt.marius.pom.pages.egzotika.*;
import lt.marius.pom.tests.*;
import org.testng.*;
import org.testng.annotations.*;

public class AddToCartTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        TyresPage.open();
    }

    @Test
    public static void testAddProductsToCart() {
        String expectedResult = "3";
        String actualResult;

        TyresPage.chooseTyresSeason1();
        TyresPage.addToCartProduct1();
        TyresPage.clickOnMenuItemTyres();
        TyresPage.chooseTyresSeason2();
        TyresPage.addToCartProduct2();
        TyresPage.clickOnMenuItemTyres();
        TyresPage.chooseTyresSeason3();
        TyresPage.addToCartProduct3();


        actualResult = CartPage.readMessageFromCart();
        Assert.assertEquals(actualResult, expectedResult);
        System.out.println(actualResult);
    }
}