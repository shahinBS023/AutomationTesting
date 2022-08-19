package Steps;

import driver.DriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.it.Ma;
import org.openqa.selenium.WebDriver;
import pagesObjectModel.LoginPage;

import java.util.List;
import java.util.Map;

public class MultiUserLoginFeature {
    WebDriver driver = DriverManager.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    @Then("Give login credential email and password")
    public void giveLoginCredentialEmailAndPassword(DataTable dataTable, Integer rowNo) {
        List<Map<String, String>>  credentials = dataTable.asMaps();

        String email = credentials.get(rowNo).get("email");
        String pass = credentials.get(rowNo).get("password");

        loginPage.sendEmail(email);
        loginPage.sendPass(pass);
    }

}
