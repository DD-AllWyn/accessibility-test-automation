package com.allwyn.framework.utilities.webElements;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ParentElement extends PageObject {
    public static final int MAX_RETRIES = 10;

    /**
     * Web Driver will wait for the page to get loaded completely
     */
    protected void waitForPageToLoad() {
        try {
            String pageLoaded = evaluateJavascript("return document.readyState").toString();
            while (!pageLoaded.equals("complete")) {
                Thread.sleep(500);
                pageLoaded = evaluateJavascript("return document.readyState").toString();
            }
        } catch (Exception Ex) {
            Ex.printStackTrace();
        }
    }

    /**
     * Checks whether the web element is ready to act upon.
     * Web Page is scrolled up/down until either the element is found or max_retry is reached.
     * Web Driver will be paused for 500 ms between each tries while locating the element
     *
     * @param prmWebElement
     * @return true when the mobile element is ready
     */
    public  boolean getElementWhenReady(WebElementFacade prmWebElement) {

        for (int retry = 1; retry < MAX_RETRIES; retry++) {
            try {
                Thread.sleep(500);
                prmWebElement.waitUntilPresent();
                prmWebElement.waitUntilEnabled();
                scrollToViewElement(prmWebElement);
                if (prmWebElement.isPresent()) {
                    return true;
                }
            } catch (Exception Ex) {
                Ex.printStackTrace();
                System.out.println("TRYING TO FIND THE ELEMENT FOR THE " + retry + "  TIME");
            }
        }
        return false;
    }

    /**
     * Web Page is scrolled to make the web element visible if present
     *
     * @param prmWebElement
     */
    protected void scrollToViewElement(WebElementFacade prmWebElement) {
        evaluateJavascript("var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));", prmWebElement);
    }

    /**
     * Checks the 'selected' status of the given Web Element
     *
     * @param prmWebElement
     * @return true if the Checkbox/RadioButton is checked
     */
    public boolean getCheckedState(WebElementFacade prmWebElement) {
        return Boolean.parseBoolean(prmWebElement.getAttribute("checked"));
    }

}
