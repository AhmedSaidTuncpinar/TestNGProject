package seleniumtestngproject.homework;




import org.junit.jupiter.api.Test;
import seleniumtestngproject.pages.TestLogin;

import seleniumtestngproject.utilities.ConfigReader;
import seleniumtestngproject.utilities.Driver;

public class LoginHomework {



    @Test
    public void loginTest(){

        Driver.getDriver().get(ConfigReader.getProperty("test_login_url"));

        TestLogin testLoginPage=new TestLogin();
        testLoginPage.loginTest().sendKeys("techproed");
        testLoginPage.loginTest().sendKeys("SuperSecretPassword");

    }
}
