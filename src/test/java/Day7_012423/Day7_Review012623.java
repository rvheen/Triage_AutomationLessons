package Day7_012423;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Day7_Review012623 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        /*
        driver.navigate().to("https://www.yahoo.com");
        //wait a bit
        Thread.sleep(3000);
        //click on shopping link
        driver.findElements(By.xpath("//*[@class='_yb_1eq5n   rapid-noclick-resp']")).get(6).click();
        */

//Requirement1
//I would like to validate the description for Individual & Family Plans
        //go to anthem.com
        driver.navigate().to("https://www.anthem.com");
        //wait a bit
        Thread.sleep(2000);
        //capture text in string variable
        String individualFamilyPlan = driver.findElement(By.xpath("//*[@class='richTextEditor secondary']")).getText();
        //print desired text
        System.out.println("The text for Individual & Family Plans is: " + individualFamilyPlan);

//Requirement2
//I would like to validate all the descriptions of all the plans
//hint: for loop, webElement, getText

        List<WebElement> planDescriptionElements = driver.findElements(By.xpath("//*[@class='richTextEditor secondary']"));

        for (int i = 0; i < planDescriptionElements.size()-4; i++) {
            System.out.println("Plan description for plan " + i + " is: " + planDescriptionElements.get(i).getText());
        }//end of for loop

        //quit the driver
        driver.quit();

//        WebElement individualText = driver.findElement(By.xpath("//*[@class='richTextEditor secondary']");
//
//        ArrayList<String> medicalPlans = new ArrayList<>();
//        medicalPlans.add(individualText);
//
//        for (int i = 0; i < medicalPlans.size(); i++)
//            driver.navigate().to("https://www.anthem.com");
//        //wait a bit
//            Thread.sleep(2000);
//        //capture text in string variable
//            String individualFamilyPlan = driver.findElement(By.xpath("//*[@class='richTextEditor secondary']")).getText(medicalPlans.get(i));
//        //print desired text
//            System.out.println("The text for Individual & Family Plans is: " + medicalPlans.get(i));

    }//end of main
}//end of class
