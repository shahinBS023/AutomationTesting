package pagesObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver){
        this.driver = driver;
    }
    private By firstProduct = By.xpath("//a[@class='product-name' and text()='Apple iCam']");
    private By secondProduct = By.xpath("//a[@class='product-name' and text()='Flower Girl Bracelet']");
    private By removeBtn = By.xpath("//button[@class='remove-btn']");

    public boolean hasFirstProduct(){
        return driver.findElement(firstProduct).isDisplayed();
    }

    public boolean hasSecondProduct(){
        return driver.findElement(secondProduct).isDisplayed();
    }

    public void clickRemoveBtn(){
        driver.findElement(removeBtn).click();
    }


}
