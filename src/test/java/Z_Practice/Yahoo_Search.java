package Z_Practice;

import com.relevantcodes.extentreports.ExtentReports;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Search {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.yahoo.com");
        driver.findElement(By.xpath("//*[@id='root_5']")).click();

        String results = driver.findElement(By.xpath("//*[@id='ntk-title']")).getText();
        String[] arrayMessage = results.split(" ");
        System.out.println("The tab is titled " + arrayMessage[0]);
    }//end of main
}//end of class