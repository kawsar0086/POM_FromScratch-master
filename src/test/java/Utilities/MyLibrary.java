package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MyLibrary {
    WebDriver driver;
    public MyLibrary(WebDriver driver){
        this.driver = driver;
    }

    public Actions act;

    public  void sleep(double a){
        try {
            Thread.sleep((int)(a*1000));
        } catch (InterruptedException e) {

        }
    }

    public WebElement DynamicElement(WebDriver driver, String tagname, String codition){
        List<WebElement> allclickable=driver.findElements(By.tagName(tagname));
        for(WebElement each: allclickable) {
            if (each.getText().toLowerCase().contains(codition.toLowerCase())) {
                return each;
            }
        }
        return null;
    }

    public void TakeScreenshotsplease(String SaveAs){
        TakesScreenshot mirzat=(TakesScreenshot)driver;
        File myfile=mirzat.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(myfile, new File("src/test/captures/"+SaveAs+".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void scrollplease(WebDriver driver, int y){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("scroll(0,"+y+")");

    }


}
