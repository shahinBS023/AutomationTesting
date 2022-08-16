package pagesObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailFriendPage {
    WebDriver driver;
    public EmailFriendPage(WebDriver driver){
        this.driver = driver;
    }

    private final By friendEmailBox = By.id("FriendEmail");
    private final By yourEmailBox = By.id("YourEmailAddress");
    private final By msgBox = By.id("PersonalMessage");
    private final By sendEmailBtn = By.xpath("//button[@class='button-1 send-email-a-friend-button']");
    private final By warningMsg = By.xpath("//li[text()='Only registered customers can use email a friend feature']");
    private final By confirmMessage = By.xpath("//*[@class='result']");

    public void sendFriendEmail(String email){
        driver.findElement(friendEmailBox).sendKeys(email);
    }
    public void sendYourEmail(String email){
        driver.findElement(yourEmailBox).sendKeys(email);
    }
    public void sendMessage(String msg){
        driver.findElement(msgBox).sendKeys(msg);
    }
    public void clickSentEmailBtn(){
        driver.findElement(sendEmailBtn).click();
    }
    public String getTitle(){
        return driver.getTitle();
    }

    public String getWarningMsg(){
        return driver.findElement(warningMsg).getText();
    }
    public String getConfirmMsg(){
        return driver.findElement(confirmMessage).getText();
    }



}
