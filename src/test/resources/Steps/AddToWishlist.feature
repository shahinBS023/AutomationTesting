Feature: Add product to wishlist

  Background: Perform User Login
<<<<<<< HEAD
    Given goto home page "https://localhost:44369/"
=======
    Given Goto home page "https://localhost:44369/"
#    And Goto login page
>>>>>>> main
#    Then Give login credential "1234@5678.com" and "12345678"
#    And Click on Login Button
    Then search first product "Apple iCam"
    And Verify the first product
    And click on searched product wishlist button
    Then search second  product "Flower Girl Bracelet"
    And Verify the second product
    And click on searched product wishlist button

  Scenario: Check the added wishlist and remove them
<<<<<<< HEAD
    Given goto home page "https://localhost:44369/"
=======
    Given Goto home page "https://localhost:44369/"
>>>>>>> main
    And click on wishlist button
    Then check first products are added to the wishlist
    Then check second products are added to the wishlist
    And remove both two products

