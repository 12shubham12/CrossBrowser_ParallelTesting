//https://parabank.parasoft.com/parabank/index.htm
package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserFactory {

    public static WebDriver startApplication(WebDriver driver, String browser, String appURL){
        if(browser.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browser.equals("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if(browser.equals("Edge")) {
            System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }
        else {
            System.out.println("No such browser");
        }

        //launching the URL
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(appURL);
        return driver;
    }

    //quitting the browser

    public static void quitBrowser(WebDriver driver){
        driver.quit();
    }
}