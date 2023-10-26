@AccessibilityTestScenarios @RetailTrainingCentre
Feature: 'Users' Accessibility violation check

  Background:
    Given The Retailer navigates to Retail Training Centre Sign-In Page
    When The Retailer logs into Retail Training Centre
    Then The DashBoard Page should be displayed
    When The Retailer Select Users Menu
    Then The Users page should be Displayed

  Scenario: Check accessibility violations in 'Users'
    When The "Users Page" is scanned with Axe WCAG 2.2 AAA standards
    Then Verify for accessibility violations and record if any

  Scenario: Check accessibility violations in 'Users - Create New User'
    When The Admin Selects Create New User
    Then The Create New User page should be Displayed
    When The "Create New User" is scanned with Axe WCAG 2.2 AAA standards
    Then Verify for accessibility violations and record if any

  @axe
  Scenario: Check accessibility violations in 'Retailer Account Page'
    When The Admin Selects Retailer From Users Table
    When The "Retailer Account Page" is scanned with Axe WCAG 2.2 AAA standards
    Then Verify for accessibility violations and record if any