package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(tags = "@register or @login",
        features = {
                "src/test/resources/Features/01_registerLogin.feature"
        },

        glue = {"SPAStepDefinition"},
        monochrome = true,
        dryRun = false,
        plugin = {
                "pretty", "html:build/reports/registrationAndLoginFeature.html"
        })

@Test
public class RegistrationLoginRunnerTest extends AbstractTestNGCucumberTests {


}
