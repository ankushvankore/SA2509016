Feature: Google Search Functionality

  Scenario: To validate search functionality on Google
    Given Open Google in Browser
    When Enter some text to search
    And Hit Enter
    Then a valid search result should display
