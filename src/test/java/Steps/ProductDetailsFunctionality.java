package Steps;

import driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pagesObjectModel.HomePage;
import pagesObjectModel.ProductDetailsPage;

public class ProductDetailsFunctionality {

    WebDriver driver = DriverManager.getDriver();
    private HomePage homePage = new HomePage(driver);
    private ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);

    @And("Click on product")
    public void clickOnProduct() {
        homePage.clickProduct();
    }

    @Then("Goto Product details page")
    public void gotoProductDetailsPage() {
        driver.navigate().to("https://localhost:44369/build-your-own-computer");
    }


    @Then("Check the product details page title {string}")
    public void checkTheProductDetailsPageTitle(String productTitle) {
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle + " " + productTitle);
        Assert.assertTrue(actualTitle.contains(productTitle));
    }

    @And("Check the product title {string}")
    public void checkTheProductTitle(String pdTitle) {
        String actualPDTitle = productDetailsPage.productTitle();
        Assert.assertTrue(actualPDTitle.contains(pdTitle));
    }


}
