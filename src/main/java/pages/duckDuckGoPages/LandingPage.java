package pages.duckDuckGoPages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class LandingPage {

      private   SHAFT.GUI.WebDriver driver;
      private  SHAFT.TestData.JSON testData = new SHAFT.TestData.JSON("simpleJSON.json");

        private By searchBox = By.id("searchbox_input");
        private By logo = By.xpath("//section[not(contains(@class, 'shrink'))]/a/img");
        private String duckDuckGoURL = "https://duckduckgo.com/";

        public LandingPage(SHAFT.GUI.WebDriver driver) {
            this.driver = driver;
        }

        public By getDuckLogo() {
            return this.logo;
        }

        public pages.duckDuckGoPages.LandingPage navigation() {
            this.driver.browser().navigateToURL(this.duckDuckGoURL);
            return this;
        }

        public SearchResultPage searchFirstResult() {
            this.driver.element().type(this.searchBox, this.testData.getTestData("FirstSearchResult"))
                    .keyPress(this.searchBox, Keys.ENTER);
            return new SearchResultPage(this.driver);
        }

        public SearchResultPage searchFourthResult() {
            this.driver.element().type(this.searchBox, this.testData.getTestData("FourthSearchResult"))
                    .keyPress(this.searchBox, Keys.ENTER);
            return new SearchResultPage(this.driver);
        }


}
