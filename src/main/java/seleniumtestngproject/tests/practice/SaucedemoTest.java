package seleniumtestngproject.tests.practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import seleniumtestngproject.pages.SaucedemoLoginPage;
import seleniumtestngproject.pages.SaucedemoProductPage;
import seleniumtestngproject.pages.SaucedemoYourInformationPage;
import seleniumtestngproject.utilities.ConfigReader;
import seleniumtestngproject.utilities.Driver;
import seleniumtestngproject.utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class SaucedemoTest {
SaucedemoLoginPage saucedemoLoginPage;
SaucedemoProductPage saucedemoProductPage;
    /*
  Given
    Go to  https://www.saucedemo.com/
  When
    Enter the username  as "standard_user"
  And
    Enter the password as "secret_sauce"
  And
    Click on login button
  Then
    Assert that total price of all products is 129.94 dollars
  And
    Flash each web element you used
   */

    @Test
    public void test01() {
        SaucedemoLoginPage saucedemoLoginPage1=new SaucedemoLoginPage();
        SaucedemoProductPage saucedemoProductPage1=new SaucedemoProductPage();
        SaucedemoYourInformationPage saucedemoYourInformationPage=new SaucedemoYourInformationPage();

        Driver.getDriver().get(ConfigReader.getProperty("saucedemo_url"));
        ReusableMethods.waitFor(2);
        saucedemoLoginPage1.userName.sendKeys(ConfigReader.getProperty("saucedemo_username"));
        ReusableMethods.waitFor(2);
        saucedemoLoginPage1.password.sendKeys(ConfigReader.getProperty("saucedemo_password"));
        ReusableMethods.waitFor(2);
        saucedemoLoginPage1.loginButton.click();

        List<WebElement> addAllCart= Driver.getDriver().
                findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));

        for (WebElement w:addAllCart)
            w.click();

        saucedemoProductPage1.cart.click();
        saucedemoProductPage1.checkOut.click();
        ReusableMethods.waitFor(2);
        saucedemoYourInformationPage.firstName.sendKeys("Ahmed");
        saucedemoYourInformationPage.lastName.sendKeys("Pinar");
        saucedemoYourInformationPage.postalCode.sendKeys("26250");
        saucedemoYourInformationPage.continueButton.click();

        String totall= saucedemoYourInformationPage.total.getText();

        Assert.assertTrue(saucedemoYourInformationPage.total.isDisplayed());

    }
}
