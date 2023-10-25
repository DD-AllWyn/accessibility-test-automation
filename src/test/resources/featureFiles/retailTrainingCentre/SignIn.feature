@AccessibilityTestScenarios @RetailTrainingCentre
Feature: 'Sign-In Page' Accessibility violation check

  Scenario: Check accessibility violations in 'Sign-In page'
    Given The Retailer navigates to Retail Training Centre Sign-In Page
    When The "Sign In page" is scanned with Axe WCAG 2.2 AAA standards
    Then Verify for accessibility violations and record if any