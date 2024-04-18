package SPAStepDefinition;

import Core.AppHelper;
import SearchPage.RegistrationPage;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;



public class RegistrationStepDefinition {
    public static AndroidDriver driver;
    RegistrationPage rp;
    @Given("user on SPA's registration page")
    public void userOnSPASRegistrationPage() throws MalformedURLException, InterruptedException {
        driver = AppHelper.appAutomation();
    }
    @When("user click on register button")
    public void userClickOnRegisterButton() {
        rp = new RegistrationPage(driver);
        rp.clickOnRegister();
        
    }

    @And("fill the required information {string} {string} and {string}")
    public void fillTheRequiredInformationAnd(String id, String pass, String mobile) {
        rp.requiredField(id, pass, mobile);
    }

    @Then("successfully created user registration")
    public void successfullyCreatedUserRegistration() {

        System.out.println("Successfully create user registration");
        AppHelper.getScreenshot("successfully registration");
    }


}
