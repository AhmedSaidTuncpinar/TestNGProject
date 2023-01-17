package seleniumtestngproject.tests;

import org.testng.annotations.Test;
import seleniumtestngproject.pages.OpenSourcePage;
import seleniumtestngproject.utilities.ConfigReader;
import seleniumtestngproject.utilities.Driver;

public class Day17_OpenSourceLogin {


    @Test
    public void loginTest() throws InterruptedException{
        OpenSourcePage openSourcePage=new OpenSourcePage();

        Driver.getDriver().get("open_source_URL");
        openSourcePage.userName.sendKeys(ConfigReader.getProperty("open_source_admin_username"));
        openSourcePage.password.sendKeys(ConfigReader.getProperty("open_source_admin_password"));
        openSourcePage.submit.click();
    }
}
