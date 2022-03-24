package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    By userName= By.xpath("//*[@id='username']");
    By password=By.xpath("//*[@id='password']");
    By loginButton=By.xpath("//i[@class='fa fa-2x fa-sign-in']");
    String UserName="Shubham";
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

//    public void verifyUserName(){
//        driver.findElement(userName);
//    }
//    public  void verifyPassword(){
//        driver.findElement(password);
//    }

    //enter username and password in the field
    public void enterUserName(){
       WebElement element1= driver.findElement(userName);
       element1.sendKeys(UserName);
    }
    public void enterPassword(){
        WebElement element2=driver.findElement(password);
        element2.sendKeys("SuperSecretPassword");
    }

    public void clickLogIn(){
        WebElement element3=driver.findElement(loginButton);
        element3.click();
    }
}
