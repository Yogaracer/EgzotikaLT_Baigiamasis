package lt.marius.pom.tests.egzotika;

import lt.marius.pom.pages.egzotika.TyresLinksPage;
import lt.marius.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TyresLinksTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        TyresLinksPage.open();

    }

    @Test
    public static void testProductValidLinks() {
        String attributeName = "href";
        boolean expectedResult = true;
        boolean actualResult;

        actualResult = TyresLinksPage.verifyIfAllLinksAreValid(attributeName);

        Assert.assertEquals(actualResult, expectedResult);
    }

}
