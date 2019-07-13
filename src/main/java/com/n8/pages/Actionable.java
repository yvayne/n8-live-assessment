package com.n8.pages;

/**
 * Defines the strategy lambda functional interface.
 */
@FunctionalInterface
public interface Actionable {

    /**
     * This method execute a specific step to fill a form page.
     */
    void executeStep();
}
