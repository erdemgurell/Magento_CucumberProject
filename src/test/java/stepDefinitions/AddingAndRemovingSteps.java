package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.Parent;
import pages.US705_Content;

import java.util.List;

public class AddingAndRemovingSteps extends Parent {

    US705_Content us5 = new US705_Content();

    @Given("Hoverover on the Element")
    public void hoveroverOnTheElement(DataTable dt) {
        List<String> list = dt.asList(String.class);
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
        for (int i = 0; i < 3; i++) {
            switch (us5.productItemName.get(randomGenerator(11)).getText()) {
                case "Proteus Fitness Jackshirt":
                    myClick(us5.productSize1.get(randomGenerator(5)));
                    myClick(us5.productColor1.get(randomGenerator(3)));
                    myClick(us5.addToCartBtn.get(0));
                    waitUntilElementToBeClickable(us5.addToCartBtn.get(0));
                    break;
                case "Montana Wind Jacket":
                    myClick(us5.productSize2.get(randomGenerator(5)));
                    myClick(us5.productColor2.get(randomGenerator(3)));
                    myClick(us5.addToCartBtn.get(1));
                    waitUntilElementToBeClickable(us5.addToCartBtn.get(1));
                    break;
                case "Jupiter All-Weather Trainer":
                    myClick(us5.productSize3.get(randomGenerator(5)));
                    myClick(us5.productColor3.get(randomGenerator(3)));
                    myClick(us5.addToCartBtn.get(2));
                    waitUntilElementToBeClickable(us5.addToCartBtn.get(2));
                    break;
                case "Typhon Performance Fleece-lined Jacket":
                    myClick(us5.productSize4.get(randomGenerator(5)));
                    myClick(us5.productColor4.get(randomGenerator(3)));
                    myClick(us5.addToCartBtn.get(3));
                    waitUntilElementToBeClickable(us5.addToCartBtn.get(3));
                    break;
                case "Mars HeatTech™ Pullover":
                    myClick(us5.productSize5.get(randomGenerator(5)));
                    myClick(us5.productColor5.get(randomGenerator(3)));
                    myClick(us5.addToCartBtn.get(4));
                    waitUntilElementToBeClickable(us5.addToCartBtn.get(4));
                    break;
                case "Taurus Elements Shell":
                    myClick(us5.productSize6.get(randomGenerator(5)));
                    myClick(us5.productColor6.get(randomGenerator(3)));
                    myClick(us5.addToCartBtn.get(5));
                    waitUntilElementToBeClickable(us5.addToCartBtn.get(5));
                    break;
                case "Lando Gym Jacket":
                    myClick(us5.productSize7.get(randomGenerator(5)));
                    myClick(us5.productColor7.get(randomGenerator(3)));
                    myClick(us5.addToCartBtn.get(6));
                    waitUntilElementToBeClickable(us5.addToCartBtn.get(6));
                    break;
                case "Orion Two-Tone Fitted Jacket":
                    myClick(us5.productSize8.get(randomGenerator(5)));
                    myClick(us5.productColor8.get(randomGenerator(3)));
                    myClick(us5.addToCartBtn.get(7));
                    waitUntilElementToBeClickable(us5.addToCartBtn.get(7));
                    break;
                case "Kenobi Trail Jacket":
                    myClick(us5.productSize9.get(randomGenerator(5)));
                    myClick(us5.productColor9.get(randomGenerator(3)));
                    myClick(us5.addToCartBtn.get(8));
                    waitUntilElementToBeClickable(us5.addToCartBtn.get(8));
                    break;
                case "Hyperion Elements Jacket":
                    myClick(us5.productSize10.get(randomGenerator(5)));
                    myClick(us5.productColor10.get(randomGenerator(3)));
                    myClick(us5.addToCartBtn.get(9));
                    waitUntilElementToBeClickable(us5.addToCartBtn.get(9));
                    break;
                case "Beaumont Summit Kit":
                    myClick(us5.productSize11.get(randomGenerator(5)));
                    myClick(us5.productColor11.get(randomGenerator(3)));
                    myClick(us5.addToCartBtn.get(10));
                    waitUntilElementToBeClickable(us5.addToCartBtn.get(10));
                    break;
            }
            wait(3);

        }

    }

    @And("Control of Product Price and Total Price")
    public void controlOfProductPriceAndTotalPrice() {


    }
}
