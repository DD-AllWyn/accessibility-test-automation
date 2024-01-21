package com.allwyn.framework.utilities.webElements;

import net.serenitybdd.core.pages.WebElementFacade;

public class UILink extends ParentElement {

    /**
     * Clicks the Web Link when it is ready to Click
     *
     * @param prmWebElement
     */
    public void clickLink(WebElementFacade prmWebElement) {
        try {
            waitForPageToLoad();
            if (getElementWhenReady(prmWebElement)) {
                prmWebElement.click();
            }
        } catch (Exception Ex) {
            Ex.printStackTrace();
        } finally {
        }
    }
}
