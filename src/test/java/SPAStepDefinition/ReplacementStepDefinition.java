package SPAStepDefinition;

import Core.AppHelper;
import SearchPage.ReplacementPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static SPAStepDefinition.RegistrationStepDefinition.driver;

public class ReplacementStepDefinition {

    ReplacementPage rp;
    @Given("user on dashboard")
    public void userOnDashboard() {
        rp = new ReplacementPage(driver);
    }

    @When("user click menu button")
    public void userClickMenuButton() {
       rp.clickOnMenuBar();
    }

    @And("user click on replacement option")
    public void userClickOnReplacementOption() {
        rp.clickOnReplacement();
        rp.clickDotMenu();
        rp.selectRetailer();
    }

    @And("user on replace receive")
    public void userOnReplaceReceive() {
       rp.replacementDetails();
       rp.replaceReceive();
    }

    @And("replace adjustment")
    public void replaceAdjustment() {
        rp.replaceAdjustment();
    }

    @Then("successfully replace the products")
    public void successfullyReplaceTheProducts() {

        rp.orderSummary();
        AppHelper.stopRecording();
        driver.quit();
    }
}
