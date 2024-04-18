package SPAStepDefinition;

import Core.AppHelper;
import SearchPage.SynchronisePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static SPAStepDefinition.RegistrationStepDefinition.driver;

public class SynchroniseStepDefinition {
    SynchronisePage syp;
    @Given("user on SPA's dashboard")
    public void userOnSPASDashboard() {
        syp = new SynchronisePage(driver);
    }

    @When("synchronise the products")
    public void synchroniseTheProducts() {
        syp.syncProducts();
    }

    @And("synchronise the retailers")
    public void synchroniseTheRetailers() {
        syp.syncRetailers();
    }

    @And("synchronise the priority")
    public void synchroniseThePriority() {
        syp.syncPriority();
    }

    @And("synchronise the stock")
    public void synchroniseTheStock() {
        syp.syncStock();
    }

    @And("synchronise the trade")
    public void synchroniseTheTrade() {
        syp.syncTrade();
    }

    @And("synchronise the replace cause")
    public void synchroniseTheReplaceCause() {
        syp.syncRepCause();
    }

    @And("synchronise the product mrp")
    public void synchroniseTheProductMrp() {
        syp.syncProductMrp();
    }

    @And("synchronise the daily target")
    public void synchroniseTheDailyTarget() {
        syp.syncDailyTarget();
    }

    @Then("successfully synchronise all data")
    public void successfullySynchroniseAllData() {

        System.out.println("Successfully synchronise all data");

    }
}
