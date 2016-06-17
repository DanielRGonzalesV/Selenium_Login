package com.jalasoft.webtesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Project extends PagesPivotal {

    @FindBy(className = "raw_context_name")
    private WebElement projectNameText;

    @FindBy(css = "[data-aid='navTab-settings']")
    private WebElement settingsProjectTab;


    public String getProjectNameText() {

        return projectNameText.getText();
    }

    public Settings_Project clickSettingsProjectTab() {

        settingsProjectTab.click();
        return new Settings_Project();
    }


}
