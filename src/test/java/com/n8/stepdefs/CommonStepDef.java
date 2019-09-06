package com.n8.stepdefs;

import com.n8.webdriver.DriverManager;
import cucumber.api.java.en.Given;

public class CommonStepDef {

    /**
     * This steps helps to navigate.
     *
     * @param url url to navigate.
     */
    @Given("I go to : {string}")
    public void iGoTo(final String url) {
        DriverManager.getInstance().getWebDriver().get(url);
    }

}
