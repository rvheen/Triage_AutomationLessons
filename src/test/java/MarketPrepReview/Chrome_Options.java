package MarketPrepReview;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Options {
    public static void main(String[] args) {
        //call the webdrivermanager to setup the chromedriver so the code opens up chrome
        WebDriverManager.chromedriver().setup();
        //setup chrome options
        ChromeOptions options = new ChromeOptions();
        //added chrome options argument to let the webdriver start up in incognito
        options.addArguments("incognito");
        WebDriver driver = new ChromeDriver(options);
    }
}
