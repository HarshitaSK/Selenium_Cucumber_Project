Feature: Verify funcionality of registration Page

  Background: 
    Given user launches the application

  Scenario: Try to register with valid PI and invalid email
    Given user is in registration page
    When user fills the registration form with valid firstname and lastname
    And user fills invalid emailid
    And user fills password and confirms with same password
    And user submits the registration form
    Then should get an error_message1

  Scenario: Try to register with valid PI and different password and confirm password
    Given user is in registration page
    When user fills the registration form with valid firstname and lastname
    And user fills emailid
    And user enters a password
    And user enters different password in confirm password field
    And user submits the registration form
    Then user should see an error_message2

  Scenario: Register with empty emailid field
    Given user is in registration page
    When user fills the registration form with valid firstname and lastname
    And user fills password and confirms with same password
    And user submits the registration form
    Then user should get error_message3

  Scenario: Register with firstname field blank
    Given user is in registration page
    When user fills the lastname field
    And user fills emailid
    And user fills password and confirms with same password
    And user submits the registration form
    Then user should get error_message4

  Scenario: Register with lastname field blank
    Given user is in registration page
    When user fills the firstname field
    And user fills emailid
    And user fills password and confirms with same password
    And user submits the registration form
    Then user should get error_message5

  Scenario: Register with password less than eight characters
    Given user is in registration page
    When user fills password field with less than eight characters
    Then user should get error_message6

  Scenario: Password has more than eight characters but has only alphabets
    Given user is in registration page
    When user fills password field with more than eight alphabets
    Then user should get error_message7
    And should display password length as weak

  Scenario: Register with confirm password field blank
    Given user is in registration page
    When user fills the registration form with valid firstname and lastname
    And user enters a password
    And user submits the registration form
    Then user should see an error_message8

  Scenario Outline: password strength is more than eight and has combination of characters
    Given user is in registration page
    When user enters "<password>" with more than eight and with alphanumeric and special characters
    Then Should display password strength as "<password_strength>"

    Examples: 
      | password    | password_strength              |
      | qwertyjfhf  | Password Strength: Weak        |
      | QWert_12    | Password Strength: Medium      |
      | QWert_123   | Password Strength: Strong      |
      | QWert_1233@ | Password Strength: Very Strong |
