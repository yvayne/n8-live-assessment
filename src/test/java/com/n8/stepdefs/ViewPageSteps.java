package com.n8.stepdefs;

import com.n8.pages.home.ViewPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ViewPageSteps {
    private ViewPage viewPage;

    public ViewPageSteps() {
        viewPage = new ViewPage();
    }

    @When("^I click on navigation cart icon$")
    public void iClickOnNavigationCartIcon() {
        viewPage.clickCartIcon();
    }

    @Then("^Verify that the message \"([^\"]*)\" appears$")
    public void verifyThatTheMessageAppears(final String expectedMessage)  {
        Assert.assertEquals(viewPage.getMessageLabel(), expectedMessage);
    }
}
