@skip
  Feature: Check all the url are navigated from home page

    Scenario: Goto Register page from home page
      Given Goto home page "https://localhost:44369/"
      Then Check the home page title "Your store. Home page title"