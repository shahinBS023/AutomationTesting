package pagesObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;


public class DownloadableProductPage {

    WebDriver driver;

    public DownloadableProductPage(WebDriver driver){
        this.driver = driver;
    }

    private By downloadBtn = By.xpath("//a[text()='Download']");

    public boolean checkDownloadBtn(){
        return driver.findElement(downloadBtn).isDisplayed();
    }

    public void clickDownloadBtn() {
        driver.findElement(downloadBtn).click();
    }

    public boolean checkProductIsDownloadedOrNot(){
        String pdPath = System.getProperty("user.dir")+"/DownloadedFile/Night_Vision_1.zip";
        File file = new File(pdPath);
        boolean b=false;
        b = file.exists();
        return b;
    }

}
