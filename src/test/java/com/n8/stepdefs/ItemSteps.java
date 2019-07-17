package com.n8.stepdefs;

import com.n8.pages.home.ItemPage;
import cucumber.api.java.en.And;

public class ItemSteps {
    private ItemPage itemPage;

    public ItemSteps() {
        itemPage = new ItemPage();
    }

    @And("^I click on add cart button on item page$")
    public void iClickOnAddCartButtonOnItemPage() {
        itemPage.clickOnCartButton();
    }
}
