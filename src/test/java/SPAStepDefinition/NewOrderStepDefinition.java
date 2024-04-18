package SPAStepDefinition;

import Core.AppHelper;
import SearchPage.NewOrderPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static SPAStepDefinition.RegistrationStepDefinition.driver;

public class NewOrderStepDefinition {
    NewOrderPage nop;
    @When("user click on menu button")
    public void userClickOnMenuButton() {
        nop = new NewOrderPage(driver);
        nop.clickOnMenuBar();
    }

    @And("click on new order")
    public void clickOnNewOrder() {
        nop.clickNewOrder();
    }

    @And("select retailer's name")
    public void selectRetailerSName() {
        nop.selectRetailer();
    }

    @And("fill the required information")
    public void fillTheRequiredInformation() {
        nop.chooseTradeOffer();
        nop.selectTradeProgram();
        nop.selectTradeSlab();
        nop.save();
        nop.chooseNoTradeOffer();
        nop.clickOrderDetails();
        AppHelper.getScreenshot("order details");
        nop.backOrderDetails();

    }

    @Then("successfully created new order")
    public void successfullyCreatedNewOrder() {
        System.out.println("Successfully create the new order");
    }
}
