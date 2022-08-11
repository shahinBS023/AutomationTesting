package pagesObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    private final By targetProduct = By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/h2/a");
    private final By loginUrl = By.xpath("//a[contains(@class,'ico-login')]");
    private final By logOutUrl = By.xpath("//a[contains(@class,'ico-logout')]");
    private final By myAccountUrl = By.xpath("//a[contains(@class,'ico-account')]");
    private final By searchBox = By.xpath("//*[@id='small-searchterms']");
    private final By searchBtn = By.xpath("//button[contains(@class,'search-box-button')]");

    public String getHomePageTitle(){
        return driver.getTitle();
    }

    public void clickProduct(){
        Actions actions = new Actions(driver);
        actions.moveToElement((WebElement) targetProduct);
        actions.perform();
        driver.findElement(targetProduct).click();
    }

    public void clickLoginUrl(){
        driver.findElement(loginUrl).click();
    }

    public void clickMyAccountUrl(){
        driver.findElement(myAccountUrl).click();
    }

    public void clickLogout(){
        driver.findElement(loginUrl).click();
    }

    public void sendSearchProductName(String pdName){
        driver.findElement(searchBox).sendKeys(pdName);
    }
    public void clickSearchBtn(){
        driver.findElement(searchBtn).click();
    }



}
