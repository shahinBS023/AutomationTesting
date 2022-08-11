Feature: Check order details
  Background: Perform Login
    Given Goto login page
    Then Give login credential "1234@5678.com" and "12345678"
    And Click on Login Button

    Scenario: Check order page
      Given Click MyAccount page from home page
      Then Click on order
      Then Click on details
      And Check the Order number "ORDER #15"
