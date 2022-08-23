package Steps;

import driver.DriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pagesObjectModel.HomePage;
import pagesObjectModel.LoginPage;

import java.util.List;
import java.util.Map;

public class MultiUserLoginFeature {
    WebDriver driver = DriverManager.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);

    // code for cucumber scenario outline
    @Then("Give the email {string} and password {string}")
    public void giveTheEmailAndPassword(String email, String password) {
        loginPage.sendEmail(email);
        loginPage.sendPass(password);
    }


    // Code for cucumber datatable

//    @Given("Perform Login with given datatable")
//    public void performLoginWithGivenDatatable(DataTable dataTable) throws InterruptedException {
//        List<Map<String, String>>  credentials = dataTable.asMaps(String.class, String.class);
//
//        String email, pass;
//        for (Map<String, String> e: credentials){
//            email = e.get("email");
//            pass = e.get("password");
//            driver.navigate().to("https://localhost:44369/login");
//            loginPage.performLogin(email, pass);
//            homePage.clickLogout();
//        }
//    }
}
