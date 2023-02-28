package Reusable_Library;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;

public class ReusableActions {

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
    public static void clickMethod(WebDriver driver, String xpath, String elementName) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
        }
    }//end of click method

    //click by index is a void method which will just perform the action
    public static void clickByIndexMethod(WebDriver driver, String xpath, int indexNumber, String elementName) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(indexNumber).click();
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
        }
    }//end of click by index method

    //submit is a void method which will just perform the action
    public static void submitMethod(WebDriver driver, String xpath, String elementName) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).submit();
        } catch (Exception e) {
            System.out.println("Unable to submit on element " + elementName + " " + e);
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
    public static void sendKeysMethod(WebDriver driver, String xpath, String userValue, String elementName) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).sendKeys(userValue);
        } catch (Exception e) {
            System.out.println("Unable to type on element " + elementName + " " + e);
        }
    }//end of sendKeys method

    //getText is a return method which returns the result to be used for further actions
    public static String getTextMethod(WebDriver driver, String xpath, String elementName) {
        String result = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            //it's local to that try catch block
            result = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).getText();
        } catch (Exception e) {
            System.out.println("Unable to get text on element " + elementName + " " + e);
        }
        return result;
    }//end of getText method

    //getText by index is a return method which returns the result to be used for further actions
    public static String getTextByIndexMethod(WebDriver driver, String xpath, int indexNumber, String elementName) {
        String result = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            result = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(indexNumber).getText();
        } catch (Exception e) {
            System.out.println("Unable to get text by index on element " + elementName + " " + e);
        }
        return result;
    }//end of getText by index method

    //selectByText is a void method which will just perform the action
    public static void selectByText(WebDriver driver, String xpath, String selectValue, String elementName) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement selectElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            Select dropDown = new Select(selectElement);
            dropDown.selectByVisibleText(selectValue);
        } catch (Exception e) {
            System.out.println("Unable to select by text on element " + elementName + " " + e);
        }
    }//end of selectByText method

    //switchToTabByIndex is a void method which will just perform the action
    public static void switchToTabByIndex(WebDriver driver, int tabNumber) {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabNumber));
    }//end of switchToTabByIndex method

    //scrollByPixels is a void method which will just perform the action
    public static void scrollByPixels(WebDriver driver, String scrollValue) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript(scrollValue);
    }//end of scrollByPixels method

    //scrollByElement is a void method which will just perform the action
    public static void scrollByElement(WebDriver driver, String xpath, String elementName) {
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement scrollElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            jse.executeScript("arguments[0].scrollIntoView(true);", scrollElement);
        } catch (Exception e) {
            System.out.println("Unable to scroll to element " + elementName + " " + e);
        }
    }//end of scrollByElement method

    //mouseActions is a void method which will just perform the action
    public static void mouseHover(WebDriver driver, String xpath, String elementName) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement mouseElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            Actions mouseActions = new Actions(driver);
            mouseActions.moveToElement(mouseElement).perform();
        } catch (Exception e) {
            System.out.println("Unable to hover over element " + elementName + " " + e);
        }
    }//end of mouseHover method

}//end of class
