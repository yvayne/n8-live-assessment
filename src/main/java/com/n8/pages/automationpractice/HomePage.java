package com.n8.pages.automationpractice;

import com.n8.pages.base.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private static final String CSS_TAB = "a[title='%s']";

    /**
     *
     * @param tabName
     */
    public void selectTab(final String tabName) {
        webDriver.findElement(By.cssSelector(String.format(CSS_TAB, tabName))).click();
    }
}
