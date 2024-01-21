package com.allwyn.framework.utilities.webElements;


import net.serenitybdd.core.pages.WebElementFacade;

public class UIMenu extends ParentElement {
    /**
     * Selects the Web Menu by clicking it when it is ready
     *
     * @param prmWebElement
     */
    public void selectMenu(WebElementFacade prmWebElement) {
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
