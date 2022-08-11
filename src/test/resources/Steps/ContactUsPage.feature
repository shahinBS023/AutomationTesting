Feature: Validate the contact us feature

  Scenario Outline: Get contact data from the excel sheet
    Given Go to the contact us page "https://localhost:44369/contactus"
    Then Check the contact us page title "Your store. Contact Us"
    Then Fill the information from the sheet name "<SheetName>" and rowNumber <RowNumber>
    And click the submit button
    Then Show a success message "Your enquiry has been successfully sent to the store owner."

    Examples:
    |SheetName|RowNumber|
    |contactUsData|0|
    |contactUsData|1|