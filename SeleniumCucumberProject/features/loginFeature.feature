Feature: Login feature

  Scenario Outline: Login is successful with valid & invalid creds
    Given I launch the chrome browser
    When I open orangehrm homepage
    And user enters <username> and <password> and perform login
    Then I verify that user redirects to dashboard
    And close browser

    Examples: 
      | username | password   |
      | Admin    | admin123   |
      | Admin1   | admin123   |
      | %Admin%  | %admin123% |
