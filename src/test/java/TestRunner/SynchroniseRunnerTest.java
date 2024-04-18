package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(tags = "@register or @login or @synchronise",
        features = {
                "src/test/resources/Features/"
        },

        glue = {"SPAStepDefinition"},
        monochrome = true,
        dryRun = false,
        plugin = {
                "pretty", "html:build/reports/synchroniseFeature.html"
        })

@Test
public class SynchroniseRunnerTest extends AbstractTestNGCucumberTests {


}
