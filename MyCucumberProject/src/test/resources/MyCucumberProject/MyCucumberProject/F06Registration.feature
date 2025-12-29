Feature: Test Registration

  Scenario: Validate registration process
    Given Launch the application in browser
    When Enter folliwing data
      | Varsha | Chandel | Delhi   | varsha@gmail.com | 7575757575 |
      | Neha   | Sharma  | Patiala | neha@gmail.com   | 8989898989 |
    Then Registration successful
