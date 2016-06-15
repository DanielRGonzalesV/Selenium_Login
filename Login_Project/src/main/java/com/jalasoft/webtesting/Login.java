package com.jalasoft.webtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by danielgonzales on 6/15/2016.
 */
public class Login extends Singleton {

    @FindBy(id = "credentials_username")
    private WebElement userNameTextField;

    @FindBy(id = "credentials_password")
    private WebElement passwordTextField;

    @FindBy(className = "app_signup_submit_button_button")
    private WebElement sigInButton;

    public Login(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
    }

    public void setUserNameTextField(String userName) {
        userNameTextField.clear();
        userNameTextField.sendKeys(userName);
    }

    public void setPasswordTextField(String password) {
        passwordTextField.clear();
        passwordTextField.sendKeys(password);
    }

    public Dashboard clickSignInButton() {
        sigInButton.click();
        return new Dashboard(driver);
    }


}
