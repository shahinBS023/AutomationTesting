@test
Feature: Login for multiple user using Cucumber datatable
  Background: Login user
    Given Goto login page
    Then Give login credential email and password
    |rowNo|email|password|
    |0|1234@5678.com|12345678|
    And Click on Login Button