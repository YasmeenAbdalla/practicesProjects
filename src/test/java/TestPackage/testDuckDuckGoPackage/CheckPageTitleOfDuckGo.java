package TestPackage.testDuckDuckGoPackage;

import TestPackage.testBasePackage.TestBase;
import org.testng.annotations.Test;
import pages.duckDuckGoPages.LandingPage;

public class CheckPageTitleOfDuckGo extends TestBase {

    @Test
    public void verifyPageTitle() {

        new LandingPage(driver).navigation();
        driver.assertThat().browser().title().isEqualTo("Google").perform();
    }
}
