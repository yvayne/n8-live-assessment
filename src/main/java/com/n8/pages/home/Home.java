package com.n8.pages.home;

import com.n8.pages.base.BasePage;
import com.n8.utils.CommonActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Represents google home page.
 */
public class Home extends BasePage {

    @FindBy(name = "q")
    private WebElement searchText;

    @FindBy(css = ".FPdoLc center .gNO89b")
    private WebElement searchButton;

    @FindBy(id = "hplogo")
    private WebElement googleLogo;

    /**
     * Constructor method.
     */
    public Home() {
    }

    /**
     * Sets the value on search text field.
     *
     * @param text value to configure.
     */
    public void setSearchText(final String text) {
        CommonActions.setInputField(searchText, text);
    }

    /**
     * Performs click on search button.
     */
    public void clickSearchButton() {
        CommonActions.clickButton(searchButton);
    }

    /**
     * Performs click on  logo image.
     */
    public void clickLogo() {
        CommonActions.clickButton(googleLogo);
    }
}
