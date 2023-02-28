package ActionItem;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class ActionItem_04_WhileLoop {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Bangladesh"); //index 0
        countries.add("Pakistan"); //index 1
        countries.add("India"); //index 2
        countries.add("Nepal"); //index 3
        //setup the chromedrivermanager
        WebDriverManager.chromedriver().setup();
        //declare chrome options
        ChromeOptions options = new ChromeOptions();
        //start chrome maximized and incognito
        //options.addArguments("start-fullscreen", "incognito");
        //define the webdriver and insert the chrome options into the driver method
        WebDriver driver = new ChromeDriver(options);

        //set the initializer first
        int i = 0;
        //define the end point in while command
        while (i < countries.size()) {

            //go to yahoo page
            driver.navigate().to("https://www.yahoo.com");
            //wait 2 seconds
            Thread.sleep(2000);
            //locate element for search field and type countries
            driver.findElement(By.xpath("//*[@name='p']")).sendKeys(countries.get(i));
            //submit on yahoo search button
            driver.findElement(By.xpath("//*[@id='ybar-search']")).submit();
            Thread.sleep(2000);
            //capture the search results
            String searchResult = driver.findElement(By.xpath("//*[@class = ' fz-14 lh-22']")).getText();
            //print out the search results text
            System.out.println("The search result text is " + searchResult);
            //split the original text
            String[] searchResultArray = searchResult.split(" ");
            //print out just the number from search results
            System.out.println("The search result number for " + countries.get(i) + " is " + searchResultArray[1]);
            Thread.sleep(2000);

            //define javascript executor to allow us to scroll
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            //scroll down 800 pixels to the About this page link
            jse.executeScript("scroll(0,2000)");
            Thread.sleep(2000);

            //click on About this page link
            driver.findElement(By.xpath("//*[text() = 'About this page']")).click();
            //capture and print out "Yahoo questions? Get 24/7 live" message
            String yahooQuestions = driver.findElement(By.xpath("//*[@id = 'announcementdiv']")).getText();
            System.out.println("The message is " + yahooQuestions);
        //call the incrementation
        i++;
        }//end of while loop
    }//end of main
}//end of class
