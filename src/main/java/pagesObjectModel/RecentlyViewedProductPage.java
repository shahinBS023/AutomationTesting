package pagesObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecentlyViewedProductPage {
     WebDriver driver;
     public RecentlyViewedProductPage(WebDriver driver){
         this.driver = driver;
     }

     private By appleICam = By.xpath("//a[text()='Apple iCam']");

     public boolean appleICamIsPresent(){
         return driver.findElement(appleICam).isDisplayed();
     }

}
