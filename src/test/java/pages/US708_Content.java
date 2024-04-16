package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

import java.util.List;

public class US708_Content {
    public static int rand = 0;

    public US708_Content() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Sign In")
    public WebElement signInBtn;

    @FindBy(css = "button[class=\"action login primary\"]")
    public WebElement loginBtn;

    @FindBy(id = "email")
    public WebElement emailPlc;

    @FindBy(css = "input[title=\"Password\"]")
    public WebElement passwordPlc;

    @FindBy(css = "div[class=\"products-grid wishlist\"] li")
    public List<WebElement> wishlistProducts;

    @FindBy(css = "a[title=\"Add to Wish List\"]")
    public List<WebElement> addToWLButtons;

    @FindBy(css = "ol[class=\"products list items product-items\"] li")
    public List<WebElement> products;

    @FindBy(css = "div[class=\"block-title\"] span[data-bind=\"text: wishlist().counter\"]")
    public WebElement wlCounter;

    @FindBy(xpath = "(//*[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[4]")
    public WebElement tableMen;

    @FindBy(xpath = "(//*[text()='Tops'])[2]")
    public WebElement subMenuTops;

    @FindBy(xpath = "(//*[text()='Jackets'])[2]")
    public WebElement subMenuJackets;

    public WebElement getWebElement(String elements) {
        int size = products.size();
        int randNum = Parent.randomGenerator(size);
        rand = randNum;

        switch (elements) {
            case "products":
                return this.products.get(randNum);
            case "tableMen":
                return this.tableMen;
            case "subMenuTops":
                return this.subMenuTops;
            case "subMenuJackets":
                return this.subMenuJackets;
        }

        return null;
    }


}
