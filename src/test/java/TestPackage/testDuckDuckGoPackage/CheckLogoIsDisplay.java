package TestPackage.testDuckDuckGoPackage;

import TestPackage.testBasePackage.TestBase;
import org.testng.annotations.Test;
import pages.duckDuckGoPages.LandingPage;

public class CheckLogoIsDisplay extends TestBase {

    @Test
    public void checkLogoIsDisplay() {
        LandingPage landingPage = new LandingPage(driver);
        driver.element().assertThat(landingPage.navigation().getDuckLogo()).exists().perform();
    }
}
