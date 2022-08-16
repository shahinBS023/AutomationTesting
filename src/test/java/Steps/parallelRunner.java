package Steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        plugin = {"pretty",
                "html:test-output/cucumber-report/nopCommerce-pretty.html",
                "json:test-output/cucumber-report/nopCommerce.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = true,
        glue = { "Steps" },
        features = { "src/test/resources/Steps" }

)


public class parallelRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
