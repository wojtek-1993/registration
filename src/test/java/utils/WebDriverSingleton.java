package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverSingleton {

    private static WebDriver driver;

    private WebDriverSingleton() {}

    
    public static WebDriver getInstance() {
        if(null == driver) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-dev-shm-usage"); 
            options.addArguments("start-maximized");
            options.addArguments("disable-infobars"); 
            options.addArguments("--disable-extensions"); 
            options.addArguments("--disable-gpu"); 
            options.addArguments("--no-sandbox"); 
            driver = new ChromeDriver(options);
        }
        return driver;
    }

    

    public static void quit() {
        if(null != driver) { 
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-dev-shm-usage"); 
            options.addArguments("start-maximized"); 
            options.addArguments("disable-infobars"); 
            options.addArguments("--disable-extensions"); 
            options.addArguments("--disable-gpu"); 
            options.addArguments("--no-sandbox"); 
            driver = new ChromeDriver(options);

            driver.quit(); 
        }
        driver = null;
    }
}
