package pagesObjectModel;

import driver.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class SearchPage {
    WebDriver driver;
    public SearchPage(WebDriver driver){
        this.driver = driver;
    }


    private By productTitleLink = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a");
    private By firstProduct = By.xpath("//a[text()='Apple iCam']");
    private By secondProduct = By.xpath("//a[text()='Flower Girl Bracelet']");
    private By wishlistBtn = By.xpath("//button[@class='button-2 add-to-wishlist-button']");


    public void clickSearchedProduct(By pd){
        Actions actions = new Actions(driver);
        actions.moveToElement((WebElement) pd);
        actions.perform();
        driver.findElement(pd).click();
    }

    public String productFound(){
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
        return driver.findElement(productTitleLink).getText();
    }

    public boolean verifyProduct(int n){
        boolean b=false;
        if (n==1){
            b = driver.findElement(firstProduct).isDisplayed();
        } else if (n==2) {
            b = driver.findElement(secondProduct).isDisplayed();
        }
        return b;
    }

    public void clickWishlistBtn(){
        driver.findElement(wishlistBtn).click();
    }


}
