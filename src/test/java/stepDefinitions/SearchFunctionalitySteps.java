package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.Parent;
import pages.US705_Content;
import pages.US707_Content;

public class SearchFunctionalitySteps extends Parent {

    US705_Content us5 = new US705_Content();
    US707_Content us7 = new US707_Content();

    @And("Select Product and Search by Code")
    public void selectProductAndSearchByCode() {
        myClick(us5.productNameLink.get(randomGenerator(11)));
        mySendKeys(us7.searchBoxPlc, us7.productCodeText.getText());
        myClick(us7.searchBoxCl);
    }

    @Then("The user must be able to see the product")
    public void theUserMustBeAbleToSeeTheProduct() {
        Assert.assertTrue(us7.productText.isDisplayed(), "Searched product not found");

    }

    @And("Over-Spelling of Product Code")
    public void overSpellingOfProductCode() {
        mySendKeys(us7.searchBoxPlc, "MJ01111");
        myClick(us7.searchBoxCl);
    }

    @Then("Your search returned no results.")
    public void yourSearchReturnedNoResults() {
        verifyContainsText(us7.noResultText, "no results.");
    }

    @And("Missing Product Code")
    public void missingProductCode() {
        mySendKeys(us7.searchBoxPlc, "MJ");
        myClick(us7.searchBoxCl);
    }

    @Then("Search Query Length")
    public void searchQueryLength() {
        verifyContainsText(us7.noResultText, "length is 3");
    }
}
