package com.n8.stepdefs;

import com.n8.pages.home.Home;
import cucumber.api.java.en.When;

/**
 * Represents steps definitions for Home Page.
 */
public class HomeSteps {

    private Home home;

    /**
     * Constructor method.
     */
    public HomeSteps() {
        home = new Home();
    }

    /**
     * Sets value on search text field.
     *
     * @param text text value.
     */
    @When("^I set \"([^\"]*)\" on search text field$")
    public void iSetOnSearchTextField(final String text) {
        home.setSearchText(text);
        home.clickLogo();
    }

    /**
     * Performs click on search button.
     */
    @When("^I click on search button$")
    public void iClickOnSearchButton() {
        home.clickSearchButton();
    }
}
