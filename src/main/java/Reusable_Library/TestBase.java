package Reusable_Library;

import Reusable_Library.ReusableActions;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class TestBase {

    //define the WebDriver
    //WebDriver variable needs to get inherited to your test class but in order to do that it must be public static
    public static WebDriver driver;
    public static ExtentReports reports;
    public static ExtentTest logger;


    //define the prerequisites
    @BeforeSuite
    public void setChromeDriver() {
        driver = ReusableActions.chromeDriverSetup();
        //set the Extent Report path here
        reports = new ExtentReports("src/main/java/HTML_Report/Automation_Report.html", true);
    }//end of before suite

    //we will use before method annotation to capture the name of each @Test to your html report
    @BeforeMethod
    public void getTestName(Method testName) {
        logger = reports.startTest(testName.getName());
    }//end of before method

    //we will use after method to end the logger/print statement for each of your @Test method
    @AfterMethod
    public void endLoggerPerTest() {
        reports.endTest(logger);
    }//end of after method

    @AfterSuite
    public void quitDriverSession() {
        driver.quit();
        //write back to the report
        reports.flush();
    }//end of after suite

}//end of class
