package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){
        super(driver);
    }
  //  if(driver.getCurrentUrl().equals("https://gittigidiyor.com"));

    public LoginPage check(){
        AssertJUnit.assertEquals("https://www.gittigidiyor.com/",
                driver.getCurrentUrl());
        return this;
    }

    public  LoginPage hover(){

        hoverElement((By) findElement(By.className("gekhq4-5 grTfZj")));
        return this;
    }
    public  LoginPage login(){
         click(By.className("gekhq4-4 egoSnI"));
         sendKeys(By.id("L-UserNameField"),"sealing.07@gmail.com");
         sendKeys(By.id("L-PasswordField"),"melih1453");
         click(By.id("gg-login-enter"));
         return this;

    }


}
