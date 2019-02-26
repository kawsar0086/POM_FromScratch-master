package Pages;

import Utilities.ConfigReader;
import Utilities.Credentials;
import Utilities.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Elements extends TestBase {

    public Elements(){
        PageFactory.initElements(driver,this);
    }

    public @FindBy(xpath = "//*[@id='uh-signin']")
    WebElement signin;

    public @FindBy(xpath = "//*[@id='login-username']")
    WebElement username;

    public @FindBy(xpath = "//*[@id='login-passwd']")
    WebElement password;

    public void loginprocess(){
        driver.navigate().to(ConfigReader.getinfo("WebSite"));
        //driver.navigate().to(Credentials.getWebSite());
        wait.until(ExpectedConditions.visibilityOf(signin));
        signin.click();
        wait.until(ExpectedConditions.visibilityOf(username));
        username.sendKeys(ConfigReader.getinfo("UserName") + Keys.ENTER);
        //username.sendKeys(Credentials.getUserName() + Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(ConfigReader.getinfo("Password") + Keys.ENTER);
        //password.sendKeys(Credentials.getPassword() + Keys.ENTER);
    }

}
