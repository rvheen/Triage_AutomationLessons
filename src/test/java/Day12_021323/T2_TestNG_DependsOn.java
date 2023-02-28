package Day12_021323;

import Reusable_Library.ReusableActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class T2_TestNG_DependsOn {
    //define webDriver
    WebDriver driver;

    //define the prerequisites; before the whole test runs
    @BeforeSuite
    public void setChromeDriver() {
        driver = ReusableActions.chromeDriverSetup();
    }//end of setDriver method

    @Test
    public void tc001_searchForACar() {
        //fo ro google.com
        driver.navigate().to("https://www.google.com");
        //enter a car in the search field
        ReusableActions.sendKeysMethod(driver,"//*[@name= 'q']", "Benz", "Search Field");
        //hit submit on the google search button
        ReusableActions.submitMethod(driver, "//*[@name= 'btnK']", "Google Search Button");
    }//end of test 1

    @Test (dependsOnMethods = "tc001_searchForACar")
    //(priority = 2) same concept
    public void tc002_captureSearchResult() {
        String result = ReusableActions.getTextMethod(driver, "//*[@id= 'result-stats']", "Search Results");
        String[] arrayResult = result.split(" ");
        System.out.println("Result is " + arrayResult[1]);
    }//end of test 2

    @AfterSuite
    public void quitDriverSession() {
        driver.quit();
    }//end of quit driver

}//end of class
