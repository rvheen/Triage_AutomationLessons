package Day14_022123;

import Reusable_Library.ReusableActions_Logger;
import Reusable_Library.TestBase;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class T1_Logger_GoogleSearch extends TestBase {
    @Test (priority = 1)
    public void SearchForBMW() {
        //navigate to google home page
        logger.log(LogStatus.INFO, "Navigate to google page");
        driver.navigate().to("https://www.google.com");
        //enter the keyword bmw on your search field
        ReusableActions_Logger.sendKeysMethod(driver, "//*[@name= 'q']", "BMW", logger, "Search Field");
        //submit on search button
        ReusableActions_Logger.submitMethod(driver, "//*[@name= 'btnK']", logger, "Google Search");
    }//end of test 1

    @Test(priority = 2)
    public void CaptureSearchResultsForBMW() {
        //capture the search results using getText() and only print out the search number
        String results = ReusableActions_Logger.getTextMethod(driver, "//*[@id= 'result-stats']", logger, "Search Results");
        //result-stat
        String[] arrayMessage = results.split(" ");
        System.out.println("Search number is " + arrayMessage[1]);
        logger.log(LogStatus.INFO, "Search Number is " + arrayMessage[1]);
    }//end of test 2
}
