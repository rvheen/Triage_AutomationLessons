package Day10_020623;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class T2_ImplicitWait_USPS {
    public static void main(String[] args) throws InterruptedException {
        //define the webdriver manager setup for chromedriver
        WebDriverManager.chromedriver().setup();
        //initialize chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-fullscreen");
        WebDriver driver = new ChromeDriver(options);
        //navigate to usps
        driver.navigate().to("https://www.usps.com");

        //implicitly wait for 5 seconds, for EVERY xpath (not individually), global wait and applies to all the elements
        //declared on top after driver.navigate()
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //hover over send tab
        //store the send tab element in a webelement variable
        WebElement sendTab = driver.findElement(By.xpath("//*[@id= 'mail-ship-width']"));
        //declare mouse actions
        Actions mouseActions = new Actions(driver);
        //move to the desired element (send tab), .perform() is needed for mouse actions
        mouseActions.moveToElement(sendTab).perform();

        //click on calculate a price using mouse click
        WebElement calcPrice = driver.findElement(By.xpath("//*[@class= 'tool-calc']"));
        //move to the calculate a price element then click on it
        mouseActions.moveToElement(calcPrice).click().perform();
        //can also be calcPrice.click(); without mouse actions

        //store usps home into webelement
        WebElement uspsHome = driver.findElement(By.xpath("//*[@alt = 'USPS.com home']"));
        //right click on the usps home logo
        mouseActions.moveToElement(uspsHome).contextClick().perform();
        //.contextClick() = right click

        //double click on usps home logo
        mouseActions.moveToElement(uspsHome).doubleClick().perform();
        //.doubleClick() = double click

        //quit the driver
        driver.quit();
    }//end of main
}//end of class
