package com.n8.pages.home;

import com.n8.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart extends BasePage {
    @FindBy(css = "span[class='a-size-medium sc-product-title a-text-bold']")
    private WebElement bookElement;

    @FindBy(css = "span[class='a-size-medium a-color-price sc-price sc-white-space-nowrap sc-product-price sc-price-sign a-text-bold']")
    private WebElement priceLabel;

    @FindBy(css = "span[class='a-dropdown-prompt']")
    private WebElement quantityLabel;

    public ShoppingCart() {
    }

    public String getBookTitle() {
        return bookElement.getText();
    }

    public String getPriceLabel() {
        return priceLabel.getText();
    }

    public String getQuantity() {
        return quantityLabel.getText();
    }
}
