package Steps;

import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.junit.Assume;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utility.ConfigReader;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class MyAppHook {
    private WebDriver driver;
    Properties prop;
    public ConfigReader configReader;
    public DriverManager driverManager;


    // Skip feature
    @Before(value = "@skip", order = 0)
    public void skipScenario(){
        Assume.assumeTrue(false);
    }

    @Before(value = "@download", order=1)
    public void deleteDownloadedFiles() throws IOException {
        String downloadedFilePath = System.getProperty("user.dir")+"\\DownloadedFile\\";
        File f = new File(downloadedFilePath);
        FileUtils.cleanDirectory(f);
    }

    @Before(order = 0)
    public void getProperty(){
            configReader = new ConfigReader();
            prop = configReader.init_prop();
    }

    @Before(order = 1)
    public void launchBrowser(){
        String browserName = prop.getProperty("browser");
        driverManager = new DriverManager();
        driver = driverManager.init_driver(browserName);
    }


    @After(order = 0)
    public void browserQuit(){
        driver.quit();
    }

    @After(order = 1)
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // take screenshot:
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcePath, "image/png", screenshotName);

        }
    }


}
