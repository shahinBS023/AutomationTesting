package Steps;

import driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pagesObjectModel.HomePage;
import pagesObjectModel.RecentlyViewedProductPage;
import pagesObjectModel.SearchPage;

public class RecentlyViewedProductsFeature {
    WebDriver driver = DriverManager.getDriver();
    HomePage homePage = new HomePage(driver);
    SearchPage searchPage = new SearchPage(driver);
    RecentlyViewedProductPage recentlyViewedProductPage = new RecentlyViewedProductPage(driver);
    @Then("Send {string} product name to the search page")
    public void sendProductNameToTheSearchPage(String pdName) {
        homePage.sendSearchProductName(pdName);
    }

    @Then("Click the searched product")
    public void clickTheSearchedProduct() {
        searchPage.clickAppleICam();
    }

    @Then("scroll down to the footer and click Recently viewed products")
    public void scrollDownToTheFooterAndClickRecentlyViewedProducts() {
        homePage.clickRecentlyViewedProducts();
    }

    @And("Check the viewed product is present or not")
    public void checkTheViewedProductIsPresentOrNot() {
        Assert.assertTrue(recentlyViewedProductPage.appleICamIsPresent());
    }
}
