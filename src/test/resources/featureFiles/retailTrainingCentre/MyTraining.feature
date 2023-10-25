@AccessibilityTestScenarios @RetailTrainingCentre
Feature: 'My Training page' Accessibility violation check

  Background:
    Given The Retailer navigates to Retail Training Centre Sign-In Page
    When The Retailer logs into Retail Training Centre
    Then The DashBoard Page should be displayed

  @axe
  Scenario: Check accessibility violations in 'My Training page'
    When The Retailer Selects My Own Training
    Then The My Training page should be Displayed
    When The "My Training page" is scanned with Axe WCAG 2.2 AAA standards
    Then Verify for accessibility violations and record if any