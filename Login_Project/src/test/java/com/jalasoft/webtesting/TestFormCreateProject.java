package com.jalasoft.webtesting;

import org.junit.Assert;
import org.junit.Test;

public class TestFormCreateProject {

        @Test
    public void testCreateProject() {

        String projectName = "Test_Selenium115";

        PivotalHome pivotalHome = new PivotalHome();
        Login login = pivotalHome.clickSignInLink();
        login.setUserNameTextField("walter_mercado_jala");
        login.setPasswordTextField("P@ssw0rd");
        Dashboard dashboard = login.clickSignInButton();
        FormCreateProject formCreateProject = dashboard.clickCreateProjectButton();
        formCreateProject.setProjectNameTextField(projectName);
        formCreateProject.clickListBox();
        formCreateProject.selectAccountOfListBox("rosario project");
        Project project = formCreateProject.clickCreateButton();
        Assert.assertEquals(projectName, project.getProjectNameText());
    }
}
