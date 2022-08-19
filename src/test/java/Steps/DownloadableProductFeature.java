package Steps;

import driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pagesObjectModel.DownloadableProductPage;
import pagesObjectModel.LoginPage;

public class DownloadableProductFeature {
    WebDriver driver = DriverManager.getDriver();

    DownloadableProductPage downloadableProductPage = new DownloadableProductPage(driver);
    LoginPage loginPage = new LoginPage(driver);
    @Given("Goto downloadable product page {string}")
    public void gotoDownloadableProductPage(String url) {
        driver.navigate().to(url);
    }

    @Then("Check any downloadable product present there on not")
    public void checkAnyDownloadableProductPresentThereOnNot() {
        Assert.assertTrue(downloadableProductPage.checkDownloadBtn());
    }

    @Then("Click the download button")
    public void clickTheDownloadButton() throws InterruptedException {
        downloadableProductPage.clickDownloadBtn();
        Thread.sleep(2000);
    }

    @And("Check product is downloaded or not")
    public void checkProductIsDownloadedOrNot() {
        Assert.assertTrue(downloadableProductPage.checkProductIsDownloadedOrNot());
    }

}
