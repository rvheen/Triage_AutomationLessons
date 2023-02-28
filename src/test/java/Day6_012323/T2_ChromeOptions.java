package Day6_012323;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T2_ChromeOptions {
    public static void main(String[] args) {
        //setup your chromedrivermanager
        WebDriverManager.chromedriver().setup();
        //declare chrome options
        //note that chrome options need to be defined before the webDriver
        ChromeOptions options = new ChromeOptions();
        //start maximized option
//        options.addArguments("start-maximized");
        //for mac use start fullscreeen if fullscreen does not work then use:
        //options.addArguments("start-fullscreen");
        //if you're using mac and start-fullscreen does not work then use "--kiosk"
//        options.addArguments("--kiosk");
        //start in incognito option
//        options.addArguments("incognito");
        //can run both on the same  line
        options.addArguments("start-fullscreen", "incognito");
        //headless option (you don't see the browser, but it will run your tests on the browser in the background)
//        options.addArguments("headless");
        //define the webDriver, and pass the chrome options into the driver method
        WebDriver driver = new ChromeDriver(options);
        //go to google page
        driver.navigate().to("https://www.google.com");
        //locate element for search field and type cars
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");
        //submit on google search button
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();
        //capture the search result and print it
        String searchResult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        System.out.println("Result search text is " + searchResult);
        //split the original text
        String[] searchResultArray = searchResult.split(" ");
        System.out.println("Result Search Number is " + searchResultArray[1]);
        //quit driver
        //driver.quit()
    }//end of main
}//end of class
