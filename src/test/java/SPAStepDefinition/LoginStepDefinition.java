package SPAStepDefinition;

import Core.AppHelper;
import SearchPage.LoginPage;


import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

import static SPAStepDefinition.RegistrationStepDefinition.driver;


public class LoginStepDefinition {
    LoginPage lp;

    @Given("user on SPA's login page")
    public void userOnSPASLoginPage() {
        lp = new LoginPage(driver);
    }

    @When("user enter valid {string} and {string}")
    public void userEnterValidAnd(String userid, String password) {

        lp.userInformation(userid, password);
    }

    @And("click login button")
    public void clickLoginButton() {
        AppHelper.getScreenshot("login credential");
        lp.clickLogin();
    }

    @Then("successfully open home page")
    public void successfullyOpenHomePage() {
        lp.getSuccessfulMsg();
        AppHelper.getScreenshot("login successfully");



    }
}

