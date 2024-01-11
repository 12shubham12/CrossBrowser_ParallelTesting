package utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

    public static WebDriver driver;
    public static ExcelDataProvider excel;
    public static ConfigDataProvider config;

    public static void setUpSuit(){
        excel = new ExcelDataProvider();
        config = new ConfigDataProvider();
    }
}