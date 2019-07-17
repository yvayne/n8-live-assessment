package com.n8.pages.home;

import com.n8.pages.base.BasePage;
import com.n8.utils.CommonActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewPage extends BasePage {
    @FindBy(id = "nav-cart")
    private WebElement cartIcon;

    @FindBy(id = "huc-v2-order-row-messages")
    private WebElement textLabel;

    public ViewPage() {
    }

    public void clickCartIcon() {
        CommonActions.clickButton(cartIcon);
    }

    public String getMessageLabel() {
        return textLabel.getText();
    }
}
