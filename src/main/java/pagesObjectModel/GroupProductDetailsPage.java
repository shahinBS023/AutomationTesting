package pagesObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.CommonMethods;

public class GroupProductDetailsPage extends CommonMethods{
    WebDriver driver;
    public GroupProductDetailsPage(WebDriver driver){
        this.driver = driver;
    }


    private final By nikkonD5500DSLR = By.xpath("(//a[text()='Nikon D5500 DSLR'])[1]");
    private final By nikkonD5500DSLR_Black = By.xpath("(//div[text()='Nikon D5500 DSLR - Black'])");
    private final By nikkonD5500DSLR_Red = By.xpath("(//div[text()='Nikon D5500 DSLR - Red'])");

    public String givePageTitle(){
        return driver.getTitle();
    }

    public void clickNikonD5500DSLR(){
        driver.findElement(nikkonD5500DSLR).click();
    }

    public String getRelatedProduct_1_OfNikonD5500DSLR_title(){
        System.out.println(getText(nikkonD5500DSLR_Black));
        return getText(nikkonD5500DSLR_Black);
//        return driver.findElement(nikkonD5500DSLR_Black).getText();
    }

    public String getRelatedProduct_2_OfNikonD5500DSLR_title(){
        System.out.println(getText(nikkonD5500DSLR_Red));
        return getText(nikkonD5500DSLR_Red);
//        return driver.findElement(nikkonD5500DSLR_Red).getText();
    }

}
