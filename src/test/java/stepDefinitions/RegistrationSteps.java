package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Parent;
import pages.US701_Content;
import utilities.ConfigReader;
import utilities.GWD;

public class RegistrationSteps extends Parent {
    US701_Content us1 = new US701_Content();

    @Given("Navigate to Magento website")
    public void navigateToMagentoWebsite() {
        GWD.getDriver().get(ConfigReader.getProperty("URL"));
    }

    @When("Click on the Create an Account button")
    public void clickOnTheCreateAnAccountButton() {
        myClick(us1.createAccountBtn);
    }

    @Then("Fill the registration information")
    public void fillTheRegistrationInformation() {
        mySendKeys(us1.registrationForm.get(0), "Artam");
        mySendKeys(us1.registrationForm.get(1), "Soei");
        mySendKeys(us1.registrationForm.get(2), "lauro_oswaldzeye@delaware.ll");
        mySendKeys(us1.registrationForm.get(3), "UdBMm88gjg0");
        mySendKeys(us1.registrationForm.get(4), "UdBMm88gjg0");
    }

    @And("Click on the submit registration button")
    public void clickOnTheSubmitRegistrationButton() {
        myClick(us1.submitRegistrationBtn);
    }

    @And("User should see the success message")
    public void userShouldSeeTheSuccessMessage() {
        verifyContainsText(us1.accCreatedSuccessMessage, "Thank you");
    }
}
