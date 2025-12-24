Feature: Google title

  Scenario: To check title of Google page
    Given Open Google
    When Read the title of page
    Then Title should be Google
