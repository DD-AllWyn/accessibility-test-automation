package com.allwyn.framework.utilities.webElements;

import net.serenitybdd.core.pages.WebElementFacade;

public class UILabel extends ParentElement {
    /**
     * Retrieves the Text of the  Web Label
     *
     * @param prmWebElement
     */
    public String getTextValue(WebElementFacade prmWebElement) {
        return prmWebElement.getText();
    }
}
