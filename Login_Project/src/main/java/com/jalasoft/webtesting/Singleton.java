package com.jalasoft.webtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by danielgonzales on 6/15/2016.
 */
public class Singleton {

    protected WebDriver driver;

    public Singleton(){

        getInstance();

    }

    public WebDriver getInstance(){

        if(driver == null)
        {
            driver = new FirefoxDriver();
            return driver;
        }

        return driver;
    }
}
