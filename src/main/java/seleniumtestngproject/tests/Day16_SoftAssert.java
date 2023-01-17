package seleniumtestngproject.tests;


import org.junit.Test;
import org.testng.asserts.SoftAssert;


public class Day16_SoftAssert {
    @Test
    public void softAssertTest(){
        SoftAssert softAssert = new SoftAssert();

        System.out.println("Line 11 code");

        softAssert.assertEquals(3,5);
        System.out.println("Line 13 Code");
        softAssert.assertAll();
    }

}
