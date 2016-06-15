package com.jalasoft.webtesting;

        import org.junit.Test;
        import static org.junit.Assert.assertEquals;

/**
 * Created by danielgonzales on 6/15/2016.
 */

public class TestLogin {

    @Test
    public void testCreateProject() {

        String projectName = "Test_Selenium7";

        PivotalHome pivotalHome = new PivotalHome();
        Login login = pivotalHome.clickSignInLink();
        login.setUserNameTextField("walter_mercado_jala");
        login.setPasswordTextField("P@ssw0rd");
        Dashboard dashboard = login.clickSignInButton();
        FormCreateProject formCreateProject = dashboard.clickCreateProjectButton();
        formCreateProject.setProjectNameTextField(projectName);
        formCreateProject.clickListBox();
        formCreateProject.selectAccountOfListBox("daniel");
        Project project = formCreateProject.clickCreateButton();
        assertEquals(projectName, project.getProjectNameText());
    }

}