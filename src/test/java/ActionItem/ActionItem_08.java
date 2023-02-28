package ActionItem;

import Reusable_Library.ReusableActions;
import Reusable_Library.ReusableActions_Logger;
import Reusable_Library.TestBase;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class ActionItem_08 extends TestBase {

    @Test
    public void tc001_addToBag() throws InterruptedException {
        driver.navigate().to("https://www.express.com");
        ReusableActions_Logger.mouseHover(driver, "//*[text()= 'Men']", logger, "Men's Tab");
        Thread.sleep(1000);
        ReusableActions_Logger.clickMethod(driver, "//*[text()= 'All Shirts']", logger, "All Shirts");
        ReusableActions_Logger.clickByIndexMethod(driver, "//*[@class='x1Y39']", 0, logger, "First Shirt");
        ReusableActions_Logger.clickMethod(driver, "//*[text()= 'L']", logger, "Size L");
        ReusableActions_Logger.scrollByElement(driver, "//*[text()= 'Add to bag']", logger, "Scroll to Add To Bag");
        Thread.sleep(1000);
        ReusableActions_Logger.clickMethod(driver, "//*[text()= 'Add to bag']", logger, "Add To Bag");
        ReusableActions_Logger.clickMethod(driver, "//*[text()= 'View Bag']", logger, "View Bag");
    }//end of test 1

    @Test (dependsOnMethods = "tc001_addToBag")
    public void tc002_checkoutItem() throws InterruptedException {
       ReusableActions_Logger.selectByText(driver, "//*[@id= 'qdd-0-quantity']", "2", logger, "Quantity Dropdown");
       Thread.sleep(1000);
       ReusableActions_Logger.clickMethod(driver, "//*[text()= 'Checkout']", logger, "Checkout");
       ReusableActions_Logger.clickMethod(driver, "//*[text()= 'Checkout as Guest']", logger, "Checkout as Guest");
    }//end of test 2

    @Test (dependsOnMethods = "tc002_checkoutItem")
    public void tc003_enterContactInfo() throws InterruptedException {
        ReusableActions_Logger.sendKeysMethod(driver, "//*[@id= 'contact-information-firstname']", "Ruheen", logger, "First Name");
        ReusableActions_Logger.sendKeysMethod(driver, "//*[@id= 'contact-information-lastname']", "Haque", logger, "Last Name");
        ReusableActions_Logger.sendKeysMethod(driver, "//*[@id= 'contact-information-email']", "rvheen@gmail.com", logger, "Email Address");
        ReusableActions_Logger.sendKeysMethod(driver, "//*[@id= 'contact-information-confirmemail']", "rvheen@gmail.com", logger, "Confirm Email Address");
        ReusableActions_Logger.sendKeysMethod(driver, "//*[@id= 'contact-information-phone']", "3475923296", logger, "Phone Number");
        ReusableActions_Logger.clickMethod(driver, "//*[text()= 'Save & Continue']", logger, "Save & Continue");
    }//end of test 3

    @Test (dependsOnMethods = "tc003_enterContactInfo")
    public void tc004_enterShippingInfo() {
        ReusableActions_Logger.sendKeysMethod(driver, "//*[@id= 'shipping.line1']", "3019 23rd Street", logger, "Street Address");
        ReusableActions_Logger.sendKeysMethod(driver, "//*[@id= 'shipping.line2']", "Apt 2nd Floor", logger, "Apartment Number");
        ReusableActions_Logger.sendKeysMethod(driver, "//*[@id= 'shipping.postalCode']", "11102", logger, "Zipcode");
        ReusableActions_Logger.sendKeysMethod(driver, "//*[@id= 'shipping.city']", "Astoria", logger, "City");
        ReusableActions_Logger.selectByText(driver, "//*[@name= 'shipping.state']", "NY", logger, "State");
        ReusableActions_Logger.clickMethod(driver, "//*[text()= 'Save & Continue']", logger, "Save & Continue");
        String contactInfo = ReusableActions_Logger.getTextMethod(driver, "//*[@class= 'TvyqT']", logger, "Contact Info");
        String shippingAddress = ReusableActions_Logger.getTextMethod(driver, "//*[@class= 'uRsTd']", logger, "Shipping Address");
        String billingAddress = ReusableActions_Logger.getTextByIndexMethod(driver, "//*[@class= 'uRsTd']", 1, logger, "Billing Address");
        System.out.println("The contact information is: " + contactInfo);
        System.out.println("The shipping address is: " + shippingAddress);
        System.out.println("The billing address is: " + billingAddress);
        logger.log(LogStatus.INFO, "The contact information is: " + contactInfo);
        logger.log(LogStatus.INFO, "The shipping address is: " + shippingAddress);
        logger.log(LogStatus.INFO, "The billing address is: " + billingAddress);
    }//end of test 4
}//end of class