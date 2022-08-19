package Steps;

import driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pagesObjectModel.EmailFriendPage;
import pagesObjectModel.HomePage;
import pagesObjectModel.ProductDetailsPage;

public class EmailAFriendFunctionality {
    WebDriver driver = DriverManager.getDriver();
    HomePage homePage = new HomePage(driver);
    ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
    EmailFriendPage emailFriendPage = new EmailFriendPage(driver);

    @Then("Hover Computer category")
    public void hoverComputerCategory() {
        homePage.hoverToComputer();
    }

    @And("Click on the Notebook category")
    public void clickOnTheNotebookCategory() {
        homePage.clickNotebook();
    }

    @And("Click a product name of HP Spectre XT Pro UltraBook")
    public void clickAProductNameOfHPSpectreXTProUltraBook() {
        homePage.clickHpNotebook();
    }

    @Then("Check product details page title {string}")
    public void checkProductDetailsPageTitle(String title) {
        String actualTitle = productDetailsPage.getTitle();
        Assert.assertTrue(actualTitle.contains(title));
    }

    @Then("Click on Email A Friend Button")
    public void clickOnEmailAFriendButton() {
        productDetailsPage.clickEmailFriendBtn();
    }

    @And("Page title should be {string}")
    public void pageTitleShouldBe(String title) {
        String actualTitle = emailFriendPage.getTitle();
        Assert.assertTrue(actualTitle.contains(title));
    }

    @Then("Enter the friends email address {string}")
    public void enterTheFriendsEmailAddress(String email) {
        emailFriendPage.sendFriendEmail(email);
    }

    @And("Enter the Your email address {string}")
    public void enterTheYourEmailAddress(String email) {
        emailFriendPage.sendYourEmail(email);
    }

    @And("Enter a message {string}")
    public void enterAMessage(String msg) {
        emailFriendPage.sendMessage(msg);
    }

    @Then("Click on Send Email button")
    public void clickOnSendEmailButton() {
        emailFriendPage.clickSentEmailBtn();
    }

    @And("Get a warning message {string}")
    public void getAWarningMessage(String msg) {
        String actualMessage = emailFriendPage.getWarningMsg();
        Assert.assertTrue(actualMessage.contains(msg));
    }

    @And("Get a confirm message {string}")
    public void getAConfirmMessage(String msg) {
        String actualMsg = emailFriendPage.getConfirmMsg();
        Assert.assertTrue(actualMsg.contains(msg));
    }
}
