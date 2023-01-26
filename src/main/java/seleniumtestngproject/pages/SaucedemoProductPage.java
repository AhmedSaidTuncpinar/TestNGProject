package seleniumtestngproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import seleniumtestngproject.utilities.Driver;

public class SaucedemoProductPage {
    public SaucedemoProductPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement cart;

    @FindBy(xpath = "//button[@data-test='checkout']")
    public WebElement checkOut;
}
