package ActionItem;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

public class ActionItem_05 {
    public static void main(String[] args) throws InterruptedException {
        //declare an arrayList
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11102"); //index 0
        zipCode.add("10468"); //index 1
        zipCode.add("10065"); //index 2

        //setup the chrome driver manager and declare chrome options
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-fullscreen", "incognito");
        WebDriver driver = new ChromeDriver(options);

        //start of for loop
        for (int i = 0; i < zipCode.size(); i++) {
            //go to weight watchers page
            driver.navigate().to("https://www.weightwatchers.com/");
            Thread.sleep(2000);

            //start of clicking find a workshop and in-person
            try {
                driver.findElement(By.xpath("//*[text()= 'Find a Workshop']")).click();
                driver.findElement(By.xpath("//*[@class= 'iconWrapper-1dvW4']")).click();
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Unable to click twice for reason: " + e);
            }//end of clicking find a workshop and in-person

            //start of creating searchBar webElement and clearing searchBar and entering zipCode
            try {
                WebElement searchBar = driver.findElement(By.xpath("//*[@id= 'location-search']"));
                searchBar.clear();
                searchBar.sendKeys(zipCode.get(i));
            } catch (Exception e) {
                System.out.println("Unable to clear searchBar and enter zipCode for reason: " + e);
            }//end of creating searchBar webElement and clearing searchBar and entering zipCode

            //start of clicking search button
            try {
                driver.findElement(By.xpath("//*[@id= 'location-search-cta']")).click();
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("Unable to click search button for reason: " + e);
            }//end of clicking search button

            //start of creating studioLink webElement and creating if else conditions for clicking studioLink
            try {
                //ArrayList<WebElement> studioLink = new ArrayList<>(driver.findElements(By.xpath("//*[@class= 'linkContainer-1NkqM']")));
                List<WebElement> studioLink = driver.findElements(By.xpath("//*[@class= 'linkContainer-1NkqM']"));
                if (i == 0) {
                    studioLink.get(1).click();
                } else if (i == 1) {
                    studioLink.get(2).click();
                } else if (i == 2) {
                    studioLink.get(0).click();
                }//end of conditions
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("Unable to create studioLink webElement and click studioLink for reason: " + e);
            }//end of creating studioLink webElement and creating if else conditions for clicking studioLink

            //start of capturing and splitting then printing addressInfo
            try {
                String addressInfo = driver.findElement(By.xpath("//*[@class= 'address-2PZwW']")).getText();
                String [] addressMessage = addressInfo.split("In-Person");
                System.out.println("The address info is " + addressMessage[0]);
            } catch (Exception e) {
                System.out.println("Unable to capture and split then print addressInfo for reason: " + e);
            }//end of capturing and splitting then printing addressInfo

            //start of scrolling to upcomingSchedule
            try {
                //define javaScript executor
                JavascriptExecutor jse = (JavascriptExecutor) driver;
                WebElement upcomingSchedule = driver.findElement(By.xpath("//*[text()= 'Upcoming In-Person Workshops schedule']"));
                jse.executeScript("arguments[0].scrollIntoView(true);", upcomingSchedule);
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("Unable to scroll to upcomingSchedule for reason: " + e);
            }//end of scrolling to upcomingSchedule

            //start of capturing and printing workshopSchedule
            try {
                String workshopSchedule = driver.findElement(By.xpath("//*[@class= 'scheduleContainerMobile-1RfmF']")).getText();
                System.out.println("The upcoming in-person workshops schedule is: " + workshopSchedule);
            } catch (Exception e) {
                System.out.println("Unable to capture and print workshopSchedule for reason: " + e);
            }//end of capturing and printing workshopSchedule
        }//end of for loop

        //quit the driver
        driver.quit();

    }//end of main
}//end of class