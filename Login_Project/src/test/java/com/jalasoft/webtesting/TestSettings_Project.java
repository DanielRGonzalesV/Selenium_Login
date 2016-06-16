package com.jalasoft.webtesting;

        import org.junit.Assert;
        import org.junit.Test;

/**
 * Created by danielgonzales on 6/16/2016.
 */
public class TestSettings_Project {

    @Test
    public void testEditProject() {

        String messageChangesSaved = "Changes saved.";

        PivotalHome pivotalHome = new PivotalHome();
        Login login = pivotalHome.clickSignInLink();
        login.setUserNameTextField("walter_mercado_jala");
        login.setPasswordTextField("P@ssw0rd");
        Dashboard dashboard = login.clickSignInButton();
        Settings_Project settings_project = dashboard.clickSettingsProjectButton();
        settings_project.editNameProject("New Project 1");
        settings_project.editDescriptionProject("descrip 1");
        settings_project.clickSaveSettingProjectButton();
        Assert.assertEquals(messageChangesSaved, settings_project.messageSavedChangesSettings());

    }

    @Test
    public void testDeleteProject() {

        String messageProjectDeleted = "rosario project was successfully deleted.";

        PivotalHome pivotalHome = new PivotalHome();
        Login login = pivotalHome.clickSignInLink();
        login.setUserNameTextField("walter_mercado_jala");
        login.setPasswordTextField("P@ssw0rd");
        Dashboard dashboard = login.clickSignInButton();
        Settings_Project settings_project = dashboard.clickSettingsProjectButton();
        settings_project.clickDeleteProjectLink();
        dashboard = settings_project.clickConfirmDeleteProjectButton();
        Assert.assertEquals(messageProjectDeleted, dashboard.getMessageDeleteProject());

    }
}
