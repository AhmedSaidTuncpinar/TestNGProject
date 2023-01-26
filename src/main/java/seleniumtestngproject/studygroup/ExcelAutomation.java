package seleniumtestngproject.studygroup;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import seleniumtestngproject.pages.HomePage;
import seleniumtestngproject.pages.LoginPage;
import seleniumtestngproject.utilities.ConfigReader;
import seleniumtestngproject.utilities.Driver;
import seleniumtestngproject.utilities.ExcelUtils;
import seleniumtestngproject.utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

public class ExcelAutomation {



        HomePage homePage;
        LoginPage loginPage;

        ExcelUtils excelUtils;

        List<Map<String,String>> allData;

        public void login(){

            Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
            homePage = new HomePage();
            loginPage = new LoginPage();

            try{
                homePage.homePageLoginLink.click();
            }catch (Exception ignored){

            }

            try{
                homePage.userID.click();
                homePage.logoutLink.click();
                homePage.OK.click();
                homePage.homePageLoginLink.click();
            }catch (Exception ignored){

            }
        }

        @Test
        public void test(){

            String path =  "./src/test/java/resources/mysmoketestdata.xlsx";
            String sheet = "customer_info";

            excelUtils = new ExcelUtils(path, sheet);

            allData = excelUtils.getDataList();

            for (Map<String, String> w : allData){

                login();
                loginPage.email.sendKeys(w.get("username"));
                loginPage.password.sendKeys(w.get("password"));
                loginPage.loginButton.click();

                ReusableMethods.verifyElementDisplayed(homePage.userID);

            }


        }
        @AfterMethod
        public void tearDown(){
            Driver.closeDriver();
        }

    }

