package pagesObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUs {

    WebDriver driver;

    public ContactUs(WebDriver driver){
        this.driver = driver;
    }

    private By nameTxtBox = By.id("FullName");
    private By emailBox= By.id("Email");
    private By messageBox = By.id("Enquiry");
    private By submitBtn = By.xpath("//button[contains(@class,'contact-us-button')]");
    private By successMessage = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]");

    public String getPageTitle(){
        return driver.getTitle();
    }
    public void sendAllInfo(String name, String email, String msg){
        driver.findElement(nameTxtBox).sendKeys(name);
        driver.findElement(emailBox).sendKeys(email);
        driver.findElement(messageBox).sendKeys(msg);
    }

    public void clickSubmitBtn(){
        driver.findElement(submitBtn).click();
    }

    public String getSuccessMsg(){
        return driver.findElement(successMessage).getText();
    }


}
