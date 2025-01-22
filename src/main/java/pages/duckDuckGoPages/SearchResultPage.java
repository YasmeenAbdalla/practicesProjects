package pages.duckDuckGoPages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class SearchResultPage {

    private SHAFT.GUI.WebDriver driver;
    SHAFT.TestData.JSON testData = new SHAFT.TestData.JSON("simpleJSON.json");
    private By firstResult = By.xpath("(//*[@data-testid='result-extras-url-link'])[1]");
    private By fourthResult = By.xpath("(//*[@data-testid='result-title-a'])[4]");

    public SearchResultPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public By getFirstResult() {
        return this.firstResult;
    }

    public SearchResultPage assertFourthResult() {
        this.driver.assertThat().element(this.fourthResult).text().isEqualTo(this.testData.getTestData("ExpectedFourthResult")).perform();
        return this;
    }
}
