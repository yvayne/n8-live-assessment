package com.n8.stepdefs;

import com.n8.pages.home.AmazonHome;
import cucumber.api.java.en.When;

public class AmazonHomeSteps {
    private AmazonHome amazonHome;

    public AmazonHomeSteps() {
        amazonHome = new AmazonHome();
    }

    @When("^I type \"([^\"]*)\" in searchText on AmazonHome page$")
    public void iTypeInSearchTextOnAmazonHomePage(final String text) {
        amazonHome.setSearchText(text);
    }

    @When("^I click on magnifierIcon on AmazonHome page$")
    public void iClickOnMagnifierIconOnAmazonHomePage() {
        amazonHome.clickMagnifierIcon();
    }
}
