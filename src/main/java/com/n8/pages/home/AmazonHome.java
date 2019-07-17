package com.n8.pages.home;

import com.n8.pages.base.BasePage;
import com.n8.utils.CommonActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHome extends BasePage {
    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchText;

    @FindBy(css = "input[value='Go']")
    private WebElement magnifierIcon;

    public AmazonHome() {
    }

    public void setSearchText(final String text) {
        CommonActions.setInputField(searchText, text);
    }

    public void clickMagnifierIcon() {
        CommonActions.clickButton(magnifierIcon);
    }
}
