package com.n8.runner;

import com.n8.webdriver.DriverManager;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * It is in charged to define the Cucumber Runner class.
 */
@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test/resources/features/"},
        tags = {"@test01"},
        glue = {"com.n8"})
public class Runner extends AbstractTestNGCucumberTests {

    /**
     * Perform the init method.
     */
    @BeforeTest
    public void init() {
    }

    /**
     * Closes the web driver after the all feature test execution.
     */
    @AfterTest
    public void closeBrowser() {
        DriverManager.getInstance().getWebDriver().quit();
    }
}
