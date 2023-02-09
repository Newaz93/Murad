Feature: This feature is for Login Functinality


@newcart
  Scenario: verify login
    Given launch "<URL>"
    Then Click Login Link
    Then Enter Username and Enter Password and Click Login button
    Then Verify user can login with valid crad