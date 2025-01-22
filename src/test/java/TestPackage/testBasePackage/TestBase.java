package TestPackage.testBasePackage;

import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected SHAFT.GUI.WebDriver driver;
    protected SHAFT.TestData.JSON testData;

    public TestBase() {
    }

    @BeforeMethod
    public void beforeClass() {
        driver= new SHAFT.GUI.WebDriver();
        testData = new SHAFT.TestData.JSON("simpleJSON.json");
    }

    @AfterMethod
    public void tearDown() {
        this.driver.quit();
    }

}
