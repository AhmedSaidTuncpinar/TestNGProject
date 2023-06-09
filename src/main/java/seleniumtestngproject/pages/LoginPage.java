package seleniumtestngproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import seleniumtestngproject.utilities.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[.='Bad credentials']")
    public WebElement errorMessage;


    @FindBy(xpath = "//div[@role='alert']")
    public WebElement emailErrorMessage;

}