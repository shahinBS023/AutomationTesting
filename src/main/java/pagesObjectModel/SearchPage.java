package pagesObjectModel;

import driver.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class SearchPage {
    WebDriver driver;
    public SearchPage(WebDriver driver){
        this.driver = driver;
    }

    JavascriptExecutor js = (JavascriptExecutor) driver;

    private By productTitleLink = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a");


    public void clickSearchedProduct(By pd){
        Actions actions = new Actions(driver);
        actions.moveToElement((WebElement) pd);
        actions.perform();
        driver.findElement(pd).click();
    }

    public boolean productFound(){
//        String pdXpath = "//a[text()='"+ pdName + "']";
//        System.out.println(pdXpath);
//        By productLink = By.xpath(pdXpath);
//        System.out.println(driver.findElement(productLink).isDisplayed());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        Actions actions = new Actions(driver);
//        actions.moveToElement((WebElement) productTitleLink);
//        actions.perform();

        //js.executeScript("arguments[0].scrollIntoView();", productTitleLink);
        return driver.findElement(productTitleLink).isDisplayed();
    }




}
