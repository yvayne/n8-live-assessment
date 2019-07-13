package com.n8.pages.home;

import com.n8.pages.base.BasePage;
import com.n8.utils.CommonActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Represents the search result page.
 */
public class SearchResult extends BasePage {

    @FindBy(css = "input.gLFyf.gsfi")
    private WebElement searchText;

    /**
     * Constructor method.
     */
    public SearchResult() {
    }

    /**
     * Gets the text on search text field.
     *
     * @return text.
     */
    public String getTextFromSearch() {
        return CommonActions.getContent(searchText);
    }
}
