package pagesObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.lang.model.element.Element;
import java.util.concurrent.TimeUnit;

public class HomePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    private final By targetProduct = By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/h2/a");
    private final By loginUrl = By.xpath("//a[contains(@class,'ico-login')]");
    private final By logOutUrl = By.xpath("//a[contains(@class,'ico-logout')]");
    private final By wishlist = By.xpath("//span[@class='wishlist-label']");
    private final By myAccountUrl = By.xpath("//a[contains(@class,'ico-account')]");
    private final By searchBox = By.xpath("//*[@id='small-searchterms']");
    private final By searchBtn = By.xpath("//button[contains(@class,'search-box-button')]");
    private final By computerCategory = By.xpath("(//a[text()='Computers '])[1]");
    private final By noteBook = By.xpath("(//a[text()='Notebooks '])[1]");
    private final By noteBookHp = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[4]/div/div[1]/a/img");
    private final By electronicCategory = By.xpath("(//a[text()='Electronics '])[1]");
    private final By cameraAndPhotoCategory = By.xpath("(//a[text()='Camera & photo '])[1]");
    private final By shoppingCart = By.xpath("//span[@class='cart-label' and text()='Shopping cart']");



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
        driver.findElement(logOutUrl).click();
    }

    public void sendSearchProductName(String pdName){
        driver.findElement(searchBox).sendKeys(pdName);
    }
    public void clickSearchBtn(){
        driver.findElement(searchBtn).click();
    }

    public void performSearch(String pdName){
        driver.findElement(searchBox).sendKeys(pdName);
        driver.findElement(searchBtn).click();
    }

    public void hoverToComputer(){
        Actions action = new Actions(driver);
        // hover to element
        WebElement e = driver.findElement(computerCategory);
        action.moveToElement(e).perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void clickNotebook(){
        driver.findElement(noteBook).click();
    }

    public void clickWishlist(){
        driver.findElement(wishlist).click();
    }
    public void clickCameraCategory(){
        driver.findElement(cameraAndPhotoCategory).click();
    }

    public void clickHpNotebook(){
        // Scroll to a element
        WebElement e = driver.findElement(noteBookHp);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", e);
        e.click();
    }

    public void hoverToElectronics(){
        Actions action = new Actions(driver);
        // hover to element
        WebElement e = driver.findElement(electronicCategory);
        action.moveToElement(e).perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void clickShoppingCart(){
        driver.findElement(shoppingCart).click();
    }





}
