package seleniumtestngproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import seleniumtestngproject.utilities.Driver;

public class XYZBankCustomerPage {
    public XYZBankCustomerPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "userSelect")
    public WebElement yourNameDropDown;





}

