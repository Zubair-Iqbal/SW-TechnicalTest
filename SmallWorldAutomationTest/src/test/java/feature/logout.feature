Feature: Logout functionality

  Scenario: Successful logout
    Given user navigates to login
    When user enter valid username "standard_user" and password "secret_sauce"
    And clicks on the login button
    And user clicks on burger menu button
    And clicks on logout
    Then user should be logged out successfully