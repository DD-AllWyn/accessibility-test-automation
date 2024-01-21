package com.allwyn.framework.utilities.webElements;

import net.serenitybdd.core.pages.WebElementFacade;

public class UIList {
    /**
     * Retrieves the Text of the  Selected value in a Web List
     *
     * @param prmWebElement
     */
    public String getTextValue(WebElementFacade prmWebElement) {
        return prmWebElement.getText();
    }
}
