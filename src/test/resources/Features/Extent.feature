Feature: User Registration
  Scenario: User Registration with different details
    Given user is on registration page
    When user enters following details
      | kavya | kavya@gmail.com | 051299 |
      | Navya | navya@gmail.com | 051299 |
      | Divya | divya@gmail.com | 051299 |
    Then user registration should be successful