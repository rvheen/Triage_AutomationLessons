package Reusable_Library;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.ILoggerFactory;

import java.io.File;
import java.util.ArrayList;

public class ReusableActions_Logger {

    //return method to initiate chromedriver for your test
    public static WebDriver chromeDriverSetup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-fullscreen"); //"start-fullscreen" for mac
        //options.addArguments("headless");
        //options.addArguments("incognito");
        //options.addArguments("--disable-notifications");
        //define my driver and call the chrome options conditions there
        WebDriver driver = new ChromeDriver(options);

        //at the end return the driver variable so it can be used on your test class
        return driver;
    }//end of chrome setup method

    //click is a void method which will just perform the action
    //parenthesis are initializers that call and send arguments, user defined name
    public static void clickMethod(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).click();
            logger.log(LogStatus.PASS, "Successfully clicked on " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to click on element " + elementName + " " + e);
            getScreenShot(driver, elementName, logger);
        }
    }//end of click method

    //click by index is a void method which will just perform the action
    public static void clickByIndexMethod(WebDriver driver, String xpath, int indexNumber, ExtentTest logger, String elementName) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(indexNumber).click();
            logger.log(LogStatus.PASS, "Successfully clicked by index on " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click by index on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to click by index on element " + elementName + " " + e);
        }
    }//end of click by index method

    //submit is a void method which will just perform the action
    public static void submitMethod(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).submit();
            logger.log(LogStatus.PASS, "Successfully submitted on " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to submit on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to submit on element " + elementName + " " + e);
        }
    }//end of submit method

//    public static void submitAction(WebDriver driver, String xpath, String elementName) {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        try {
//            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
//            element.submit();
//        } catch (Exception e) {
//            System.out.println("Unable to submit on element: " + elementName + " for reason: " + e);
//        }
//    }//end of submit action

    //sendKeys is a void method which will just perform the action
    public static void sendKeysMethod(WebDriver driver, String xpath, String userValue, ExtentTest logger, String elementName) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).sendKeys(userValue);
            logger.log(LogStatus.PASS, "Successfully entered value on " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to type on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to type on element " + elementName + " " + e);
        }
    }//end of sendKeys method

    //getText is a return method which returns the result to be used for further actions
    public static String getTextMethod(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        String result = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            //it's local to that try catch block
            result = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).getText();
            logger.log(LogStatus.PASS, "Successfully captured text on " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to capture text on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to capture text on element " + elementName + " " + e);
        }
        return result;
    }//end of getText method

    /*

/sendkeys is a void method which will just perform the type action
public static void sendKeysMethod(WebDriver driver, String xpath, String userValue, ExtentTest logger, String elementName){
    try{
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).sendKeys(userValue);
        logger.log(LogStatus.PASS,"Successfully enterd valued on " + elementName);
    }catch (Exception e) {
        System.out.println("Unable to type on element " + elementName + " " + e);
        logger.log(LogStatus.FAIL,"Unable to type on element " + elementName + " " + e);
    }
}//end of sendkeys method



//getText is a return method which will just perform the type action
public static String captureText(WebDriver driver, String xpath, ExtentTest logger, String elementName){
    String result = null;
    try{
        WebDriverWait wait = new WebDriverWait(driver,10);
        //it's local to that try catch block
        result = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).getText();
        logger.log(LogStatus.PASS,"Successfully captured text on " + elementName);

    }catch (Exception e) {
        System.out.println("Unable to type on element " + elementName + " " + e);
        logger.log(LogStatus.FAIL,"Unable to type on element " + elementName + " " + e);
    }

    return result;
}//end of getText method


    //click is a void method which will just perform the action
public static void submitMethod(WebDriver driver, String xpath, ExtentTest logger, String elementName){
    try{
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).submit();
        logger.log(LogStatus.PASS,"Successfully submitted on " + elementName);

    }catch (Exception e) {
        System.out.println("Unable to submit on element " + elementName + " " + e);
        logger.log(LogStatus.FAIL,"Unable to submit on element " + elementName + " " + e);
    }
}//end of submit method
    */

    //getText by index is a return method which returns the result to be used for further actions
    public static String getTextByIndexMethod(WebDriver driver, String xpath, int indexNumber, ExtentTest logger, String elementName) {
        String result = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            result = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(indexNumber).getText();
            logger.log(LogStatus.PASS, "Successfully captured text by index on " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to capture text by index on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to capture text by index on element " + elementName + " " + e);
        }
        return result;
    }//end of getText by index method

    //selectByText is a void method which will just perform the action
    public static void selectByText(WebDriver driver, String xpath, String selectValue, ExtentTest logger, String elementName) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement selectElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            Select dropDown = new Select(selectElement);
            dropDown.selectByVisibleText(selectValue);
            logger.log(LogStatus.PASS, "Successfully selected by text on " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to select by text on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to select by text on element " + elementName + " " + e);
        }
    }//end of selectByText method

    //switchToTabByIndex is a void method which will just perform the action
    public static void swsitchToTabByIndex(WebDriver driver, int tabNumber) {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabNumber));
    }//end of switchToTabByIndex method

    //scrollByPixels is a void method which will just perform the action
    public static void scrollByPixels(WebDriver driver, String scrollValue) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript(scrollValue);
    }//end of scrollByPixels method

    //scrollByElement is a void method which will just perform the action
    public static void scrollByElement(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement scrollElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            jse.executeScript("arguments[0].scrollIntoView(true);", scrollElement);
            logger.log(LogStatus.PASS, "Successfully scrolled to " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to scroll to element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to scroll to element " + elementName + " " + e);
        }
    }//end of scrollByElement method

    //mouseActions is a void method which will just perform the action
    public static void mouseHover(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement mouseElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            Actions mouseActions = new Actions(driver);
            mouseActions.moveToElement(mouseElement).perform();
            logger.log(LogStatus.PASS, "Successfully hovered over " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to hover over element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to hover over " + elementName + " " + e);
        }
    }//end of mouseHover method

    //screenShotMethod
    public static void getScreenShot(WebDriver driver, String imageName, ExtentTest logger) {
        try {
            String fileName = imageName + ".png";
            String directory = null;
            String snPath = null;
            directory = "src/main/java/HTML_Report/Screenshots/";
            snPath = "Screenshots//";
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File(directory + fileName));
            //String imgPath = directory + fileName;
            String image = logger.addScreenCapture(snPath + fileName);
            logger.log(LogStatus.FAIL, "", image);
        } catch (Exception e) {
            logger.log(LogStatus.FAIL, "Error Occurred while taking SCREENSHOT!!!");
            e.printStackTrace();
        }
    }//end of getScreenshot method

}//end of class
