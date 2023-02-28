package Z_Practice;

import Reusable_Library.ReusableActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Scroll_ReusableTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = ReusableActions.chromeDriverSetup();
        driver.navigate().to("https://www.google.com");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        ReusableActions.sendKeysMethod(driver, "//*[@name= 'q']", "bangladesh", "search");
        //ReusableActions.clickMethod(driver, "//*[@name= 'btnK']", "submit");
        driver.findElement(By.xpath("//*[@name= 'btnK']")).submit();
        //ReusableActions.scrollByPixels(driver, "scroll (0,1200)");
        ReusableActions.scrollByElement(driver, "//*[@class= 'QXROIe']", "scroll");
        Thread.sleep(3000);
      //  driver.quit();



//        WebDriver driver = ReusableActions.chromeDriverSetup();
//        driver.navigate().to("https://www.mlcalc.com");
//        ReusableActions.clickMethod(driver, "//*[text() = 'Show advanced options']", "click");
//        Thread.sleep(2000);
//        ReusableActions.selectByText(driver, "//*[@id = 'fpdd']", "month", "May");
//        Thread.sleep(2000);
//        ReusableActions.selectByText(driver, "//*[@name = 'sy']", "year", "2025");

    }//end of main
}//end of class
