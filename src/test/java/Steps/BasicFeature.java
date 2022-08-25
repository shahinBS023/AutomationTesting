package Steps;

import driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pagesObjectModel.HomePage;
import pagesObjectModel.LoginPage;
import utility.CommonMethods;

public class BasicFeature {
    WebDriver driver = DriverManager.getDriver();

    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);

    /* Initialize Common methods object */
    CommonMethods methods = new CommonMethods();

    @Given("Goto home page {string}")
    public void gotoHomePage(String url) {
        driver.navigate().to(url);
        System.out.println("URL: " + methods.currentPageUrl());
    }

    @Then("Check the home page title {string}")
    public void checkTheHomePageTitle(String homePageTitle) {
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle + " " + homePageTitle);
        Assert.assertTrue(actualTitle.contains(homePageTitle));
    }

    @Given("Goto login page")
    public void gotoLoginPage() {
        System.out.println("Login test");
        driver.navigate().to("https://localhost:44369/login");
        System.out.println("URL: " + methods.currentPageUrl());
    }

    @Then("Give login credential {string} and {string}")
    public void giveLoginCredentialAnd(String email, String pass) {
        loginPage.sendEmail(email);
        loginPage.sendPass(pass);
    }

    @And("Click on Login Button")
    public void clickOnLoginButton() throws InterruptedException {
        loginPage.clickLoginBtn();
        Thread.sleep(2000);

    }


}
