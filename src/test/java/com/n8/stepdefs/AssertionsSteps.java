package com.n8.stepdefs;

import com.n8.webdriver.DriverManager;
import cucumber.api.java.en.Then;
import org.testng.Assert;

/**
 * Common Assertions steps.
 */
public class AssertionsSteps {

    private static final String THEY_ARE_DIFFERENT = "They are different";

    /**
     * Performs assertions of page title.
     *
     * @param expectedResult expected value.
     */
    @Then("^The page title should be: \"([^\"]*)\"$")
    public void thePageTitleShouldBe(final String expectedResult) {
        Assert.assertEquals(DriverManager.getInstance().getWebDriver().getTitle(), expectedResult, THEY_ARE_DIFFERENT);
    }
}
