package seleniumtestngproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import seleniumtestngproject.utilities.Driver;

public class OpenSourcePage {

   public OpenSourcePage(){
        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy(name="username")
    public WebElement userName;

   @FindBy(name="password")
    public WebElement password;

   @FindBy(xpath="//button[type='submit']")
    public WebElement submit;
}
