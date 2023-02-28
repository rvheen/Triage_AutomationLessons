package Day10_020623;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T3_ExplicitWait_MetLife {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-fullscreen");
        WebDriver driver = new ChromeDriver(options);
        //navigate to metlife home page
        driver.navigate().to("https://www.metlife.com");
        //declare the explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //click on solutions tab
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[contains(text(), 'SOLUTIONS')]"))).get(0).click();
        //findelementS
        //click on dental link
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text() = 'Dental']"))).click();
        //findelement

        //quit the driver
        driver.quit();


    }//end of main
}//end of class
