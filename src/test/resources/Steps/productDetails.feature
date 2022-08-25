@test
Feature: Check Product Details

  Scenario: Goto home page and click product
    Given Goto home page "https://localhost:44369/"
    Then Check the home page title "Your store. Home page title"
   # And Click on product
    Then Goto Product details page
    Then Check the product details page title "Your store. Build your own computer"
    And Check the product title "Build your own computer"


