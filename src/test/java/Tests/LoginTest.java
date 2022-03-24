package Tests;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    String url="https:''the-internet.heroku.app";
    LoginPage loginPage;
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);
    }
    @Test(priority = 1)
    public void validateLogIn(){
        loginPage=new LoginPage(driver);
        loginPage.enterUserName();
        loginPage.enterPassword();
        loginPage.clickLogIn();
    }
    @Test(priority = 2)
    public void validateInvalidLogin(){
        loginPage=new LoginPage(driver);
        loginPage.enterUserName();
        loginPage.enterPassword();
        loginPage.clickLogIn();
    }
}
