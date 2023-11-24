package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature",
        glue = {"src/test/java/stepDefinition", "src/test/java/utilityCommand"},
        plugin = {"pretty", "html:target/cucumber-html-report", "json:cucumber.json"}
)
public class testRunner {

}
