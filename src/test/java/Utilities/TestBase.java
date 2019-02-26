package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public MyLibrary myLib;
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions act;

    @BeforeMethod
    public void setups(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        myLib = new MyLibrary(driver);
        wait = new WebDriverWait(driver,50);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void EndTest(){
        myLib.sleep(3.5);
        driver.quit();
    }

}