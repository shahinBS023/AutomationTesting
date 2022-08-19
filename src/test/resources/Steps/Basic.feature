@skip
Feature: Goto home page and login

  Scenario: Goto home page and login
    Given Goto home page "https://localhost:44369/"
    And Check the home page title "Your store. Home page title"
    Then Goto login page
    Then Give login credential "1234@5678.com" and "12345678"
    Then Click on Login Button