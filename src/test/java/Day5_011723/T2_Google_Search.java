package Day5_011723;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_Google_Search {
    public static void main(String[] args) {
        //setup our chrome driver manager
        WebDriverManager.chromedriver().setup();

        //define your WebDriver for chrome driver
        WebDriver driver = new ChromeDriver();

        //navigate to google home page
        driver.navigate().to("https://www.google.com");

        //enter the keyword car on your search field
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");
        //allows you to find my xpath concept, its own formula
        //hit submit on google search button
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();

        //capture the search results using .getText() and only print out the search number
        String results = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        String[] arrayMessage = results.split(" ");
        System.out.println("Search Number is " + arrayMessage[1]);

        //quit the driver
//        driver.quit();

    }//end of main
}//end of class
