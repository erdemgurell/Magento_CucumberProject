package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

public class US702_Content extends Parent{
    public US702_Content() {PageFactory.initElements(GWD.getDriver(),this);}
    @FindBy(linkText = "Sign In")
    public WebElement signInLink;

    @FindBy(id="email")
    public WebElement email;

    @FindBy(css="[name='login[password]']")
    public WebElement password;

    @FindBy(css="button[class='action login primary']")
    public WebElement signInBtn;


}
