package com.n8.utils;


import com.n8.webdriver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

/**
 * Class containing Common Actions.
 */
public final class CommonActions {
    private static final Logger LOGGER = LogManager.getLogger();

    /**
     * This is the constructor for the utility class.
     */
    private CommonActions() {

    }

    /**
     * Sets text content to a web element.
     *
     * @param webElement Is web element.
     * @param content    Is the content that will be set to the web element.
     */
    public static void setInputField(final WebElement webElement, final String content) {
        DriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(content);
    }

    /**
     * Clicks action in a web element.
     *
     * @param webElement Is the web element that will be pressed.
     */
    public static void clickButton(final WebElement webElement) {
        DriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    /**
     * Clicks in a non visible element in the UI.
     *
     * @param webElement the WebElement non visible in the UI.
     */
    public static void jsClickElement(final WebElement webElement) {
        ((JavascriptExecutor) DriverManager.getInstance().getWebDriver())
                .executeScript("arguments[0].click();", webElement);
    }

    /**
     * Checks if a web element is visible.
     *
     * @param webElement is the web element.
     * @return true if web element is visible or false if it isn't visible.
     */
    public static boolean isVisible(final WebElement webElement) {
        try {
            return webElement.isDisplayed();
        } catch (NoSuchElementException e) {
            LOGGER.error("Element doesn't exists");
            LOGGER.info(e);
            return false;
        }
    }

    /**
     * Search in a WebElement list based on a content string parameter.
     *
     * @param elements is the WebElements lists.
     * @param content  is the content parameter.
     * @return the WebElement search result.
     */
    public static WebElement findWebElement(final List<WebElement> elements, final String content) {
        return elements.stream()
                .filter(element -> content.equals(element.getText()))
                .findAny()
                .orElse(null);
    }

    /**
     * Gets the text content of a WebElement.
     *
     * @param webElement is the WebElement to extract the text.
     * @return the text content of the WebElement.
     */
    public static String getTextContent(final WebElement webElement) {
        DriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        return webElement.getText();
    }

    /**
     * Gets title of current page.
     *
     * @return title of the current page.
     */
    public static String getPageTitle() {
        return DriverManager.getInstance().getWebDriver().getTitle();
    }

    /**
     * Press enter key to web element.
     *
     * @param webElement is the WebElement.
     */
    public static void pressEnterKey(final WebElement webElement) {
        webElement.sendKeys(Keys.ENTER);
    }

    /**
     * Gets error message text.
     *
     * @return the text of message error.
     */
    public static String getErrorMessage() {
        WebElement webElement = DriverManager.getInstance().getWebDriverWait()
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-aid='AlertDialog']")));
        return webElement.getText();
    }

    /**
     * Accepts alert dialog.
     */
    public static void acceptAlert() {
        Alert alert = DriverManager.getInstance().getWebDriver().switchTo().alert();
        alert.accept();
    }
}
