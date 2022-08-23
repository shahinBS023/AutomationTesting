
#Feature: Login for multiple user using Cucumber datatable
#  Scenario: : Login user
#    Given Perform Login with given datatable
#      |email|password|
#      |1234@5678.com|12345678|
#      |1234@5678.com|12345678|

Feature: Login for multiple user using Cucumber datatable
  Scenario Outline: : Login user
    Given Goto login page
    Then Give the email "<email>" and password "<password>"
    And Click on Login Button
    Examples:
    |email|password|
    |1234@5678.com|12345678|
    |1234@5678.com|12345678|