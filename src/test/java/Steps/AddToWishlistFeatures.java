package Steps;

import driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pagesObjectModel.HomePage;
import pagesObjectModel.SearchPage;
import pagesObjectModel.WishlistPage;

public class AddToWishlistFeatures {

    WebDriver driver = DriverManager.getDriver();
    HomePage homePage = new HomePage(driver);
    SearchPage searchPage = new SearchPage(driver);
    WishlistPage wishlistPage = new WishlistPage(driver);
<<<<<<< HEAD
    @Given("goto home page {string}")
    public void gotoHomePage(String url) {
        driver.navigate().to(url);
    }
=======

>>>>>>> main
    @Then("search first product {string}")
    public void searchFirstProduct(String product) {
        homePage.performSearch(product);
    }

    @And("Verify the first product")
    public void verifyTheFirstProduct() {
        boolean b =searchPage.verifyProduct(1);
        Assert.assertTrue(b);
    }

    @Then("search second  product {string}")
    public void searchSecondProduct(String product) {
        homePage.performSearch(product);
    }

    @And("Verify the second product")
    public void verifyTheSecondProduct() {
        boolean b =searchPage.verifyProduct(2);
        Assert.assertTrue(b);
    }

    @And("click on searched product wishlist button")
    public void clickOnSearchedProductWishlistButton() {
        searchPage.clickWishlistBtn();
    }


    @And("click on wishlist button")
    public void clickOnWishlistButton() {
        homePage.clickWishlist();
    }

    @Then("check first products are added to the wishlist")
    public void checkFirstProductsAreAddedToTheWishlist() {
        boolean b = wishlistPage.hasFirstProduct();
        Assert.assertTrue(b);
    }

    @Then("check second products are added to the wishlist")
    public void checkSecondProductsAreAddedToTheWishlist() {
        boolean b = wishlistPage.hasSecondProduct();
        Assert.assertTrue(b);
    }

    @And("remove both two products")
    public void removeBothTwoProducts() {
        wishlistPage.clickRemoveBtn();
        wishlistPage.clickRemoveBtn();
    }



}
