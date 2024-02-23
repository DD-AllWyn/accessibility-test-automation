package com.allwyn.framework.utilities.webElements;

import net.serenitybdd.core.pages.WebElementFacade;

public class UITextBox extends ParentElement {
    /**
     * Types the value into  the  Web Text Box
     *
     * @param prmWebElement
     */
    public void enterText(WebElementFacade prmWebElement, String prmTextValue) {
        //CLEARS THE CURRENT VALUE IF ANY AND THEN ENTER THE NEW VALUE. OTHERWISE TEXT VALUE WILL GET APPENDED TO THE EXISTING VALUE
        prmWebElement.clear();
        // prmWebElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
        prmWebElement.sendKeys(prmTextValue);
       /* try {
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
        }*/
    }
}
