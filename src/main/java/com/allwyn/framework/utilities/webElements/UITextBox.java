package com.allwyn.framework.utilities.webElements;

import net.serenitybdd.core.pages.WebElementFacade;

public class UITextBox extends ParentElement {
    /**
     * Types the value into  the  Web Text Box
     *
     * @param prmWebElement
     */
    public void TypeInto(WebElementFacade prmWebElement, String prmTextValue) {
        try {
            waitForPageToLoad();
            if (getElementWhenReady(prmWebElement)) {
                //CLEARS THE CURRENT VALUE IF ANY AND THEN ENTER THE NEW VALUE. OTHERWISE TEXT VALUE WILL GET APPENDED TO THE EXISTING VALUE
                prmWebElement.clear();
                // prmWebElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
                prmWebElement.sendKeys(prmTextValue);
            }
        } catch (Exception Ex) {
            Ex.printStackTrace();
        } finally {
        }
    }

    /**
     * Retrieves the Text from the  Web TextBox
     *
     * @param prmWebElement
     */
    public String getTextValue(WebElementFacade prmWebElement) {
        return prmWebElement.getText();
    }

    /**
     * Clears the Text from the  Web TextBox
     *
     * @param prmWebElement
     */
    public void clearValue(WebElementFacade prmWebElement) {
        try {
            waitForPageToLoad();
            if (getElementWhenReady(prmWebElement)) {
                prmWebElement.clear();
                // prmWebElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
            }
        } catch (Exception Ex) {
            Ex.printStackTrace();
        } finally {
        }
    }
}
