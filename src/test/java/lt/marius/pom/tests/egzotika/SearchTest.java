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

        String expectedResult = "225/ " + "45 " + "R19";

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

        List<String> actualResult = TyresPage.readFoundTyresSizeAttributes();
        Assert.assertTrue(actualResult.contains(expectedResult));

    }
}

