package seleniumtestngproject.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import seleniumtestngproject.utilities.ConfigReader;
import seleniumtestngproject.utilities.Driver;

public class Day17_FirstDriverTest  {

    @Test
            public void firstDriverTest(){
        Driver.getDriver().get("https://techproeducation.com/");
        Driver.getDriver().get(ConfigReader.getProperty("url_test_techproed"));
        Assert.assertEquals(ConfigReader.getProperty("app_title"),Driver.getDriver().getTitle());
    }


}
