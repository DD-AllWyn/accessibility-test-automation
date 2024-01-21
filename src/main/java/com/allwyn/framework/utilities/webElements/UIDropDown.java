package com.allwyn.framework.utilities.webElements;


import net.serenitybdd.core.pages.WebElementFacade;

public class UIDropDown extends ParentElement {
    /**
     * Selects a value(identified by its visible text) from the Web List
     *
     * @param prmWebElement,prmValue
     */
    public void selectByVisibleText(WebElementFacade prmWebElement, String prmValue) {
        try {
            waitForPageToLoad();
            if (getElementWhenReady(prmWebElement)) {
                prmWebElement.selectByVisibleText(prmValue);
            }
        } catch (Exception Ex) {
            Ex.printStackTrace();
        } finally {

        }

    }

    /**
     * Selects a value(identified by its associated value) from the Web List
     *
     * @param prmWebElement,prmValue
     */
    public void selectByValue(WebElementFacade prmWebElement, String prmValue) {
        try {
            waitForPageToLoad();
            if (getElementWhenReady(prmWebElement)) {
                prmWebElement.selectByValue(prmValue);
            }
        } catch (Exception Ex) {
            Ex.printStackTrace();
        } finally {

        }
    }

    /**
     * Selects a value(identified by the index of the value) from the Web List
     *
     * @param prmWebElement,prmValue
     */
    public void selectByIndex(WebElementFacade prmWebElement, int prmIndex) {
        try {
            waitForPageToLoad();
            if (getElementWhenReady(prmWebElement)) {
                prmWebElement.selectByIndex(prmIndex);
            }
        } catch (Exception Ex) {
            Ex.printStackTrace();
        } finally {

        }

    }

    /**
     * Retrieves the selected value from the Web Dropdown element
     *
     * @param prmWebElement
     * @return selected value as string
     */
    public String getSelectedValue(WebElementFacade prmWebElement) {
        return prmWebElement.getAttribute("value");
    }

}
