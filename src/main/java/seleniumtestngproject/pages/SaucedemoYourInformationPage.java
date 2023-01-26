package seleniumtestngproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import seleniumtestngproject.utilities.Driver;

public class SaucedemoYourInformationPage {

    public SaucedemoYourInformationPage(){
        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(id ="first-name" )
    public WebElement firstName;

    @FindBy(id ="last-name" )
    public WebElement lastName;

    @FindBy(id ="postal-code" )
    public WebElement postalCode;

    @FindBy(id ="continue" )
    public WebElement continueButton;

    @FindBy(xpath = "//div[@class='summary_total_label']")
    public WebElement total;





}
