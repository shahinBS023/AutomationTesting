package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Steps"},
        glue = {"Steps"},
        plugin = {"pretty",
                "html:target/cucumber-report/nopCommerce-pretty.html",
                "json:target/cucumber-report/nopCommerce.json"
        }
)

public class MyTestRunner {

}
