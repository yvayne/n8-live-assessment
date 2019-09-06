package com.n8.pages.automationpractice;

import com.n8.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductFilterPage extends BasePage {

    private static final String XPATH_CATEGORY = "//div[@id='categories_block_left']//span/following-sibling::a[contains(text(),'%s')]";
    private static final String XPATH_SUB_CATEGORY = "//div[@id='categories_block_left']//a[contains(text(),'%s')]";
    private static final String XPATH_CURRENT_PRICE = "//a[@class='product-name' and contains(text(), '%s')]/ancestor::div[@class='right-block']//span[@itemprop='price']";

    private static final Map<String, String> SIZE_MAP = new HashMap<>();
    static {
        SIZE_MAP.put("S", "layered_id_attribute_group_1");
        SIZE_MAP.put("M", "layered_id_attribute_group_2");
        SIZE_MAP.put("L", "layered_id_attribute_group_3");
    }

    private static final Map<String, String> COLOR_MAP = new HashMap<>();
    static {
        COLOR_MAP.put("White", "layered_id_attribute_group_8");
        COLOR_MAP.put("Black", "layered_id_attribute_group_11");
        COLOR_MAP.put("Orange", "layered_id_attribute_group_13");
        COLOR_MAP.put("Blue", "layered_id_attribute_group_14");
        COLOR_MAP.put("Green", "layered_id_attribute_group_15");
        COLOR_MAP.put("Yellow", "layered_id_attribute_group_16");
    }

    @FindBy(css = "#selectProductSort")
    private WebElement sortByDropdown;

    @FindBy(xpath = "//a[@class='product-name']/ancestor::div[@class='right-block']//span[@itemprop='price']")
    private List<WebElement> currentPrices;

    /**
     *
     * @param categoryName
     */
    public void selectCategory(final String categoryName) {
        webDriver.findElement(By.xpath(String.format(XPATH_CATEGORY, categoryName))).click();
    }

    public void selectSubCategory(final String subCategory) {
        webDriver.findElement(By.xpath(String.format(XPATH_SUB_CATEGORY, subCategory))).click();
    }

    public void selectSizeFilter(final String sizeFilter) {
        webDriver.findElement(By.cssSelector(String.format("#%s", SIZE_MAP.get(sizeFilter)))).click();
    }

    public void selectColorFilter(final String colorFilter) {
        webDriver.findElement(By.cssSelector(String.format("#%s", COLOR_MAP.get(colorFilter)))).click();
    }

    public void selectOptionInSortByDropdown(final String option) {
        Select select = new Select(sortByDropdown);
        select.selectByVisibleText(option);
    }

    public String getCurrentPrice(final String productName) {
        return webDriver.findElement(By.xpath(String.format(XPATH_CURRENT_PRICE, productName))).getText().trim();
    }

    public List<String> getCurrentPrices() {
        return currentPrices.stream()
                .map(e -> e.getText().trim().replace("$",""))
                .collect(Collectors.toList());
    }

    public List<String> getSortedPrices() {
        return currentPrices.stream()
                .map(e -> e.getText().trim().replace("$",""))
                .sorted()
                .collect(Collectors.toList());
    }
}
