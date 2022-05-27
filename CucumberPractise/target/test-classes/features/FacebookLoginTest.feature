Feature: As a facebook user, I want to login to my facebook account

  Background: Open facebook page
    Given I navigate to "https://www.facebook.com"


  Scenario Outline: Verify the facebook login
    Given facebook page is open
    When I enter "7893278534" and "071220000" in email and password fields
    Then I want to see my profile page