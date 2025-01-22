package TestPackage.testDuckDuckGoPackage;

import TestPackage.testBasePackage.TestBase;
import org.testng.annotations.Test;
import pages.duckDuckGoPages.LandingPage;

public class CheckFirstResult extends TestBase {

    @Test
    public void checkFirstResult() {

        LandingPage landingPage = new LandingPage(driver);
        driver.assertThat().element(landingPage.navigation()
                .searchFirstResult().getFirstResult())
                .attribute("href")
                .isEqualTo(testData.getTestData("ExpectedFirstResult"));
    }
}
