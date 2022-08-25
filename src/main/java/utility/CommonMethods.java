package utility;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonMethods {
    WebDriver driver = DriverManager.getDriver();
//    public CommonMethods(WebDriver driver){
//        this.driver = driver;
//    }

    public WebElement element(By x){
        return driver.findElement(x);
    }

    /************************
     * Get Current Page URL *
     * **********************
     */
    public String currentPageUrl() {
        return driver.getCurrentUrl();
    }
    public void sendText(By xpath, String value) {
        element(xpath).clear();
        element(xpath).sendKeys(value);
    }

    public String getText(By xpath){
        return element(xpath).getText();
    }



}
