package com.n8.pages.home;

import com.n8.pages.base.BasePage;
import com.n8.utils.CommonActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends BasePage {
    @FindBy(id = "add-to-cart-button")
    private WebElement addCartButton;

    public ItemPage() {
    }

    public void clickOnCartButton() {
        CommonActions.clickButton(addCartButton);
    }
}
