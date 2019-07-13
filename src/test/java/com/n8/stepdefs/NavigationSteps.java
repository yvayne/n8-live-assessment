package com.n8.stepdefs;

import com.n8.webdriver.DriverManager;
import cucumber.api.java.en.Given;

/**
 * Represents the steps definitions for navigation page.
 */
public class NavigationSteps {
    /**
     * Defines the navigation to url.
     *
     * @param url url to navigate.
     */
    @Given("^I go to \"([^\"]*)\"$")
    public void iGoTo(final String url) {
        DriverManager.getInstance().getWebDriver().navigate().to(url);
    }


}
