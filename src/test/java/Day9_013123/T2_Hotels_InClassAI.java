package Day9_013123;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class T2_Hotels_InClassAI {
    public static void main(String[] args) throws InterruptedException {
        //declare an array list
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Las Vegas");
        cities.add("Los Angeles");

        //setup the chrome driver manager and declare chrome options
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-fullscreen");
        WebDriver driver = new ChromeDriver(options);

        //start for loop
        for (int i = 0; i < cities.size(); i++) {
            //go to hotels page
            driver.navigate().to("https://www.hotels.com");

            //start of entering array into search
            try {
                driver.findElement(By.xpath("//*[@class= 'uitk-fake-input uitk-form-field-trigger']")).click();
                driver.findElement(By.xpath("//*[@id= 'destination_form_field']")).sendKeys(cities.get(i));

                Thread.sleep(2000);
            } catch (Exception err) {
                System.out.println("Unable to enter search text for reason: " + err);
            }//end of entering array into search

            //start of clicking on first dropdown
            try {
                driver.findElement(By.xpath("//*[@class='truncate']")).click();
                //alternative way to enter your search criteria, presses enter and chooses first dropdown
//                driver.findElement(By.xpath("//*[@id= 'destination_form_field']")).sendKeys(Keys.ENTER);
                Thread.sleep(2000);
            } catch (Exception err) {
                System.out.println("Unable to click on first dropdown for reason: " + err);
            }//end of clicking first dropdown

            //start of clicking search button
            try {
                driver.findElement(By.xpath("//*[@id='search_button']")).click();
                Thread.sleep(2000);
            } catch (Exception err) {
                System.out.println("Unable to click on search button for reason: " + err);
            }//end of clicking search button

//            //start of conditions
//            //create an arrayList for hotels suggestions
//            ArrayList<WebElement> hotelList = new ArrayList<>(driver.findElements(By.xpath("//*[@data-stid= 'open-hotel-information']']")));
//            if (i == 0) {
//                hotelList.get(0).click();
//            } else if (i == 1) {
//                hotelList.get(2).click();
//            } else if (i == 2) {
//                hotelList.get(1).click();
//            }

            if (i == 0) {
                driver.findElements(By.xpath("//*[@class= 'uitk-card-link']")).get(1).click();
            } else if (i == 1) {
                driver.findElements(By.xpath("//*[@class= 'uitk-card-link']")).get(2).click();
            } else if (i == 2) {
                driver.findElements(By.xpath("//*[@class= 'uitk-card-link']")).get(3).click();
            }//end of conditions

            //switch to the new tab
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));
            Thread.sleep(2000);

            //start of capturing the resort name
            try {
                String resortName = driver.findElement(By.xpath("//*[@class= 'uitk-heading uitk-heading-3']")).getText();
                System.out.println("The name of the resort is " + resortName);
                Thread.sleep(5000);
            } catch (Exception err) {
                System.out.println("Unable to capture resort name for reason: " + err);
            }//end of capturing the resort name

//            //scroll down
//            JavascriptExecutor jse = (JavascriptExecutor) driver;
//            jse.executeScript("scroll (0,1200)");

            //start of capturing first price per night
            try {
                String firstPrice = driver.findElements(By.xpath("//*[@class='uitk-text uitk-type-600 uitk-type-bold uitk-text-emphasis-theme']")).get(0).getText();
                System.out.println("The first price per night is: " + firstPrice);
                Thread.sleep(5000);
            } catch (Exception err) {
                System.out.println("Unable to capture first price per night for reason: " + err);
            }//end of capturing first price per night

            //start of clicking on reserve button
            try {
                driver.findElements(By.xpath("//*[@class= 'uitk-button uitk-button-medium uitk-button-primary']")).get(0).click();
                // "//*[contains(text(), 'price')].get(0).click()
                Thread.sleep(5000);
            } catch (Exception err) {
                System.out.println("Unable to click on reserve button for reason: " + err);
            }//end of clicking on reserve button

            //start of clicking on pay at property

//              handle pop up window with pay now button
//            try {
//                WebElement reserveNowPopUp = driver.findElement(By.xpath("//*[@class= 'uitk-toolbar-title-content']"));
//                if (reserveNowPopUp.isDisplayed()) {
//                    //if the pop up is dipayed then click on pay now
//                    driver.findElement(By.xpath("//span[text() = 'Pay now']"));
//                } catch (Exception e) {
//            System.out.println("Unable to find pop up window " + e);
//        }

            try {
                if (i == 0) {
                    driver.findElements(By.xpath("//*[@class= 'uitk-button uitk-button-medium uitk-button-primary']")).get(20).click();
                    System.out.println("Mini window for pay deposit popped up");
                } else if (i == 1) {
                    System.out.println("No mini window popped up");
                } else if (i == 2) {
                    System.out.println("No mini window popped up");
                }//end of conditions
                Thread.sleep(5000);
            } catch (Exception err) {
                System.out.println("Unable to click on pay at property button for reason: " + err);
            }//end of clicking on pay at property button

            //start of capturing all hotel room info

//            //capture amenities
//            try {
//                String amenities = driver.findElement(By.xpath("//*[@class= 'c-hds-success-1']")).getText();
//                //print out dates
//                System.out.println(amenities);
//            }catch (Exception e) {
//                System.out.println("Unable to capture and print out amenities.." + e);
//            }//end of capture amenities

            try {
                String hotelRoomInfo = driver.findElement(By.xpath("//*[@class= ' with-small-icon icon-thin-tick']")).getText();
                System.out.println("All hotel room info is " + hotelRoomInfo);
                Thread.sleep(3000);
            } catch (Exception err) {
                System.out.println("Unable to capture all hotel room info for reason: " + err);
            }//end of capturing all hotel room info

            //closing current tab
            driver.close();

            //switch to first tab
            driver.switchTo().window(tabs.get(0));

            }//end of for loop

        //quit the driver
        driver.quit();

        }//end of main
    }//end of class
