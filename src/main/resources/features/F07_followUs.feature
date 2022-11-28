@smoke
Feature: F07_followUs | check the follow us icons


  Scenario: Check FB icon
    When clicking on the fb icon
    Then verify the fb url

  Scenario: Check twitter icon
    When clicking on the twit icon
    Then verify the twit url


  Scenario: Check Rss icon
    When clicking on the Rss icon
    Then verify the Rss url

  Scenario: Check youtube icon
    When clicking on the yout icon
    Then verify the yout url

