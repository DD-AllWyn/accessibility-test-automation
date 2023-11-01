@AccessibilityTestScenarios @RetailTrainingCentre @axe
Feature: 'DashBoard Page' Accessibility violation check

  Scenario: Check accessibility violations in 'Dashboard page'
    Given The Retailer navigates to Retail Training Centre Sign-In Page
    When The Retailer logs into Retail Training Centre
    Then The DashBoard Page should be displayed
    When The "DashBoard Page" is scanned with Axe WCAG 2.2 AAA standards
    Then Verify for accessibility violations and record if any