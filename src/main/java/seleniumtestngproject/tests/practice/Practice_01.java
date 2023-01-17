package seleniumtestngproject.tests.practice;

import org.junit.Test;
import seleniumtestngproject.utilities.ConfigReader;
import seleniumtestngproject.utilities.Driver;

public class Practice_01 {

    /*
    Given go to ziyadem_url

    When
    User click login

    And
    User enter username and password

    ahmtstcnpnr@gmail.com, As206920.

     */

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("ziyadem_url"));
    }

}
