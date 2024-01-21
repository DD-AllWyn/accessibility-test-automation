package com.allwyn.framework.utilities.webElements;

import net.serenitybdd.core.pages.WebElementFacade;

public class UICheckBox extends ParentElement {
    /**
     * Checks the given Checkbox in a web page
     *
     * @param prmWebElement
     */
    public void checkCheckBox(WebElementFacade prmWebElement) {
        try {
            waitForPageToLoad();
            if (getElementWhenReady(prmWebElement)) {
                if (!getCheckedState(prmWebElement))
                    prmWebElement.click();
            }
        } catch (Exception Ex) {
            Ex.printStackTrace();
        } finally {

        }
    }

    /**
     * Uncheck the given Checkbox in a web page
     *
     * @param prmWebElement
     */
    public void unCheckCheckBox(WebElementFacade prmWebElement) {
        try {
            waitForPageToLoad();
            if (getElementWhenReady(prmWebElement)) {
                if (getCheckedState(prmWebElement))
                    prmWebElement.click();
            }
        } catch (Exception Ex) {
            Ex.printStackTrace();
        } finally {

        }
    }
}
