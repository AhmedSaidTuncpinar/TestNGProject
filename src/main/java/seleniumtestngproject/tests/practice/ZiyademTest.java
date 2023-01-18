package seleniumtestngproject.tests.practice;

import org.junit.Assert;
import org.junit.Test;
import seleniumtestngproject.pages.ZiyademLoginPage;
import seleniumtestngproject.utilities.ConfigReader;
import seleniumtestngproject.utilities.Driver;
import seleniumtestngproject.utilities.ReusableMethods;

public class ZiyademTest {

   /*
        Given
            Go to https://www.ziyadem.de/
        When
            User click login
        And
            User enter username and password
            username: snbahar395@gmail.com
            password: Snbhr123!
       And
            User click login button
       Then
            Verify login successful

    */
ZiyademLoginPage ziyademLoginPage;

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("ziyadem_url"));

        ZiyademLoginPage ziyademLoginPage1=new ZiyademLoginPage();
        ReusableMethods.waitFor(2);
        ziyademLoginPage1.loginIcon.click();
        ziyademLoginPage1.userName.sendKeys(ConfigReader.getProperty("ziyadem_username"));
        ReusableMethods.waitFor(2);
        ziyademLoginPage1.password.sendKeys("Snbhr123!");
        ReusableMethods.waitFor(2);
        ziyademLoginPage1.loginButton.click();
        ReusableMethods.waitFor(2);
        ziyademLoginPage1.loginIcon.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(ziyademLoginPage1.logOut.isDisplayed());

    }

}
