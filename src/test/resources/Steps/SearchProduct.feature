Feature: Search a product

  Scenario: Search a product bt product name
    Given Goto home page-for search
    Then Give product name for search "Apple MacBook Pro 13-inch"
    And click the search button
    Then Check the search product "Apple MacBook Pro 13-inch"