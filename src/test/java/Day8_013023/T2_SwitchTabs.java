package Day8_013023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class T2_SwitchTabs {
    public static void main(String[] args) throws InterruptedException {
        //setup your chromeDriver with webDriverManager
        WebDriverManager.chromedriver().setup();
        //declare chrome options
        //note that chrome options need to be defined before the webDriver
        ChromeOptions options = new ChromeOptions();
        //start maximized option
//        options.addArguments("start-fullscreen");
        //define the webDriver and pass the chrome options into the driver method
        WebDriver driver = new ChromeDriver(options);
        //go to fideliscare homepage page
        driver.navigate().to("https://www.fideliscare.org");
        //wait a bit
        Thread.sleep(2000);
        //click on shop a plan
        driver.findElement(By.xpath("//*[text() = 'Shop For a Plan']")).click();
        //wait a bit
        Thread.sleep(2000);
        //click on medicaid managed care
        driver.findElement(By.xpath("//*[text() = 'Medicaid Managed Care']")).click();
        //wait a bit
        Thread.sleep(2000);
        //click on find a doctor
        driver.findElement(By.xpath("//*[@class = 'btn btn-outline-primary btn-external btn-show link-external']")).click();
        //wait a bit
        Thread.sleep(2000);
        //new tab opens after clicking on find a doctor search button
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to the new tab, code tells java to switch over functions onto new tab
        driver.switchTo().window(tabs.get(1));
//        driver.switchTo().window(tabs.get(1));
        //wait 2 secs
        Thread.sleep(2000);
        //Enter a zip code
        driver.findElement(By.xpath("//*[@id = 'searchLocation']")).sendKeys("11230");
        //wait a bit
        Thread.sleep(2000);
        //close the new tab (find a doctor tab), the tab that was switchedTo
        driver.close();
        //switch back to the parent; without switching back it won't execute
        driver.switchTo().window(tabs.get(0));
//        driver.switchTo().window(tabs.get(0));
        //click on the search button on medicaid managed care (parent tab)
        driver.findElement(By.xpath("//*[contains(@class,'tool dropdown search')]")).click();
        //wait a bit
        Thread.sleep(2000);
        //quit the driver
        driver.quit();
    }//end of main
}//end of class
