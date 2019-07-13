package com.n8.stepdefs;

import com.n8.pages.home.SearchResult;
import cucumber.api.java.en.Then;
import org.testng.Assert;

/**
 * Represents steps definitions for Search Result page.
 */
public class SearchResultSteps {
    private SearchResult searchResult;

    /**
     * Constructor method.
     */
    public SearchResultSteps() {
        searchResult = new SearchResult();
    }

    /**
     * Validates the content on the search field.
     *
     * @param expectedResult expected value for search text.
     */
    @Then("^The text on search text field should be: \"([^\"]*)\"$")
    public void theTextOnSearchTextFieldShouldBe(final String expectedResult) {
        Assert.assertEquals(searchResult.getTextFromSearch(), expectedResult);
    }
}
