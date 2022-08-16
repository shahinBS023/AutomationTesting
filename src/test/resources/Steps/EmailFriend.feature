@New
Feature: Email a product details to a friend

  Scenario: Email a product without user login
    Given Goto the home page "https://localhost:44369/"
    Then Hover Computer category
    And Click on the Notebook category
    And Click a product name of HP Spectre XT Pro UltraBook
    Then Check product details page title "Your store. HP Spectre XT Pro UltraBook"
    Then Click on Email A Friend Button
    And Page title should be "Your store. Email A Friend. HP Spectre XT Pro UltraBook"
    Then Enter the friends email address "shahin@gmail.com"
    And Enter the Your email address "1234@5678.com"
    And Enter a message "Hello Shahin\nYou can try this product."
    Then Click on Send Email button
    And Get a warning message "Only registered customers can use email a friend feature"

  Scenario: Email a product with user login
    Given Goto login page
    Then Give login credential "1234@5678.com" and "12345678"
    And Click on Login Button
    Then Goto the home page "https://localhost:44369/"
    Then Hover Computer category
    And Click on the Notebook category
    And Click a product name of HP Spectre XT Pro UltraBook
    Then Check product details page title "Your store. HP Spectre XT Pro UltraBook"
    Then Click on Email A Friend Button
    And Page title should be "Your store. Email A Friend. HP Spectre XT Pro UltraBook"
    Then Enter the friends email address "shahin@gmail.com"
    And Enter a message "Hello Shahin\nYou can try this product."
    Then Click on Send Email button
    And Get a confirm message "Your message has been sent."


