package Steps;

import driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pagesObjectModel.HomePage;
import pagesObjectModel.ProductDetailsPage;
import pagesObjectModel.SearchPage;

public class SearchFunctionality {

    WebDriver driver = DriverManager.getDriver();
    private HomePage homePage = new HomePage(driver);
    private SearchPage searchPage = new SearchPage(driver);
    private ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);

    @Given("Goto home page-for search")
    public void gotoHomePageForSearch() {
        driver.navigate().to("https://localhost:44369");
    }

    @Then("Give product name for search {string}")
    public void giveProductNameForSearch(String prdName) {
        homePage.sendSearchProductName(prdName);
    }

    @And("click the search button")
    public void clickTheSearchButton() {
        homePage.clickSearchBtn();
    }

    @Then("Check the search product {string}")
    public void checkTheSearchProduct(String pdName) {
        Assert.assertTrue(searchPage.productFound());
    }
}
