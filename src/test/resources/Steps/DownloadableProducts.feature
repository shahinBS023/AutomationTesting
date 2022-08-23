@download
Feature: Check Downloadable product working
  Background: Perform user login
    Given Goto login page
    Then Give login credential "1234@5678.com" and "12345678"
    And Click on Login Button

  Scenario: Download a product and check it
    Given Goto downloadable product page "https://localhost:44369/customer/downloadableproducts"
    Then Check any downloadable product present there or not
    Then Click the download button
    And Check product is downloaded or not

