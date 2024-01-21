package com.allwyn.framework.utilities.webElements;


import net.serenitybdd.core.pages.WebElementFacade;

public class UIRadioButton extends ParentElement {
    /**
     * Selects the given Radia Button in a web page
     *
     * @param prmWebElement
     */
    public void selectRadioButton(WebElementFacade prmWebElement) {
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

}
