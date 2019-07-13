package com.n8.webdriver;

import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;

/**
 * It is in charged to instantiate web driver.
 */
public final class DriverFactory {


    /**
     * Private Constructor for the DriverFactory utility class.
     */
    private DriverFactory() {
    }

    /**
     * Return the WebDriver instance specified by the environment properties.
     *
     * @param driverType Enum value specified from DriverType.
     * @return a WebDriver instance.
     */
    public static WebDriver getDriverManager(final DriverType driverType) {
        Map<DriverType, Browser> map = new EnumMap<>(DriverType.class);
        map.put(DriverType.CHROME, new ChromeBrowser());
        map.put(DriverType.FIREFOX, new FirefoxBrowser());
        return map.get(driverType).getBrowser();
    }
}
