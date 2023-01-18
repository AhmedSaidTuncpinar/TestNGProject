package seleniumtestngproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import seleniumtestngproject.utilities.Driver;

public class ZiyademLoginPage {
    public  ZiyademLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//i[@class='icon-user'])[2]")
    public WebElement loginIcon;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement loginButton;

    @FindBy(xpath = "//font[text()='Log out']")
    public WebElement logOut;






}
