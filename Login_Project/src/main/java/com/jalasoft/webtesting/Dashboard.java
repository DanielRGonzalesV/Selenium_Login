package com.jalasoft.webtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by danielgonzales on 6/15/2016.
 */
public class Dashboard extends Singleton {

       private final By userNameText;

    @FindBy(id = "create_new_project_button")
    private WebElement createProjectButton;

        public Dashboard(WebDriver driver) {
            super();
            PageFactory.initElements(driver, this);
            userNameText = By.className("tc_dropdown_name");
        }

        public String getUserNameText() {

            return driver.findElement(userNameText).getText();
        }

    public FormCreateProject clickCreateProjectButton() {
        createProjectButton.click();
        return new FormCreateProject(driver);
    }

    }

