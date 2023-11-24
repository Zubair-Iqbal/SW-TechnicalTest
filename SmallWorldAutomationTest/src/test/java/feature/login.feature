Feature: Login functionality

 Scenario: Successful login with valid credentials
    Given user navigates to login
    When user enter valid username "standard_user" and password "secret_sauce"
    And clicks on the login button
    Then user should be redirected to the home page

  Scenario: Login with invalid credentials
     Given user navigates to login
     When user enter invalid username "invalid_user" and password "secret_sauce"
     And clicks on the login button
     Then user should see an error message "Epic sadface: Username and password do not match any user in this service"

  Scenario: Login without entering credentials
      Given user navigates to login
      And clicks on the login button
      Then user should see an error message "Epic sadface: Username is required"


