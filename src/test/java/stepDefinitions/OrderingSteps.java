package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.Parent;
import pages.US706_Content;
import utilities.ConfigReader;

import java.util.List;

public class OrderingSteps extends Parent {
    US706_Content cnt = new US706_Content();

    @And("Enter the valid credentials in the placeholders provided")
    public void enterTheValidCredentials() {
        cnt.mySendKeys(cnt.email, ConfigReader.getProperty("email"));
        cnt.mySendKeys(cnt.password, ConfigReader.getProperty("password"));
        cnt.myClick(cnt.signInBtn);
    }

    @When("Hover over the tab menu categories")
    public void hoverOverTheTabMenuCategories(DataTable links) {
        List<String> linkList = links.asList(String.class);
        for (int i = 0; i < linkList.size(); i++) {
            cnt.waitUntilVisibilityOf(cnt.getWebElement(linkList.get(i)));
            cnt.hoverOver(cnt.getWebElement(linkList.get(i)));
            cnt.wait(2);
        }
    }

    @And("Click on the element in content")
    public void clickOnTheProduct(DataTable links) {
        List<String> linkList = links.asList(String.class);
        for (int i = 0; i < linkList.size(); i++) {
            cnt.wait(2);
            cnt.waitUntilElementToBeClickable(cnt.getWebElement(linkList.get(i)));
            cnt.myJsClick(cnt.getWebElement(linkList.get(i)));
            cnt.wait(2);
        }
    }

    @And("Add the product to the cart by selecting size and color.")
    public void addTheProductToTheCartBySelectingSizeAndColor() {

        if (cnt.productSize.size() <= 5) {
            List<WebElement> listElements = cnt.productSize.subList(0, cnt.productSize.size());
            int range = Parent.randomGenerator(cnt.productColor.size());
            WebElement randomSize = listElements.get(range);
            cnt.waitUntilElementToBeClickable(randomSize);
            cnt.myJsClick(randomSize);
        }
        if (cnt.productColor.size() <= 3) {
            List<WebElement> listElements = cnt.productColor.subList(0, cnt.productColor.size());
            int range = Parent.randomGenerator(cnt.productColor.size());
            WebElement randomColor = listElements.get(range);
            cnt.waitUntilElementToBeClickable(randomColor);
            cnt.myJsClick(randomColor);
        }
        cnt.myJsClick(cnt.addToCartBtn);
        cnt.waitUntilVisibilityOf(cnt.shoppingCartText);
        Assert.assertTrue(cnt.shoppingCartText.isDisplayed(), "No message is present !");
    }

    @And("View the shopping cart and update the quantifies or remove a product if necessary")
    public void viewTheShoppingCartAndUpdate() {
        cnt.myClick(cnt.shoppingCart);
        cnt.myClick(cnt.viewCart);
        cnt.waitUntilVisibilityOf(cnt.quantity2);
        WebElement clearInput = cnt.quantity2;
        clearInput.clear();
        cnt.mySendKeys(cnt.quantity2, "3");
        cnt.waitUntilElementToBeClickable(cnt.updateShoppingCart);
        cnt.myClick(cnt.updateShoppingCart);
    }

    @And("Select the default address or enter a new one")
    public void selectTheDefaultAddress() {
        cnt.waitUntilElementToBeClickable(cnt.shipHereBtn);
        cnt.myClick(cnt.shipHereBtn);
    }

    @And("Check if the billing address matches the shipping address")
    public void checkTheBillingAndShippingAddress() {
        cnt.waitUntilVisibilityOf(cnt.sameShippingAndBillingAdd);
        cnt.myClick(cnt.sameShippingAndBillingAdd);
        Assert.assertTrue(cnt.sameShippingAndBillingAdd.isSelected(),
                "Please click the \"Check\" button if your shipping and billing addresses are the same!");
    }

    @Then("User should be able to see the confirmation message and the order number on the success page")
    public void confirmationMessage() {
        cnt.waitUntilVisibilityOf(cnt.confirmationMsg);
        Assert.assertTrue(cnt.confirmationMsg.isDisplayed());
        cnt.waitUntilVisibilityOf(cnt.orderNumMsg);
        Assert.assertTrue(cnt.orderNumMsg.getText().contains("Your order number is:"));
    }
}
