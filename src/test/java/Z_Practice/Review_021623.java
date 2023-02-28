package Z_Practice;

import Reusable_Library.ReusableActions;
import com.relevantcodes.extentreports.ExtentReports;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Review_021623 {
    public static void main(String[] args) {
        WebDriver driver = ReusableActions.chromeDriverSetup();
        //webelement
        WebElement showSyntax = driver.findElement(By.xpath("//*[@name= 'abc']"));

        List<WebElement> tabsCount = driver.findElements(By.xpath("//*[@class= 'abc']"));
        System.out.println("tab count is " + tabsCount.size());

        //define path for extent report
        ExtentReports report = new ExtentReports("filepath", true);
    }//end of main
}//end of class
