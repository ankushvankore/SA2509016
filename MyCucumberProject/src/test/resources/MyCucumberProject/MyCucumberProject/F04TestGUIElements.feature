Feature: Test GUI Elements

Background:
Given Open Test Automation Page

  Scenario: To test GUI elements on Test Automation Page
    
    #here as is not a keyword, we added it to make the statement more meaningful
    When Enter name as "Suhasini"
    When Enter email as "suhasini@gmail.com"
    When Enter phone no as "9898989898"
    When Enter address as "Pune"
    When Select gender "Female"
    Then Process complete
    
    Scenario: To test GUI Elements with male data
    When I Enter name as "Amir"
    When I Enter email as "amir@gmail.com"
    When I Enter phone no as "8787878787"
    When I Enter address as "Delhi"
    When I Select gender "Male"
    Then The Process is complete
    
