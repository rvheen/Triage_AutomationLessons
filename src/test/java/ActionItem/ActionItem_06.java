package ActionItem;

import Reusable_Library.ReusableActions;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class ActionItem_06 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11105");

        //setup webDriver
        WebDriver driver = ReusableActions.chromeDriverSetup();

        for (int i = 0; i < zipCode.size(); i++) {
            //go to united healthcare page
            driver.navigate().to("https://www.uhc.com");
            //click on "Find a Doctor"
            ReusableActions.clickMethod(driver, "//*[text()= 'Find a doctor']", "Find a Doctor");
            //scroll to find dental providers
            ReusableActions.scrollByPixels(driver, "scroll(0,3000)");
            //click on Find a Dentist
            ReusableActions.clickMethod(driver, "//*[contains(text(), 'Find a dentist')]", "Find a Dentist");
            //switch to new tab
            ReusableActions.switchToTabByIndex(driver, 1);
            Thread.sleep(2000); //needed for Medicare Plans
            //click on Medicare Plans
            ReusableActions.clickMethod(driver, "//*[text()= 'Medicare Plans']", "Medicare Plans");
            //click on search bar
            ReusableActions.clickMethod(driver, "//*[@id= 'location']", "Search Bar");
            //enter zipCode in search bar
            ReusableActions.sendKeysMethod(driver, "//*[@id= 'location']", zipCode.get(i), "Enter zipCode");
            //click on first dropdown search
            ReusableActions.clickMethod(driver, "//*[@id= 'auto_0']", "Dropdown search");
            //click on Continue
            ReusableActions.clickMethod(driver, "//*[@type= 'submit']", "Continue");
            //click on No Preference
            ReusableActions.clickMethod(driver, "//*[text()= 'No Preference']", "No Preference");
            Thread.sleep(3000);
            driver.navigate().refresh();
            driver.navigate().refresh();
            //click on General Dentists
            Thread.sleep(3000);
            ReusableActions.clickMethod(driver, "//*[contains(text(), 'General Dentists')]", "General Dentists");
            //"//*[@class= 'sc-laZMeE ezvNmB']"
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(2000);
            //open dropdown and select Within 1 Mile
//            ReusableActions.selectByText(driver, "//*[@class= 'sc-hMXEoi ggqAuE ally-focus-within']", "Within 1 Mile", "Select Dropdown");
            //click on first dentist name link
            ReusableActions.clickByIndexMethod(driver, "//*[@class= 'sc-bDafuw cSCuUk providerName']", 0,"First Dentist Link");
            Thread.sleep(3000);
            String addressInfo = ReusableActions.getTextMethod(driver, "//*[@class= 'undefined adr']", "Address");
            System.out.println("The address is: " + addressInfo);
            String milesInfo = ReusableActions.getTextMethod(driver, "//*[@data-test-id= 'distance-away']", "Miles");
            System.out.println("The distance away is: " + milesInfo);
            //close the tab
            driver.close();
            //switch to first tab
            ReusableActions.switchToTabByIndex(driver, 0);

        }//end of for loop

        //quit the driver
        driver.quit();
    }//end of main
}//end of class
