package Steps;

import driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pagesObjectModel.HomePage;
import pagesObjectModel.LoginPage;

public class BasicFeature {
    WebDriver driver = DriverManager.getDriver();

    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);


    @Given("Goto home page {string}")
    public void gotoHomePage(String url) {
        driver.navigate().to(url);
    }

    @Then("Check the home page title {string}")
    public void checkTheHomePageTitle(String homePageTitle) {
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle + " " + homePageTitle);
        Assert.assertTrue(actualTitle.contains(homePageTitle));
    }

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



}
