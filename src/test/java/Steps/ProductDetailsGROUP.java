package Steps;

import driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.HdrDocumentImpl;
import org.testng.Assert;
import pagesObjectModel.GroupProductDetailsPage;
import pagesObjectModel.HomePage;

public class ProductDetailsGROUP {
    WebDriver driver = DriverManager.getDriver();

    HomePage homePage = new HomePage(driver);
    GroupProductDetailsPage groupProductDetailsPage = new GroupProductDetailsPage(driver);

    @Then("Hover Electronics category")
    public void hoverElectronicsCategory() {
        homePage.hoverToElectronics();
    }

    @And("Click on camera and photo category")
    public void clickOnCameraAndPhotoCategory() {
        homePage.clickCameraCategory();
    }

    @And("Category page title should be {string}")
    public void categoryPageTitleShouldBe(String title) {
        String actualTitle = groupProductDetailsPage.givePageTitle();
        Assert.assertTrue(actualTitle.contains(title));
    }

    @Then("click on product name of Nikon DSLR")
    public void clickOnProductNameOfNikonDDSLR() {
        groupProductDetailsPage.clickNikonD5500DSLR();
    }

    @And("Product page title should be {string}")
    public void productPageTitleShouldBe(String title) {
        String actualTitle = groupProductDetailsPage.givePageTitle();
        Assert.assertTrue(actualTitle.contains(title));
    }

    @And("{string} and {string} product should be present")
    public void andProductShouldBePresent(String t1, String t2) {
        String actualProduct1 = groupProductDetailsPage.getRelatedProduct_1_OfNikonD5500DSLR_title();
        String actualProduct2 = groupProductDetailsPage.getRelatedProduct_2_OfNikonD5500DSLR_title();
        Assert.assertTrue(actualProduct1.contains(t1));
        Assert.assertTrue(actualProduct2.contains(t2));
    }
}
