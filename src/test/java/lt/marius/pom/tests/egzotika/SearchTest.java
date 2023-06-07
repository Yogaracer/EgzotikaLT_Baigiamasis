package lt.marius.pom.tests.egzotika;

import lt.marius.pom.pages.egzotika.*;
import lt.marius.pom.tests.*;
import org.testng.*;
import org.testng.annotations.*;

import java.util.*;

public class SearchTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {

        HomePage.open();
    }

    @Test
    public static void testSearchTyresByDimensions() {
        String tyresWidth = "225";
        String tyresHeight = "45";
        String RimSize = "19";
        String tyresSeason = "Allseason";


        List<String> actualResult1;
        List<String>  actualResult2;
        String expectedResult1 = "225/ 45 R19";
        String expectedResult2 = "Tire Season Index Allseason";

        HomePage.clickOnTyresWidthSelector();
        HomePage.enterTyresWidth(tyresWidth);
        HomePage.confirmTyresWidth();
        HomePage.clickOnTyresHeightSelector();
        HomePage.enterTyresHeight(tyresHeight);
        HomePage.confirmTyresHeight();
        HomePage.clickOnRimSizeSelector();
        HomePage.enterRimSize(RimSize);
        HomePage.confirmRimSize();
        HomePage.clickOnTyresSeasonSelector();
        HomePage.enterTyresSeason(tyresSeason);
        HomePage.confirmTyresSeason();
        HomePage.clickOnButtonSearch();

        actualResult1 = TyresPage.readFoundTyresSizeAttributes();
        System.out.println(actualResult1);
        actualResult2 = TyresPage.readFoundTyresSeason();
        System.out.println(actualResult2);

        Assert.assertTrue(actualResult1.contains(expectedResult1));
        Assert.assertTrue(actualResult2.contains(expectedResult2));

    }
}