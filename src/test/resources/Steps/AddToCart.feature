@test
Feature: Add product to Cart

  Background: Add product to the cart
    Given Goto home page "https://localhost:44369/"
    Then search first product "Apple iCam"
    And Verify the first product
    And click on searched product Add to cart button
    Then search second  product "Flower Girl Bracelet"
    And Verify the second product
    And click on searched product Add to cart button

  Scenario: Check the added product to cart and remove them
    Given Goto home page "https://localhost:44369/"
    And click on Shopping Cart Button
    Then check first products are added to the cart
    Then check second products are added to the cart
    And remove both two products from cart
