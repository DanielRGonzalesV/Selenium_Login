package com.fundacionjala.pivotal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Zeus on 13/06/2016.
 */
public class Login_Example {

    private WebDriver driver;
    private By userNameTextField = By.id("credentials_username");
    private By passwordTextFlied = By.id("credentials_password");
    private By classNameButtonSingin = By.className("app_signup_submit_button_button");

    public Login_Example(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.pivotaltracker.com/signin");
    }

    public void setUserName(String userName) {
        driver.findElement(userNameTextField).sendKeys(userName);
    }

    public void setPassword(String password){
        driver.findElement(passwordTextFlied).sendKeys(password);
    }

    public void clickSingInButton(String className){
        driver.findElement(classNameButtonSingin).click();
    }

}
