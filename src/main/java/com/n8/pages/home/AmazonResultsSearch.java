package com.n8.pages.home;

import com.n8.pages.base.BasePage;
import com.n8.utils.CommonActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonResultsSearch extends BasePage {
    @FindBy(xpath = "//span[text()='Complete Guide to Test Automation: Techniques, Practices, and Patterns for Building and Maintaining Effective Software Projects']")
    private WebElement firstResult;

    public AmazonResultsSearch() {
    }

    public void clickResult() {
        CommonActions.clickButton(firstResult);
    }
}
