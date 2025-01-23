package TestPackage;

import TestPackage.testBasePackage.TestBase;
import org.testng.annotations.Test;

public class test2 extends TestBase {

    @Test
    public void test2() {
        driver.browser().navigateToURL("https://www.selenium.dev/documentation/webdriver/support_features/");
    }
}
