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

    @FindBy(css = "[aria-label='XS']")
    public List<WebElement> sizeXs;

    @FindBy(css = "[aria-label='S']")
    public List<WebElement> sizeS;

    @FindBy(css = "[aria-label='M']")
    public List<WebElement> sizeM;

    @FindBy(css = "[aria-label='L']")
    public List<WebElement> sizeL;

    @FindBy(css = "[aria-label='XL']")
    public List<WebElement> sizeXl;

    @FindBy(css = "[option-label='Black']")
    public List<WebElement> colorBlack;

    @FindBy(css = "[option-label='Blue']")
    public List<WebElement> colorBlue;

    @FindBy(css = "[option-label='Orange']")
    public List<WebElement> colorOrange;

    @FindBy(css = "[option-label='Green']")
    public List<WebElement> colorGreen;

    @FindBy(css = "[option-label='Red']")
    public List<WebElement> colorRed;

    @FindBy(css = "[option-label='Purple']")
    public List<WebElement> colorPurple;

    @FindBy(css = "[option-label='White]")
    public List<WebElement> colorWhite;

    @FindBy(css = "[option-label='Gray']")
    public List<WebElement> colorGray;

    @FindBy(css = "[option-label='Yellow']")
    public List<WebElement> colorYellow;

    @FindBy(css = "[title='Add to Cart']")
    public List<WebElement> addToCartBtn;

    @FindBy(css = "[class='product name product-item-name']")
    public List<WebElement> productItemName;

    @FindBy(css = "[aria-label='Size']")
    public List<WebElement> sizeSet;


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
