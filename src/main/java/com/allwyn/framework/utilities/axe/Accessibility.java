package com.allwyn.framework.utilities.axe;

import com.deque.html.axecore.results.Results;
import com.deque.html.axecore.results.Rule;
import com.deque.html.axecore.selenium.AxeBuilder;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.webdriver.WebDriverFacade;

import java.util.Arrays;
import java.util.List;

public class Accessibility {
    /**
     *  Deque WCAG Standards Guide
     *  https://www.deque.com/axe/core-documentation/api-documentation/
     */


    /**
     * Accessibility Testing is carried out against WCAG22AA standard
     */
    private static final List<String> wcagStandardtags = Arrays.asList("wcag2a");
    //Few other standards(Not widely used but retained for reference if required
    //  private static final List<String> wcagStandardtags = Arrays.asList("wcag2a", "wcag2aa", "wcag2aaa", "wcag21a", "wcag21aa", "wcag22aa", "best-practice");


    /**
     * Returns the list of violated rules.
     * No Parameter is required as the scanning is carried over the current page
     * @return List of Violated rules
     */
    public static List<Rule> scanForViolations() {
        AxeBuilder builder = new AxeBuilder();
        builder.withTags(wcagStandardtags);

        WebDriverFacade webDriverFacade = (WebDriverFacade) Serenity.getDriver();
        Results results = builder.analyze(webDriverFacade);
        List<Rule> violations = results.getViolations();
        return violations;
    }

}
