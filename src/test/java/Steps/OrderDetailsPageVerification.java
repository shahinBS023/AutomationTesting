package Steps;

import driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.compress.harmony.pack200.NewAttribute;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pagesObjectModel.HomePage;
import pagesObjectModel.LoginPage;
import pagesObjectModel.MyAccountPage;
import pagesObjectModel.OrderHistoryPage;

import java.time.LocalDateTime;

public class OrderDetailsPageVerification {

    WebDriver driver = DriverManager.getDriver();
    private HomePage homePage = new HomePage(driver);
    private LoginPage loginPage = new LoginPage(driver);
    private MyAccountPage myAccountPage = new MyAccountPage(driver);
    private OrderHistoryPage orderHistoryPage = new OrderHistoryPage(driver);



    @Given("Goto login page")
    public void gotoLoginPage() {
        driver.navigate().to("https://localhost:44369/login");
    }

    @Then("Give login credential {string} and {string}")
    public void giveLoginCredentialAnd(String email, String pass) {
        loginPage.sendEmail(email);
        loginPage.sendPass(pass);
    }

    @And("Click on Login Button")
    public void clickOnLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Given("Click MyAccount page from home page")
    public void clickMyAccountPageFromHomePage() {
        homePage.clickMyAccountUrl();
    }

    @Then("Click on order")
    public void clickOnOrder() {
        myAccountPage.clickOrder();
    }

    @Then("Click on details")
    public void clickOnDetails() {
        orderHistoryPage.clickOrderDetailsBtn();
    }

    @And("Check the Order number {string}")
    public void checkTheOrderNumber(String ordNum) {
        String actualOrderNum = orderHistoryPage.getOderNumber();
        Assert.assertTrue(actualOrderNum.contains(ordNum));
    }
}
