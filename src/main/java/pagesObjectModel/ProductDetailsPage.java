package pagesObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage {
    private WebDriver driver;
    public ProductDetailsPage(WebDriver driver){
        this.driver = driver;
    }

    private By productTitleLocation = By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[1]/h1");
    private By emailFriendBtn = By.xpath("//button[@class='button-2 email-a-friend-button']");

    public String productTitle(){
        return driver.findElement(productTitleLocation).getText();
    }

    public void clickEmailFriendBtn(){
        driver.findElement(emailFriendBtn).click();
    }
    private String getTitle(){
        return driver.getTitle();
    }

}
