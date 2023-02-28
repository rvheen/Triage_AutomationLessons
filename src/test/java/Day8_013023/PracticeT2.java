package Day8_013023;

public class PracticeT2 {
    public static void main(String[] args) {
       /*
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //declare chrome options
        //note that chrome options need to be defined before the webDriver
        ChromeOptions options = new ChromeOptions();
        //start maximized option
        options.addArguments("start-maximized");
        //define the webDriver and pass the chrome options into the driver method
        WebDriver driver = new ChromeDriver(options);
        //go to fedeliscare homepage
        driver.navigate().to("https://www.fideliscare.org/");
        //wait a bit
        Thread.sleep(2000);
        //click on shop a plan
        driver.findElement(By.xpath("//*[text() = 'Shop For a Plan']")).click();
        //wait 2 secs
        Thread.sleep(2000);
        //click on medicaid managed care
        driver.findElement(By.xpath("//*[text() = 'Medicaid Managed Care']")).click();
        Thread.sleep(2000);
        //click on find a doctor
        driver.findElement(By.xpath("//*[@class= 'btn btn-outline-primary btn-external btn-show link-external']")).click();
        //wait 2 secs
        Thread.sleep(2000);
        //new tab opens after clicking on find a doctor search button
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to the new tab
        driver.switchTo().window(tabs.get(1));
        //wait 2 secs
        Thread.sleep(2000);
        //Enter a zip code
        driver.findElement(By.xpath("//*[@id = 'searchLocation']")).sendKeys("11230");
        //Wait few seconds
        Thread.sleep(3000);
        //close the new tab (find a doctor tab)
        driver.close();
        //switch back to the parent
        driver.switchTo().window(tabs.get(0));
        //click on the search button on medicaid managed care (parent tab)
        driver.findElement(By.xpath("//*[contains(@class,'tool dropdown search')]")).click();
        //Wait few seconds
        Thread.sleep(3000);
        //quit the driver
        driver.quit();

        */
    }


}
