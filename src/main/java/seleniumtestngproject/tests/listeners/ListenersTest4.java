package seleniumtestngproject.tests.listeners;

import org.junit.Assert;
import org.testng.annotations.Test;
import seleniumtestngproject.utilities.ConfigReader;
import seleniumtestngproject.utilities.Driver;

public class ListenersTest4 {
    @Test(retryAnalyzer = seleniumtestngproject.utilities.ListenersRetry.class)
    public void test1(){
        Driver.getDriver().get("https://techproeducation.com/");
        Assert.assertTrue(false);
    }
}
