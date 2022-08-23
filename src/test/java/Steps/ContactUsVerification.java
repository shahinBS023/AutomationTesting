package Steps;

import driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.sl.In;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pagesObjectModel.ContactUs;
import utility.ExcelReader;

import java.awt.image.PackedColorModel;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ContactUsVerification {

    WebDriver driver = DriverManager.getDriver();

    private ContactUs contactUs = new ContactUs(driver);

    @Given("Go to the contact us page {string}")
    public void goToTheContactUsPage(String url) {
        driver.navigate().to(url);
    }

    @Then("Check the contact us page title {string}")
    public void checkTheContactUsPageTitle(String conUsTitle) {
        String actualTitle = contactUs.getPageTitle();
        Assert.assertTrue(actualTitle.contains(conUsTitle));
    }

    @Then("Fill the information from the sheet name {string} and rowNumber {int}")
    public void fill_the_information_from_the_sheet_name_and_row_number(String sheetName, Integer rowNumber) throws IOException, InvalidFormatException {
        ExcelReader reader = new ExcelReader();
        List<Map<String, String>> testData =
                reader.getData("src/test/resources/contactUsData.xlsx", sheetName);

        String name = testData.get(rowNumber).get("YourName");
        String email = testData.get(rowNumber).get("YourEmail");
        String message = testData.get(rowNumber).get("Enquiry");

        contactUs.sendAllInfo(name, email, message);

    }

    @And("click the submit button")
    public void clickTheSubmitButton() {
        contactUs.clickSubmitBtn();
    }

    @Then("Show a success message {string}")
    public void showASuccessMessage(String msg) {
        String actualMsg = contactUs.getSuccessMsg();
        Assert.assertTrue(actualMsg.contains(msg));
    }
}
