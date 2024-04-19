package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.Parent;
import pages.WishListPOM;
import utilities.ConfigReader;


public class WishListSteps extends Parent {

    WishListPOM us8 = new WishListPOM();

    @Then("Click on the Sign In button")
    public void clickOnTheSignInButton() {
        myClick(us8.signInBtn);
    }

    @And("Enter the email and password then click the login button")
    public void enterTheEmailAndPasswordThenClickTheLoginButton() {
        mySendKeys(us8.emailPlc, ConfigReader.getProperty("email"));
        mySendKeys(us8.passwordPlc, ConfigReader.getProperty("password"));
        myClick(us8.loginBtn);
    }


    @Then("Hover over on the Product and click Wish List button")
    public void hoverOverOnTheProductAndClickWishListButton() {
        WebElement e = us8.getWebElement("products");
        hoverOver(e);
        wait.until(ExpectedConditions.
                visibilityOf(us8.addToWLButtons.get(WishListPOM.rand)));
        myJsClick(us8.addToWLButtons.get(WishListPOM.rand));
    }

    @Then("Check if the number of products in the Wish List is correct")
    public void checkIfTheNumberOfProductsInTheWishListIsCorrect() {
        wait.until(ExpectedConditions.visibilityOf(us8.wlCounter));
        String splitted = us8.wlCounter.getText().
                replaceAll("[^0-9]", "");

        int wlSize = Integer.parseInt(splitted);
        Assert.assertEquals(wlSize, us8.wishlistProducts.size());
    }

    @Then("Hover over on the Product and click remove from list button")
    public void hoverOverOnTheProductAndClickRemoveFromListButton() {
        WebElement e = us8.getWebElement("wishlistProducts");
        hoverOver(e);
        wait.until(ExpectedConditions.
                visibilityOf(us8.removeItemButtons.get(0)));
        myJsClick(us8.removeItemButtons.get(0));
    }

    @And("Check if the item removed message displayed")
    public void checkIfTheItemRemovedMessageDisplayed() {
        Assert.assertTrue(us8.removedMessage.getText().contains("removed"));
    }

    @Then("Hover over on the Product and update the quantity to {string}")
    public void hoverOverOnTheProductAndUpdateTheQuantity(String qt) {
        WebElement e = us8.getWebElement("wishlistProducts");
        hoverOver(e);
        wait.until(ExpectedConditions.
                visibilityOf(us8.quantityPlaceholders.get(0)));
        mySendKeys(us8.quantityPlaceholders.get(0), qt);
        hoverOver(us8.wlCounter);
    }

    @Then("Check if the quantity of selected product changed")
    public void checkIfTheQuantityOfSelectedProductChanged() {
        WebElement e = us8.getWebElement("wishlistProducts");
        hoverOver(e);
        wait.until(ExpectedConditions.
                visibilityOf(us8.quantityPlaceholders.get(0)));
        Assert.assertEquals(us8.quantityPlaceholders.get(0).getAttribute("value"), "3");
    }
}
