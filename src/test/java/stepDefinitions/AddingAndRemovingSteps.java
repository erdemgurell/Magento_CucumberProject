package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.Parent;
import pages.US705_Content;

import java.util.List;

public class AddingAndRemovingSteps extends Parent {

    US705_Content us5=new US705_Content();
    @Given("Hoverover on the Element")
    public void hoveroverOnTheElement(DataTable dt) {
        List<String> list=dt.asList(String.class);
        for (int i = 0; i < list.size(); i++) {
            hoverOver(us5.getWebElement(list.get(i)));

        }

    }

    @And("Click on the Element")
    public void clickOnTheElement(DataTable dt) {
        List<String> list = dt.asList(String.class);

        for (int i = 0; i < list.size(); i++) {
            myJsClick(us5.getWebElement(list.get(i)));
        }
    }

    @And("Select Product Size, Color and Add to Cart")
    public void selectProductSizeColorAndAddToCart() {
        switch (us5.productItemName.get(randomGenerator(11)).getText()){
            case "Proteus Fitness Jackshirt":
                myClick(us5.sizeS.get(0));
                myClick(us5.colorBlue.get(0));
                myClick(us5.addToCartBtn.get(0));break;
            case "Montana Wind Jacket":
                myClick(us5.sizeM.get(1));
                myClick(us5.colorRed.get(0));
                myClick(us5.addToCartBtn.get(1));break;
            case "Jupiter All-Weather Trainer":
                myClick(us5.sizeL.get(2));
                myClick(us5.colorGreen.get(1));
                myClick(us5.addToCartBtn.get(2));break;
            case "Typhon Performance Fleece-lined Jacket":
                myClick(us5.sizeXl.get(3));
                myClick(us5.colorBlack.get(2));
                myClick(us5.addToCartBtn.get(3));break;
            case "Mars HeatTech™ Pullover":
                myClick(us5.sizeS.get(4));
                myClick(us5.colorOrange.get(1));
                myClick(us5.addToCartBtn.get(4));break;
            case "Taurus Elements Shell":
                myClick(us5.sizeS.get(5));
                myClick(us5.colorYellow.get(0));
                myClick(us5.addToCartBtn.get(5));break;
            case "Lando Gym Jacket":
                myClick(us5.sizeS.get(6));
                myClick(us5.colorGray.get(0));
                myClick(us5.addToCartBtn.get(6));break;
            case "Orion Two-Tone Fitted Jacket":
                myClick(us5.sizeS.get(7));
                myClick(us5.colorYellow.get(1));
                myClick(us5.addToCartBtn.get(7));break;
            case "Kenobi Trail Jacket":
                myClick(us5.sizeS.get(8));
                myClick(us5.colorPurple.get(0));
                myClick(us5.addToCartBtn.get(8));break;
            case "Hyperion Elements Jacket":
                myClick(us5.sizeS.get(9));
                myClick(us5.colorOrange.get(1));
                myClick(us5.addToCartBtn.get(9));break;
            case "Beaumont Summit Kit":
                myClick(us5.sizeS.get(10));
                myClick(us5.colorRed.get(5));
                myClick(us5.addToCartBtn.get(10));break;
        }

        wait(10);




    }
}
