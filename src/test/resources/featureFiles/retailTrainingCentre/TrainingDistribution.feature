@AccessibilityTestScenarios @RetailTrainingCentre @axe
Feature: 'Training Distribution' Accessibility violation check

  Background:
    Given The Retailer navigates to Retail Training Centre Sign-In Page
    When The Retailer logs into Retail Training Centre
    Then The DashBoard Page should be displayed

  Scenario: Check accessibility violations in 'Training Distribution page'
    When The Retailer selects Passed Or Completed Modules
    Then The Training Distribution Page should be displayed
    When The "Training Distribution Page" is scanned with Axe WCAG 2.2 AAA standards
    Then Verify for accessibility violations and record if any

  Scenario: Check accessibility violations in 'Distribute Training page -Select User'
    When The Retailer selects Passed Or Completed Modules
    Then The Training Distribution Page should be displayed
    When The Retailer selects Distribute Training
    When The "Distribute Training Page - Select User" is scanned with Axe WCAG 2.2 AAA standards
    Then Verify for accessibility violations and record if any


  Scenario: Check accessibility violations in 'Distribute Training - Select Training Items'
    When The Retailer selects Passed Or Completed Modules
    Then The Training Distribution Page should be displayed
    When The Retailer selects Distribute Training
    When The Retailer selects Training Items
    When The "Distribute Training Page - Select Training Items" is scanned with Axe WCAG 2.2 AAA standards
    Then Verify for accessibility violations and record if any

    #Scenario is incomplete as Configure Training Items flow is not working
  Scenario: Check accessibility violations in 'Distribute Training - Configure Training Items'
    When The Retailer selects Passed Or Completed Modules
    Then The Training Distribution Page should be displayed
    When The Retailer selects Distribute Training
    Then The Distribute Training Page should be displayed
    When The Retailer selects Configure Training Items
    When The "Distribute Training Page - Configure Training Items" is scanned with Axe WCAG 2.2 AAA standards
    Then Verify for accessibility violations and record if any

  Scenario: Check accessibility violations in 'Distribute Training - Review'
    When The Retailer selects Passed Or Completed Modules
    Then The Training Distribution Page should be displayed
    When The Retailer selects Distribute Training
    Then The Distribute Training Page should be displayed
    When The Retailer selects Training Items
    When The Retailer selects Configure Training Items
    When The Retailer selects Review
    When The "Distribute Training Page - Review" is scanned with Axe WCAG 2.2 AAA standards
    Then Verify for accessibility violations and record if any