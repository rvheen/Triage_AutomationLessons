package Day11_020723_ReusableActions;

import Reusable_Library.ReusableActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MetLifeTest {
    //public static void main(String[] args) {
    @Test
            public void MetLifeScenario() {
        //when you call a static method, you need to first call the Reusable class name -> static method name
        WebDriver driver = ReusableActions.chromeDriverSetup();
        driver.navigate().to("https://www.metlife.com");
        //click on solutions tab
        ReusableActions.clickByIndexMethod(driver, "//*[contains(text(), 'SOLUTIONS')]", 0, "Solutions Tab");
        //click on dental link
        ReusableActions.clickMethod(driver, "//*[text()= 'Dental']", "Dental Link");
        //click on search icon
        ReusableActions.clickMethod(driver, "//*[class= 'icon icon-search]", "Search Icon");
        //enter a value on search field
        ReusableActions.sendKeysMethod(driver, "//*[@id= 'searchInPage']", "doctor", "Search in Field");
        //click on search icon
        ReusableActions.clickMethod(driver, "//*[@class= 'search_location_image']", "Search Icon");
        //capture the search result but only print the result numbers
        String searchResult = ReusableActions.getTextMethod(driver, "//*[@class= 'search-count']", "Search Result Text");
        //split out the search count
        String [] arrayResult = searchResult.split("Search Results");
        System.out.println("My search count is " + arrayResult[1]);
        //quit the driver
        driver.quit();

    }//end of main
}//end of class
