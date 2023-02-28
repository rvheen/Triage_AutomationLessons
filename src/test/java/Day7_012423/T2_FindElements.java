package Day7_012423;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T2_FindElements {
    public static void main(String[] args) throws InterruptedException {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //declare chrome options
        //note that chrome options need to be defined before the webDriver
        ChromeOptions options = new ChromeOptions();
        //start maximized option
//        options.addArguments("start-fullscreen");
        //define the webDriver, and pass the chrome options into the driver method
        WebDriver driver = new ChromeDriver(options);
        //go to yahoo page
        driver.navigate().to("https://www.yahoo.com");
        //wait 1 second
        Thread.sleep(1000);
        //click on the entertainment button
        //findElements can find using the correct index if multiple search results
        //with contains can use piece of text so 'tainment' works as well
        driver.findElements(By.xpath("//*[contains(text(), 'Entertainment')]")).get(2).click();
//        driver.findElements(By.xpath("//*[contains(@class, 'rapid-noclick-resp')]")).get(5).click();
        //wait 3 seconds
        Thread.sleep(3000);
        //quit driver
        driver.quit();
    }//end of main
}//end of class
