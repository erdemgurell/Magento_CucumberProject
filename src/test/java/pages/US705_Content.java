package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

import java.util.List;

public class US705_Content extends Parent {

    public US705_Content() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[4]")
    public WebElement tableMen;

    @FindBy(xpath = "(//*[text()='Tops'])[2]")
    public WebElement subMenuTops;

    @FindBy(xpath = "(//*[text()='Jackets'])[2]")
    public WebElement subMenuJackets;

    @FindBy(xpath = "(//div[@aria-label='Size'])[1]/div")
    public List<WebElement> productSize1;

    @FindBy(xpath = "(//div[@aria-label='Size'])[2]/div")
    public List<WebElement> productSize2;

    @FindBy(xpath = "(//div[@aria-label='Size'])[3]/div")
    public List<WebElement> productSize3;

    @FindBy(xpath = "(//div[@aria-label='Size'])[4]/div")
    public List<WebElement> productSize4;

    @FindBy(xpath = "(//div[@aria-label='Size'])[5]/div")
    public List<WebElement> productSize5;

    @FindBy(xpath = "(//div[@aria-label='Size'])[6]/div")
    public List<WebElement> productSize6;

    @FindBy(xpath = "(//div[@aria-label='Size'])[7]/div")
    public List<WebElement> productSize7;

    @FindBy(xpath = "(//div[@aria-label='Size'])[8]/div")
    public List<WebElement> productSize8;

    @FindBy(xpath = "(//div[@aria-label='Size'])[9]/div")
    public List<WebElement> productSize9;

    @FindBy(xpath = "(//div[@aria-label='Size'])[10]/div")
    public List<WebElement> productSize10;

    @FindBy(xpath = "(//div[@aria-label='Size'])[11]/div")
    public List<WebElement> productSize11;

    @FindBy(xpath = "(//div[@aria-label='Color'])[1]/div")
    public List<WebElement> productColor1;

    @FindBy(xpath = "(//div[@aria-label='Color'])[2]/div")
    public List<WebElement> productColor2;

    @FindBy(xpath = "(//div[@aria-label='Color'])[3]/div")
    public List<WebElement> productColor3;

    @FindBy(xpath = "(//div[@aria-label='Color'])[4]/div")
    public List<WebElement> productColor4;

    @FindBy(xpath = "(//div[@aria-label='Color'])[5]/div")
    public List<WebElement> productColor5;

    @FindBy(xpath = "(//div[@aria-label='Color'])[6]/div")
    public List<WebElement> productColor6;

    @FindBy(xpath = "(//div[@aria-label='Color'])[7]/div")
    public List<WebElement> productColor7;

    @FindBy(xpath = "(//div[@aria-label='Color'])[8]/div")
    public List<WebElement> productColor8;

    @FindBy(xpath = "(//div[@aria-label='Color'])[9]/div")
    public List<WebElement> productColor9;

    @FindBy(xpath = "(//div[@aria-label='Color'])[10]/div")
    public List<WebElement> productColor10;

    @FindBy(xpath = "(//div[@aria-label='Color'])[11]/div")
    public List<WebElement> productColor11;

    @FindBy(css = "[title='Add to Cart']")
    public List<WebElement> addToCartBtn;

    @FindBy(css = "[class='product name product-item-name']")
    public List<WebElement> productItemName;

    @FindBy(css = "[aria-label='Size']")
    public List<WebElement> sizeSet;

    @FindBy(css = "[class='counter-number']")
    public WebElement productNumber;

    @FindBy(xpath = "(//span[@class='price'])[1]")
    public WebElement subTotal;

    @FindBy(css = "[class='minicart-price'] span")
    public List<WebElement> productPrice;


    public WebElement getWebElement(String elements) {
        switch (elements) {
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
