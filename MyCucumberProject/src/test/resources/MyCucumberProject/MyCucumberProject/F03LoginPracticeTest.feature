Feature: Login functionality on Practice Test Application

  Background: 
    Given Launch Practice Test Application

  Scenario: To validate login with valid data
    When Enter valid user name
    When Enter valid password
    And Click on Login button
    Then Home page should display

  Scenario: To validate login with invalid data
    When Enter invalid user name and invalid password
    And I Click on login button
    Then Error message should display
