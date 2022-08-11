package pagesObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderHistoryPage {

    private final WebDriver driver;

    public OrderHistoryPage(WebDriver driver){
        this.driver = driver;
    }

    private final By orderDetails15 = By.xpath("//button[contains(@class,'order-details-button')]");
    private final By orderNumber = By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.order-overview > div > strong");


    public void clickOrderDetailsBtn(){
        driver.findElement(orderDetails15).click();
    }

    public String getOderNumber(){
        return driver.findElement(orderNumber).getText();
    }

}
