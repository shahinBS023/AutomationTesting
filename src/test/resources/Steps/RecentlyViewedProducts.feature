Feature: Check recently view product is present in recently view page
  Background: View a product
    Given Goto home page "https://localhost:44369/"
    Then Send "Apple iCam" product name to the search page
    And click the search button
    Then Click the searched product

  Scenario: Check that the viewed product is present in recently view page
    Given Goto home page "https://localhost:44369/"
    Then scroll down to the footer and click Recently viewed products
    And Check the viewed product is present or not
