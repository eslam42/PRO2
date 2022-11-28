@smoke
Feature: F02_Login | users could use login functionality to use their accounts



  Scenario: user could login with valid email and password
  Given user go to login pagee
  When user login with "test@example.com" and "P@ssw0rd"
  And user press on login buton
  Then user login to the systeem sucesfully


  Scenario: user could login with invalid email and password
  Given user go to login pagee
  When user login with "wrong@example.com" and "P@ssw0rd"
  And user press on login buton
  Then user could not login to the systeem
