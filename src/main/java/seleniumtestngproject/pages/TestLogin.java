package seleniumtestngproject.pages;

import org.junit.Assert;
import org.junit.Test;
import seleniumtestngproject.utilities.ConfigReader;
import seleniumtestngproject.utilities.Driver;

public class TestLogin {


        //    https://testcenter.techproeducation.com/index.php?page=form-authentication
//    Login the application by using page object model
    /*
    Given
        Go to https://testcenter.techproeducation.com/index.php?page=form-authentication
    When
        Type "techproed" into username input
    And
        Type "SuperSecretPassword" into password input
    And
        Click submit button
    Then
        Verify user singed in
     */
        @Test
        public void loginTest(){
//        Go to https://testcenter.techproeducation.com/index.php?page=form-authentication
            Driver.getDriver().get(ConfigReader.getProperty("test_login_url"));

//        Type "techproed" into "username" input
            TestLogin testLogin = new TestLogin();
            testLogin.loginTest().sendKeys("techproed");

//        Type "SuperSecretPassword" into password input
            testLogin.loginTest().sendKeys("SuperSecretPassword");

//        Click submit button
            testLogin.LoginSubmitButton.click();


//        Verify user singed in
            TestHomePage testHomePage = new TestHomePage();
            Assert.assertTrue(testHomePage.loginSuccessMessage.isDisplayed());

        }
    }


