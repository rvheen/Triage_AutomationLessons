package Day7_012423;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Day7_ReviewPart2 {
    public static void main(String[] args) throws InterruptedException {
//Requirement2
//I would like to validate all the descriptions of all the plans
//hint: for loop, webElement, getText
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.yahoo.com");
        List<WebElement> newsHighlights = driver.findElements(By.xpath("//*[@class='StretchedBox']"));

        for (int i = 0; i < newsHighlights.size(); i++) {
            System.out.println("News description for news story " + i + " is: " + newsHighlights.get(i).getText());
        }//end of for loop
        //quit the driver
        driver.quit();
    }//end of main
}//end of class
