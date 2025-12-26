@SeleniumTest
Feature: Test Selenium Web Site

  Background: 
    Given Launch the application "https://www.selenium.dev/"

  @SmokeTest
  Scenario: To test Downloads page
    When Click on Downloads link
    Then Downloads page should open

  @DocumentationTest
  Scenario: To test Documentation page
    When Click on Documentation link
    Then Documentation page should display

  @UITest
  Scenario: To test Projects page
    When Click on Projects link
    Then Projects page should display

  @SupportTest
  Scenario: To test Support page
    When Click on Support link
    Then Support page should display
