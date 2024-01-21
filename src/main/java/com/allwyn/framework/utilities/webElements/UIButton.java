package com.allwyn.framework.utilities.webElements;


import net.serenitybdd.core.pages.WebElementFacade;

public class UIButton extends ParentElement {
    /**
     * Clicks the Web button when it is ready to Click
     *
     * @param prmWebElement
     */
    public void clickButton(WebElementFacade prmWebElement) {
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

    /**
     * Retrieves the Text of the  Web button
     *
     * @param prmWebElement
     */
    public String getButtonText(WebElementFacade prmWebElement) {
        return prmWebElement.getAttribute("outerText");
    }
}
