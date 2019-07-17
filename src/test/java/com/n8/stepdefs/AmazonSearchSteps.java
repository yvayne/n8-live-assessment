package com.n8.stepdefs;

import com.n8.pages.home.AmazonResultsSearch;
import cucumber.api.java.en.When;

public class AmazonSearchSteps {
    private AmazonResultsSearch amazonResultsSearch;

    public AmazonSearchSteps() {
        amazonResultsSearch = new AmazonResultsSearch();
    }

    @When("^I select the first result of the search$")
    public void iSelectTheFirstResultOfTheSearch() {
        amazonResultsSearch.clickResult();
    }
}
