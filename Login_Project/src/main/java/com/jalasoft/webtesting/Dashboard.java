package com.jalasoft.webtesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by danielgonzales on 6/15/2016.
 */
public class Dashboard extends PagesPivotal {

    @FindBy(className = "tc_dropdown_name")
    private WebElement userNameText;

    @FindBy(id = "create_new_project_button")
    private WebElement createProjectButton;

    //Example xpath=//input[@name='name2' and @value='yes']
    @FindBy(css = ".hover_link.settings")
    private WebElement settingsProjectButton;

    @FindBy(id = "notice")
    private WebElement messageDeleteProject;

    public String getUserNameText() {
        return userNameText.getText();
    }

    public FormCreateProject clickCreateProjectButton() {
        createProjectButton.click();
        return new FormCreateProject();
    }

    public Settings_Project clickSettingsProjectButton() {

        settingsProjectButton.click();
        return new Settings_Project();
    }

    public String getMessageDeleteProject() {

        return messageDeleteProject.getText();
    }


}

