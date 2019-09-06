package com.n8.stepdefs;

import com.n8.pages.automationpractice.HomePage;
import com.n8.pages.automationpractice.ProductFilterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class ProductFilterStepDef {
    private HomePage homePage;
    private ProductFilterPage productFilterPage;

    /**
     * Initializes an object {@link ProductFilterStepDef}.
     *
     * @param homePage Home Page Object.
     * @param productFilterPage Product Filter Page Object.
     */
    public ProductFilterStepDef(final HomePage homePage, final ProductFilterPage productFilterPage) {
        this.homePage = homePage;
        this.productFilterPage = productFilterPage;
    }

    /**
     *
     * @param tabName
     */
    @And("I select {string} Tab")
    public void iSelectTab(final String tabName) {
        homePage.selectTab(tabName);
    }

    @And("I select {string} category")
    public void iSelectCategory(final String categoryName) {
        productFilterPage.selectCategory(categoryName);

    }

    @And("I select {string} subcategory")
    public void iSelectSubcategory(final String subcategoryName) {
        productFilterPage.selectSubCategory(subcategoryName);
    }

    @When("I select size {string} check box")
    public void iSelectSizeCheckBox(final String sizeFilter) {
        productFilterPage.selectSizeFilter(sizeFilter);
    }

    @And("I select {string} color check box")
    public void iSelectColorCheckBox(final String colorFilter) {
        productFilterPage.selectColorFilter(colorFilter);
    }

    @And("I select {string} option in Sort By dropdown")
    public void iSelectOptionInSortByDropdown(final String option) {
        productFilterPage.selectOptionInSortByDropdown(option);
    }

    @Then("Verify that {string} is displayed with a price of {string}")
    public void verifyThatIsDisplayedWithAPriceOf(final String productName, final String expectedCurrentPrice) {
        assertEquals(productFilterPage.getCurrentPrice(productName), expectedCurrentPrice);
    }

    @And("Verify that the listed items have ascendant ordering by the price")
    public void verifyThatTheListedItemsHaveAscendantOrderingByThePrice() {
        List<String> currentPrices = productFilterPage.getCurrentPrices();
        List<String> sortedPrices = productFilterPage.getSortedPrices();
        Assert.assertEquals(currentPrices, sortedPrices);
    }
}
