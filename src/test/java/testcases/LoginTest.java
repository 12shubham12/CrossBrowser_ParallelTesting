package testcases;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import pages.LoginPage;
import utility.BaseClass;
import utility.BrowserFactory;

public class LoginTest extends BaseClass { //achieving inheritance

    @BeforeMethod
    @Parameters("browser")
    public void setup(String browser){
        BaseClass.setUpSuit();
        driver = BrowserFactory.startApplication(driver, browser,config.getqaURL());
    }

    @AfterMethod
    public void tearDown(){
        BrowserFactory.quitBrowser(driver);
    }

    @Test
    public void loginApp(){
        //Use Pagefactory class to initialize the page using initElements method
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);

        //From below line we are achieving abstraction, as we are showing the essential features
        //and hiding the background details
        loginpage.loginToApp(excel.getUserName("LoginDetails",1,0),
                excel.getPassword("LoginDetails",1,1));
        }
}
