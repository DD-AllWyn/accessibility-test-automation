@TQP-171 @AccessibilityTestScenarios
Feature: Transition Portal Accessibility regression

  @TEST_TQP-157 @TESTSET_TQP-156
  Scenario: Welcome page has no WCAG 2.0 AAA accessibility standard violations
    Given the retailer is on the NL Transition Portal
    When the "welcome page" is scanned with Axe WCAG 2.0 AAA standards
    Then verify for accessibility violations and record if any

  Scenario: Login page has no WCAG 2.0 AAA accessibility standard violations
    Given the retailer is on the NL Transition Portal
    When the retailer chooses to login
    And the "login page" is scanned with Axe WCAG 2.0 AAA standards
    Then verify for accessibility violations and record if any

  Scenario: Registration page has no WCAG 2.0 AAA accessibility standard violations
    Given the retailer is on the NL Transition Portal
    When the retailer chooses to register
    And the "registration page" is scanned with Axe WCAG 2.0 AAA standards
    Then verify for accessibility violations and record if any

  Scenario: Already registered page
    Given the retailer is on the NL Transition Portal
    When the retailer "100231" "CH7 6XW" "453" registers
    And the "already registered page" is scanned with Axe WCAG 2.0 AAA standards
    Then verify for accessibility violations and record if any


  Scenario: Run an accessibility scan on the Transition Portal Splash page
    Given the retailer is on the NL Transition Portal
    When the retailer "100250" "DL13 4JF" "862" registers
    And the retailer "100250" logs in