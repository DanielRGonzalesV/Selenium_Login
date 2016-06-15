package com.jalasoft.webtesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by danielgonzales on 6/15/2016.
 */
public class PivotalHome extends Singleton {

    private static final String PIVOTAL_TRACKER_URL = "https://www.pivotaltracker.com/";

    @FindBy(css = "a[href='/signin']")
    private WebElement signInLink;

    public PivotalHome() {
        super();
        driver.get(PIVOTAL_TRACKER_URL);
        PageFactory.initElements(driver, this);
    }

    public Login clickSignInLink() {
        signInLink.click();
        return new Login(driver);
    }
}
