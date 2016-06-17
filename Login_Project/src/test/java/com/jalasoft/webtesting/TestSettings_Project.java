package com.jalasoft.webtesting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSettings_Project {

    private static Settings_Project settings_project;
    private static Dashboard dashboard;

    @Before
    public void setUpClass() throws Exception {

        String projectName = "Test_Selenium_bef";

        PivotalHome pivotalHome = new PivotalHome();
        Login login = pivotalHome.clickSignInLink();
        login.setUserNameTextField("walter_mercado_jala");
        login.setPasswordTextField("P@ssw0rd");
        dashboard = login.clickSignInButton();
        //create Project
        FormCreateProject formCreateProject = dashboard.clickCreateProjectButton();
        formCreateProject.setProjectNameTextField(projectName);
        formCreateProject.clickListBox();
        formCreateProject.selectAccountOfListBox();
        formCreateProject.checkProjectPublicCheckBox();
        Project project = formCreateProject.clickCreateButton();
        settings_project = project.clickSettingsProjectTab();

    }

    @Test
    public void testEditProject() {


        String projectNewName = "Test_Selenium88888888888";
        String projectDescription = "Description 3333";
        String messageChangesSaved = "Changes saved.";


        //Edit
        settings_project.editNameProject(projectNewName);
        settings_project.editDescriptionProject(projectDescription);
        settings_project.clickSaveSettingProjectButton();
        Assert.assertEquals(messageChangesSaved, settings_project.messageSavedChangesSettings());

    }

    @Test
    public void testDeleteProject() {

        String messageProjectDeleted = "Test_delete was successfully deleted.";

        //Delete
        settings_project.clickDeleteProjectLink();
        dashboard = settings_project.clickConfirmDeleteProjectButton();
        Assert.assertEquals(messageProjectDeleted, dashboard.getMessageDeleteProject());

    }
}
