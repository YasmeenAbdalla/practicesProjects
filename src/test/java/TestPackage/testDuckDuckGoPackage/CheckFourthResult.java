package TestPackage.testDuckDuckGoPackage;

import TestPackage.testBasePackage.TestBase;
import org.testng.annotations.Test;
import pages.duckDuckGoPages.LandingPage;

public class CheckFourthResult extends TestBase {

    @Test
    public void verifyFourthResult() {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.navigation().searchFourthResult().assertFourthResult();
    }

}
