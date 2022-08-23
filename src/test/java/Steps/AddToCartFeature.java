package Steps;

import driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pagesObjectModel.CartPage;
import pagesObjectModel.HomePage;
import pagesObjectModel.SearchPage;

public class AddToCartFeature {
    WebDriver driver = DriverManager.getDriver();
    SearchPage searchPage = new SearchPage(driver);
    HomePage homePage = new HomePage(driver);
    CartPage cartPage = new CartPage(driver);

    @And("click on searched product Add to cart button")
    public void clickOnSearchedProductAddToCartButton() {
        searchPage.clickAddToCartBtn();
    }

    @And("click on Shopping Cart Button")
    public void clickOnShoppingCartButton() {
        homePage.clickShoppingCart();
    }

    @Then("check first products are added to the cart")
    public void checkFirstProductsAreAddedToTheCart() {
        boolean b = cartPage.hasFirstProduct();
        Assert.assertTrue(b);
    }

    @Then("check second products are added to the cart")
    public void checkSecondProductsAreAddedToTheCart() {
        boolean b = cartPage.hasSecondProduct();
        Assert.assertTrue(b);
    }


    @And("remove both two products from cart")
    public void removeBothTwoProductsFromCart() {
        cartPage.clickRemoveBtn();
        cartPage.clickRemoveBtn();
    }
}
