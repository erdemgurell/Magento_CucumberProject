package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

import java.util.List;

public class US704_Content extends Parent {
    public US704_Content() {PageFactory.initElements(GWD.getDriver(), this);}

    @FindBy (xpath = "(//div[@id='store.menu']//ul)[1]/li") public WebElement tabMenu;
    @FindBy (xpath = "((//div[@id='store.menu']//ul)[1]/li)[1]") public WebElement whatsNew;
    @FindBy (xpath = "((//div[@id='store.menu']//ul)[1]/li)[2]") public WebElement women;
    @FindBy (xpath = "((//div[@id='store.menu']//ul)[1]/li)[3]") public WebElement men;
    @FindBy (xpath = "((//div[@id='store.menu']//ul)[1]/li)[4]") public WebElement gear;
    @FindBy (xpath = "((//div[@id='store.menu']//ul)[1]/li)[5]") public WebElement training;
    @FindBy (xpath = "((//div[@id='store.menu']//ul)[1]/li)[6]") public WebElement sale;
    @FindBy (xpath = "((//div[@id='store.menu']//ul)[1]/li)[2]/ul/li") public List<WebElement> womenTopsAndBottoms;
    @FindBy (xpath = "((//div[@id='store.menu']//ul)[1]/li)[3]/ul/li") public List<WebElement> menTopsAndBottoms;
    @FindBy (xpath = "((//div[@id='store.menu']//ul)[1]/li)[4]/ul/li") public List<WebElement> gearSubCategory;
    @FindBy (xpath = "((//div[@id='store.menu']//ul)[1]/li)[5]/ul/li") public WebElement trainingSubCat;
    @FindBy (xpath = "(((//div[@id='store.menu']//ul)[1]/li)[2]/ul/li/ul)[1]/li") public List<WebElement> womenTopsSubCat;
    @FindBy (xpath = "(((//div[@id='store.menu']//ul)[1]/li)[2]/ul/li/ul)[2]/li") public List<WebElement> womenBottomsSubCat;
    @FindBy (xpath = "(((//div[@id='store.menu']//ul)[1]/li)[3]/ul/li/ul)[1]/li") public List<WebElement> menTopsSubCat;
    @FindBy (xpath = "(((//div[@id='store.menu']//ul)[1]/li)[3]/ul/li/ul)[2]/li") public List<WebElement> menBottomsSubCat;

    public WebElement getWebElement(String strWebElement){

        switch (strWebElement){
            case "tabMenu"       : return this.tabMenu;
            case "whatsNew"      : return this.whatsNew;
            case "women"         : return this.women;
            case "men"           : return this.men;
            case "gear"          : return this.gear;
            case "training"      : return this.training;
            case "sale"          : return this.sale;
            case "trainingSubCat": return this.trainingSubCat;
        }
        return null;
    } public List<WebElement> getListElement(String strListElement){

        switch (strListElement){
            case "womenTopsAndBottoms" : return this.womenTopsAndBottoms;
            case "menTopsAndBottoms"   : return this.menTopsAndBottoms;
            case "gearSubCategory"     : return this.gearSubCategory;
            case "womenTopsSubCat"     : return this.womenTopsSubCat;
            case "womenBottomsSubCat"  : return this.womenBottomsSubCat;
            case "menTopsSubCat"       : return this.menTopsSubCat;
            case "menBottomsSubCat"    : return this.menBottomsSubCat;
        }
        return null;
    }
}
