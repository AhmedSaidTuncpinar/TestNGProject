package seleniumtestngproject.tests;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import seleniumtestngproject.pages.HomePage;
import seleniumtestngproject.pages.LoginPage;
import seleniumtestngproject.utilities.ConfigReader;
import seleniumtestngproject.utilities.Driver;
import seleniumtestngproject.utilities.ReusableMethods;

import java.io.IOException;

public class Day19_NegativeLoginTest {

    HomePage homePage;
    LoginPage loginPage;
    Faker faker;
    @Test
    public void US100208_Negative_Login() throws IOException {

//        As customer, I should not be able to log in the application
        //going blue rental car home page
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
//        click on home page login link
        homePage = new HomePage();
        loginPage= new LoginPage();
        ReusableMethods.waitFor(3);
        homePage.homePageLoginLink.click();
//        sending credentials and clicking on login button
        ReusableMethods.waitFor(3);
//        Customer email: fake@bluerentalcars.com
//        Customer password: fakepass
        loginPage.emailInput.sendKeys("fake@bluerentalcars.com");
        ReusableMethods.waitFor(3);
        loginPage.passwordInput.sendKeys("fakepass");
        ReusableMethods.waitFor(3);
        loginPage.loginSubmitButton.click();
        ReusableMethods.waitFor(3);
//        Error: User with email fake@bluerentalcars.com not found
        String errorMessage = loginPage.errorMessage_incorrectEmailPass.getText();
        Assert.assertEquals(errorMessage,"User with email fake@bluerentalcars.com not found");
        ReusableMethods.getScreenshot("NegativeLoginScreenshot");
    }

    @Test
    public void invalidCredsTest() throws IOException {
//        As customer, I should not be able to log in the application
        //going blue rental car home page
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
//        click on home page login link
        homePage = new HomePage();
        loginPage= new LoginPage();
        ReusableMethods.waitFor(3);
        homePage.homePageLoginLink.click();
//        sending credentials and clicking on login button
        ReusableMethods.waitFor(3);
//        Customer email: fake@bluerentalcars.com
//        Customer password: fakepass
        faker=new Faker();
        String fakeEmail = faker.internet().emailAddress();
        loginPage.emailInput.sendKeys(fakeEmail);
        ReusableMethods.waitFor(3);
        loginPage.passwordInput.sendKeys(faker.internet().password(4,6));//fake pass 4-6 digit
        ReusableMethods.waitFor(3);
        loginPage.loginSubmitButton.click();
        ReusableMethods.waitFor(3);
//        Error: User with email fake@bluerentalcars.com not found
        String errorMessage = loginPage.errorMessage_incorrectEmailPass.getText();
        Assert.assertEquals(errorMessage,"User with email "+fakeEmail+" not found");
        ReusableMethods.getScreenshot("NegativeLoginScreenshot");
    }
}
