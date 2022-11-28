@smoke
  Feature: F01_Register | users could register with new accounts
    Scenario: guest user could register with valid data successfully
      Given user go to register pages
      When user select gender typee
      And user enter "Automation" and "Tester"
      And user enter date of birthh
      And user enter email fieldd
      And user fills Password fields "P@ssw0rd" "P@ssw0rd"
      And user clicks on register buton
      Then success message is displayedd