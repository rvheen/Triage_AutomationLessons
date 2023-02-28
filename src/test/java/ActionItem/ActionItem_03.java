package ActionItem;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionItem_03 {
    public static void main(String[] args) {
        //set up the chrome driver manager
        WebDriverManager.chromedriver().setup();
        //define the WebDriver for chrome driver
        WebDriver driver = new ChromeDriver();
        //navigate to bing homepage
        driver.navigate().to("https://www.bing.com");
        //enter the keyword sports on the search field
        //define the search field by name="q"
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("sports");
        //hit submit on bing search button
        //define the search button by id="search_icon" or class="search_svg"
        driver.findElement(By.xpath("//*[@class='search_svg']")).submit();
        //capture the search results using .getText() and only print out the search number
        //define the search results by id="b_tween" or class="sb_count"
        String results = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
        String[] arrayMessage = results.split(" ");
        System.out.println("The search number is " + arrayMessage[1]);

    }//end of main
}//end of class
