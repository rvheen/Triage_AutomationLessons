package MarketPrepReview;

import Reusable_Library.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Implicit_Explicit_Wait extends TestBase{

    @Test
    public void explicitWait(){
        //implicit
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //explicit
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class= 'abc']"))).click();
        //.visibilityOfElementLocated

    }



}
