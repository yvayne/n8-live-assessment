package com.n8.pages.base;

import com.n8.webdriver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Represents BasePage implementing Page Object pattern.
 */
public class BasePage {

    protected WebDriver webDriver;

    /**
     * Initializes and instance of {@link BasePage}.
     */
    protected BasePage() {
        webDriver = DriverManager.getInstance().getWebDriver();
        PageFactory.initElements(webDriver, this);
    }
}
