package ActionItem;

import Reusable_Library.ReusableActions;
import Reusable_Library.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ActionItem_07_TestCases extends TestBase {

    @Test (priority = 1)
    public void tc001_verifyForYourHome() throws InterruptedException {
        //navigate to nationwide webpage
        driver.navigate().to("https://www.nationwide.com");
        //click on Personal tab
        ReusableActions.clickMethod(driver, "//*[text()= 'Personal']", "Personal Tab");
        //click open "Insurance & protection" dropdown menu
        ReusableActions.clickMethod(driver, "//span[text()= 'Insurance & protection']", "Insurance & Protection");
        Thread.sleep(1000);
        //capture and print "For your home" list
        String forYourHome = ReusableActions.getTextMethod(driver, "//*[@class= 'columns medium-2']", "For Your Home");
        System.out.println("Test 1.0) The list of multiple types of home insurance are: " + forYourHome);
        //capture and print "For your ride" list
        String forYourRide = ReusableActions.getTextMethod(driver, "//*[@class= 'columns medium-5']", "For Your Ride");
        System.out.println("Test 1.1) The list of multiple types of vehicle insurance are: " + forYourRide);
        //capture and print "For life's many sides" list
        String forLifesManySides = ReusableActions.getTextByIndexMethod(driver, "//*[@class= 'columns medium-5']", 1, "For Life's Many Sides");
        System.out.println("Test 1.2) The list of multiple types of life insurance are: " + forLifesManySides);
    }//end of test 1

    @Test (priority = 2)
    public void tc002_verifyForBusinessTypes() throws InterruptedException {
        //click on Business tab
        ReusableActions.clickMethod(driver, "//*[text()= 'Business']", "Business Tab");
        //click open "Insurance & protection" dropdown menu
        ReusableActions.clickMethod(driver, "//span[text()= 'Insurance & protection']", "Insurance & Protection");
        Thread.sleep(1000);
        //capture and print "Small business types" list
        String smallBusinessTypes = ReusableActions.getTextMethod(driver, "//*[@class= 'columns medium-5']", "Small Business Types");
        System.out.println("Test 2.0) The list of multiple types of small business insurance are: " + smallBusinessTypes);
        //capture and print "Big business types" list
        String bigBusinessTypes = ReusableActions.getTextByIndexMethod(driver, "//*[@class= 'columns medium-5']", 1, "Big Business Types");
        System.out.println("Test 2.1) The list of multiple types of big business insurance are: " + bigBusinessTypes);
    }//end of test 2

    @Test (priority = 3)
    public void tc003_verifyHomeownersLink () throws InterruptedException {
        //click on Personal tab
        ReusableActions.clickMethod(driver, "//*[text()= 'Personal']", "Personal Tab");
        //click open "Insurance & protection" dropdown menu
        ReusableActions.clickMethod(driver, "//span[text()= 'Insurance & protection']", "Insurance & Protection");
        //click on Homeowners link
        ReusableActions.clickMethod(driver, "//*[text()= 'Homeowners']", "Homeowners link");
        //scroll down to "What we can cover"
        ReusableActions.scrollByElement(driver, "//*[contains(text(), 'What we can cover')]", "scroll to What we can cover");
        //click on "Explore coverages & options" button
        ReusableActions.clickMethod(driver, "//*[text()= 'Explore coverages & options']", "Explore coverages & options button");
        //capture and print "Homeowners insurance coverage" heading
        String homeownersCoverageHeading = ReusableActions.getTextMethod(driver, "//*[text()= 'Homeowners insurance coverage']", "Homeowners insurance coverage");
        System.out.println("Test 3) This page is for: " + homeownersCoverageHeading);
    }//end of test 3

    @Test (priority = 4)
    public void tc004_verifyBrandNewBelongingsLink() throws InterruptedException {
        driver.navigate().back();
        //scroll down to Brand New Belongings
        ReusableActions.scrollByElement(driver, "//*[contains(text(), 'Brand New Belongings')]", "Scroll to Brand New Belongings");
        //click on Get Brand New Belongings button
        ReusableActions.clickMethod(driver, "//*[text()= 'Get Brand New Belongings']", "Get Brand New Belongings button");
        //scroll down to and capture and print Brand New Belongings heading
        ReusableActions.scrollByElement(driver, "//*[text()= 'Brand New Belongings']", "Scroll to Brand New Belongings heading");
        String newBelongingsHeading = ReusableActions.getTextMethod(driver, "//*[text()= 'Brand New Belongings']", "Brand New Belongings");
        System.out.println("Test 4) This text is for: " + newBelongingsHeading);
    }//end of test 4

    @Test (priority = 5)
    public void tc005_verifySeeHowYouCanSaveLink() throws InterruptedException {
        driver.navigate().back();
        //scroll down to "Homeowners insurance discounts"
        ReusableActions.scrollByElement(driver, "//*[contains(text(), 'Homeowners insurance discounts')]", "Scroll to Homeowners insurance discounts");
        //click on "See how you can save" button
        ReusableActions.clickMethod(driver, "//*[text()= 'See how you can save']", "See how you can save button");
        //capture and print "Homeowners insurance discounts" heading
        String homeownersDiscountsHeading = ReusableActions.getTextMethod(driver, "//*[text()= 'Homeowners insurance discounts']", "Homeowners insurance discounts");
        System.out.println("Test 5) This page is for: " + homeownersDiscountsHeading);
    }//end of test 5

    @Test (priority = 6)
    public void tc006_verifyFloodInsurance() {
        //click open "Insurance & protection" dropdown menu
        ReusableActions.clickMethod(driver, "//span[text()= 'Insurance & protection']", "Insurance & Protection");
        //click on Flood link
        ReusableActions.clickMethod(driver, "//*[text()= 'Flood']", "Flood Insurance link");
        //capture and print "Flood insurance" heading
        String floodInsuranceHeading = ReusableActions.getTextMethod(driver, "//*[text()= 'Flood insurance']", "Flood insurance");
        System.out.println("Test 6) This page is for: " + floodInsuranceHeading);
    }//end of test 6

    @Test (priority = 7)
    public void tc007_verifyInsuranceForHome() throws InterruptedException {
        //click open "Insurance & protection" dropdown menu
        ReusableActions.clickMethod(driver, "//span[text()= 'Insurance & protection']", "Insurance & Protection");
        //click on Homeowners link
        ReusableActions.clickMethod(driver, "//*[text()= 'Homeowners']", "Homeowners link");
        //capture and print Homeowners heading
        String homeownersHeading = ReusableActions.getTextMethod(driver, "//*[text()= 'Homeowners insurance']", "Homeowners Insurance");
        System.out.println("Test 7.0) This page is for: " + homeownersHeading);

        //click open "Insurance & protection" dropdown menu
        ReusableActions.clickMethod(driver, "//span[text()= 'Insurance & protection']", "Insurance & Protection");
        //click on Renters link
        ReusableActions.clickMethod(driver, "//*[text()= 'Renters']", "Renters link");
        //capture and print Renters heading
        String rentersHeading = ReusableActions.getTextMethod(driver, "//*[text()= 'Renters insurance']", "Renters Insurance");
        System.out.println("Test 7.1) This page is for: " + rentersHeading);

        //click open "Insurance & protection" dropdown menu
        ReusableActions.clickMethod(driver, "//span[text()= 'Insurance & protection']", "Insurance & Protection");
        //click on Condo link
        ReusableActions.clickMethod(driver, "//*[text()= 'Condo']", "Condo link");
        //capture and print Condo heading
        String condoHeading = ReusableActions.getTextMethod(driver, "//*[text()= 'Condo insurance']", "Condo Insurance");
        System.out.println("Test 7.2) This page is for: " + condoHeading);
        Thread.sleep(2000);
    }//end of test 7

    @Test (priority = 8) //this code would've been easier separated between different tests
    public void tc008_verifyHomeownersQuote() throws InterruptedException {
        ArrayList <String> propertyType = new ArrayList<>();
        propertyType.add("Homeowners insurance");
        propertyType.add("Renters insurance");
        propertyType.add("Condo insurance");

        for (int i = 0; i < propertyType.size(); i++) {
            driver.navigate().to("https://www.nationwide.com/personal/insurance/homeowners/");
            //iterate arrayList through selectByText in dropdown
            ReusableActions.selectByText(driver, "//*[@name= 'concern']", propertyType.get(i), "Property Dropdown");
            Thread.sleep(1000);
            //iterate xpath of search bar by index for homeowners, renters, and condo
            ReusableActions.clickByIndexMethod(driver, "//*[@name= 'Zip1']", i, "click search bar");
            //iterate xpath of search bar for sendKeys zipCode 11102 for homeowners, renters, and condo
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@name= 'Zip1']"))).get(i).sendKeys("11102");
            //iterate xpath of button by index for homeowners, renters, and condo
            ReusableActions.clickByIndexMethod(driver, "//*[@name= 'Start your quote']", i, "Start your quote");
            //capture and print the top line of the form
            String quoteForm = ReusableActions.getTextMethod(driver, "//*[contains(text(), 'Smart')]", "Start of quote form");
            System.out.println("Test 8." + i + ") The start of the form says: " + quoteForm);
        }//end of for loop
    }//end of test 8

    @Test (priority = 9)
    public void tc009_verifyInfoOnHomeownersPage() {
        driver.navigate().to("https://www.nationwide.com/personal/insurance/homeowners/pages/coverage");
        //capture headings of bodies of text
        String basicCoverage = ReusableActions.getTextMethod(driver, "//*[text()= 'Basic homeowners insurance coverages']", "Basic homeowners insurance coverages");
        String newBelongings = ReusableActions.getTextMethod(driver, "//*[text()= 'Brand New Belongings']", "Brand New Belongs");
        String roofReplacement = ReusableActions.getTextMethod(driver, "//*[text()= 'Better Roof Replacement']", "Better Roof Replacement");
        String optionalCoverages = ReusableActions.getTextMethod(driver, "//*[text()= 'Optional homeowner insurance coverages']", "Optional homeowner insurance coverages");
        //print out headings of bodies of text
        System.out.println("Test 9) The headings of this page are: " + basicCoverage + " ; " + newBelongings + " ; " + roofReplacement + " ; " + optionalCoverages);
    }//end of test 9
}//end of class
