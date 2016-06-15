package com.jalasoft.webtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by danielgonzales on 6/15/2016.
 */
public class Project extends Singleton {

    private final By projectNameText;

    public Project(WebDriver driver) {

        super();
        projectNameText = By.className("raw_context_name");
    }


    public String getProjectNameText() {

        return driver.findElement(projectNameText).getText();
    }
}
