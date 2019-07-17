package com.n8.stepdefs;

import com.n8.pages.home.ShoppingCart;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class ShoppingCartSteps {
    private ShoppingCart shoppingCart;

    public ShoppingCartSteps() {
        shoppingCart = new ShoppingCart();
    }

    @Then("^I verified the book title should be: \"([^\"]*)\"$")
    public void iVerifiedTheBookTitleShouldBe(final String expectedTitle) {
        String actualResult = shoppingCart.getBookTitle();
        Assert.assertEquals(actualResult, expectedTitle);
    }

    @Then("^Verify the price should be: \"([^\"]*)\"$")
    public void verifyThePriceShouldBe(final String expectedPrice) {
        Assert.assertEquals(shoppingCart.getPriceLabel(), expectedPrice);
    }

    @Then("^Verify the item has been added the quantity should be: \"([^\"]*)\"$")
    public void verifyTheItemHasBeenAddedTheQuantityShouldBe(final String expectedQuantity) {
        Assert.assertEquals(shoppingCart.getQuantity(), expectedQuantity);
    }
}
