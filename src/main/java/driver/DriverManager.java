package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class DriverManager {

    //public WebDriver driver;
    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
    HashMap<String, Object> prefs = new HashMap<String, Object>();
    /**
     * This method is used to initialize the thradlocal driver on the basis of given
     * browser
     *
     * //@param //browser
     * @return this will return tldriver.
     */

    public WebDriver init_driver(String browser){

        System.out.println("Selected driver is " + browser);

        if (browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            String downloadPath = System.getProperty("user.dir")+"\\DownloadedFile\\";
            prefs.put("download.default_directory", downloadPath );
            options.setExperimentalOption("prefs", prefs);

            tlDriver.set(new ChromeDriver(options));

        } else if (browser.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            tlDriver.set(new EdgeDriver());
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            tlDriver.set(new FirefoxDriver());
        }else {
            System.out.println("Please select CHROME/EDGE/FIREFOX browser");
        }

        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        return getDriver();
    }

    /**
     * this is used to get the driver with ThreadLocal
     *
     * //@return
     */
    public static synchronized WebDriver getDriver(){
        return tlDriver.get();
    }

}
