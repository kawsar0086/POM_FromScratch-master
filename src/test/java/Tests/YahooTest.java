package Tests;

import Pages.Elements;
import Utilities.Credentials;
import Utilities.MyLibrary;
import Utilities.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class YahooTest extends TestBase {

    @BeforeMethod
    public void setup2(){
        Elements e = new Elements();
        e.loginprocess();
    }

    @Test(priority = 1)
    public void firstTest() {

    }

    @Test(priority = 2)
    public void SecondTest(){

    }

    @Test(priority = 3)
    public void ThirdTest(){

    }
}
