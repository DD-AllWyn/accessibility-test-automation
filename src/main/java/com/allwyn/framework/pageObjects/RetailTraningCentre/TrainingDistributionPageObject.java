package com.allwyn.framework.pageObjects.RetailTraningCentre;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TrainingDistributionPageObject extends PageObject {
    public static final String TRAININGDISTRIBUTION_PAGE_TITLE = "Training distribution";

    public static final String DISTRIBUTETRAINING_PAGE_TITLE = "Distribute training";
    @FindBy(xpath = "//a[@href='/distribution/distribute/']")
    public WebElementFacade lnkDistributeTraining;
    @FindBy(xpath = "//span[contains(text(),'All types of user')]/parent::a")
    public WebElementFacade ddwTypesOfUser;

    @FindBy(css = "button[value='select_training_items']")
    public WebElementFacade btnSelectTrainingItems;
    @FindBy(xpath = "//span[contains(text(),'All available training')]/parent::a")
    public WebElementFacade ddwWhichTraining;
    @FindBy(css = "button[value='configure_training_items']")
    public WebElementFacade btnConfigureTrainingItems;

    @FindBy(css = "button[value='review']")
    public WebElementFacade btnReview;
    @FindBy(xpath = "//h2[contains(text(),'Review')]")
    public WebElementFacade hdrReview;
    @FindBy(xpath = "(//tr/td)[1]")
    public WebElementFacade lnkFirstRowInTrainingDistribution;

}
