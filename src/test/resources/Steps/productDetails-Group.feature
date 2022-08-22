Feature: Verify the group product details

  Scenario: Verify the group product details by the product title
    Given Goto home page "https://localhost:44369/"
    Then Hover Electronics category
    And Click on camera and photo category
    And Category page title should be "Your store. Camera & photo"
    Then click on product name of Nikon DSLR
    And Product page title should be "Your store. Nikon D5500 DSLR"
    And "Nikon D5500 DSLR - Black" and "Nikon D5500 DSLR - Red" product should be present
