package pagesObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {

    private final WebDriver driver;

    public MyAccountPage(WebDriver driver){
        this.driver = driver;
    }

    private final By orderHistoryOptionBtn = By.xpath("//*[text()='Orders']");

    public void clickOrder(){
        driver.findElement(orderHistoryOptionBtn).click();
    }


}
