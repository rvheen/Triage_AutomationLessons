package Day13_021423_TestBase;

import Reusable_Library.ReusableActions;
import Reusable_Library.TestBase;
import org.testng.annotations.Test;

public class T1_Yahoo_Inheritance extends TestBase {
    //first test: search for a card
    @Test
    public void searchForACar() {
        driver.navigate().to("https://www.yahoo.com");
        ReusableActions.sendKeysMethod(driver, "//*[@name= 'p']", "cars", "Search Field");
        ReusableActions.clickMethod(driver, "//*[@id= 'ybar-search']", "Search Icon");
        String result = ReusableActions.getTextMethod(driver, "//*[@class= 'title mb-0']", "Search Results");
        System.out.println("Results: " + result);
    }//end of test 1
}//end of class
