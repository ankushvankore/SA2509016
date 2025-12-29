Feature: Login functionality on OHRM Application

  Scenario Outline: To validate login functionality
    Given Open OHRM application
    When Enter userName as "<UserName>"
    When Enter password as "<Password>"
    And Click on the login button
    Then Dashboard page should display

    Examples: 
      | UserName   | Password      |
      | neha       | neha123       |
      | admin      | admin123      |
      | akhila     | akhila123     |
      | admin      | admin123      |
      | rajnandini | rajnandini123 |
