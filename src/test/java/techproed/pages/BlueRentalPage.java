package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class BlueRentalPage {
    public BlueRentalPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//a)[1]")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@type='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@id='dropdown-basic-button']")
    public WebElement getLoginButton2;

    @FindBy(xpath = "//*[.='Profile']")
    public WebElement profileButton;

    @FindBy(xpath = "//em")
    public WebElement profileMail;

    @FindBy(xpath = "(//*[.='Logout'])[1]")
    public WebElement LogOutButton;

    @FindBy(xpath = "//*[.='OK']")
    public WebElement okButton;
}
