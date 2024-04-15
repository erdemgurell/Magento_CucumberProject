package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.Parent;
import utilities.ConfigReader;
import utilities.GWD;

public class RegistrationSteps extends Parent {
    @Given("Navigate to Magento website")
    public void navigateToMagentoWebsite() {
        GWD.getDriver().get(ConfigReader.getProperty("URL"));
    }
}
