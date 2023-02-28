package Day7_012423;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T3_WebElement_Mlcalc {
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
        //go to mlcalc page
        driver.navigate().to("https://www.mlcalc.com");
        //wait a bit
        Thread.sleep(2000);

        //we want to clear the default purchase price field first
        //same xpath for both clear and sendkeys
//        driver.findElement(By.xpath("//*[@id = 'ma']")).clear();
        //enter a new purchase price
//        driver.findElement(By.xpath("//*[@id = 'ma']")).sendKeys("675000");
        //(above code is the old approach)

        //clear and type in a new purchase price using webelement approach
        //delcare a variable for WebElement
        WebElement purchasePrice = driver.findElement(By.xpath("//*[@id = 'ma']"));
        purchasePrice.clear();
        purchasePrice.sendKeys("700000");

        //wait a bit
        Thread.sleep(3000);
        //quit driver
        driver.quit();
    }//end of main
}//end of class
