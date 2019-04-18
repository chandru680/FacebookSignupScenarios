import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by Jeyachandran on 4/17/2019.
 * configuring the feature files and the step definitions(test steps) and for tiggering the test scenarios.
 */

@CucumberOptions(
        //format={"pretty","html:output/"},
        format = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber-report.json"},
        features = {"src/test/java/features/"},
        glue = {"stepdefinitions"}

)
public class TestRunner extends AbstractTestNGCucumberTests {
}
