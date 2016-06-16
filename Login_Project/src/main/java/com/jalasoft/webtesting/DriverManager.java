package com.jalasoft.webtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

    private static DriverManager instance;

    private WebDriver driver;

    private DriverManager() {
        initWebDriver();
    }

    public static DriverManager getInstance() {

        if (instance == null) {
            instance = new DriverManager();
        }
        return instance;
    }

    private void initWebDriver() {
        driver = new FirefoxDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
