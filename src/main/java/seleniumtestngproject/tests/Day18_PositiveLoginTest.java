package seleniumtestngproject.tests;

import org.junit.Test;
import seleniumtestngproject.pages.HomePage;
import seleniumtestngproject.pages.LoginPage;
import seleniumtestngproject.utilities.ConfigReader;
import seleniumtestngproject.utilities.Driver;
import seleniumtestngproject.utilities.ReusableMethods;

public class Day18_PositiveLoginTest {
    HomePage homePage;
    LoginPage loginPage;

    @Test
    public void US100201_Admin_Login() {

        //Going blue rental car home page
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

        //Click on home page login link
        homePage = new HomePage();
        loginPage = new LoginPage();

        homePage.homePageLoginLink.click();

        //Sending credentials and clicking on login button
        loginPage.email.sendKeys("jack@gmail.com");
        loginPage.password.sendKeys("12345");
        loginPage.loginButton.click();

        ReusableMethods.waitFor(3);
        ReusableMethods.verifyElementDisplayed(homePage.userID);

        Driver.closeDriver();
    }
}