
Feature: As a user i want to login into spotifylogin page 
 
  Scenario Outline: login into spotify page
    Given i clicked "https://www.spotify.com"
    And i clicked login button
    When I enter "<username>" and "<password>" in fields
    Then I see spotify page

Examples:
      | username                   | password          |
      | kaladisanthosh24@gmail.com | Santhosh@24       |
      | kaauoioou@gmail.com        | Spotify@2         |