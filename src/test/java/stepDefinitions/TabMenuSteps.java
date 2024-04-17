package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.Parent;
import pages.US704_Content;
import utilities.GWD;

import javax.tools.Tool;
import java.awt.*;
import java.util.List;

public class TabMenuSteps extends Parent {
    US704_Content cnt = new US704_Content();
    @When("Hover Over the Main and Sub Categories in the TAB Menu")
    public void hoverOverTheCategories(DataTable links) {
        List<String> linkList = links.asList(String.class);
        for (int i = 0; i < linkList.size(); i++) {
            WebElement linkWebElement = cnt.getWebElement(linkList.get(i));
            cnt.waitUntilVisibilityOf(linkWebElement);
            cnt.hoverOver(linkWebElement);
        }
    }
   @And("Click the Main categories in the TAB Menu")
   public void clickTheMainCategories(DataTable links) {

       List<String> linkList = links.asList(String.class);
       for (int i = 0; i < linkList.size(); i++) {
           WebElement linkWebElement = cnt.getWebElement(linkList.get(i));
           cnt.myClick(linkWebElement);
       }
   }

    @Then("User Should Be Able To See the All Categories")
    public void userShouldBeAbleToSeeTheAllCategories() {
    }
}
