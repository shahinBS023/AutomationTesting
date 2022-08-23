package pagesObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public  LoginPage(WebDriver driver){
        this.driver = driver;
    }

    private By emailBox = By.xpath("//*[@id='Email']");
    private By passBox = By.xpath("//*[@id='Password']");
    private By loginBtn = By.xpath("//button[contains(@class,'login-button')]");


    public void sendEmail(String eml){
        driver.findElement(emailBox).sendKeys(eml);
    }

    public void sendPass(String pass){
        driver.findElement(passBox).sendKeys(pass);
    }

    public void clickLoginBtn(){
        driver.findElement(loginBtn).click();
    }

    public void performLogin(String eml, String pass) throws InterruptedException {
        driver.findElement(emailBox).sendKeys(eml);
        driver.findElement(passBox).sendKeys(pass);
        driver.findElement(loginBtn).click();
        Thread.sleep(2000);

    }

    public String getTitle(){
        return driver.getTitle();
    }

}
