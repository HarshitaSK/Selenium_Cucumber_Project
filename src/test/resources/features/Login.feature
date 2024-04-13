Feature: to verify login Functionality

  Background: 
    Given user launch the application

  Scenario: verify with valid Credentials
    Given user clicks on SignIn
    When user enters valid emailid
    When user enters valid password
    When user clicks on submit button
    Then user should be logged in successfully

  Scenario Outline: verify with invalid credentials
    Given user clicks on SignIn
    When user enters emailid "<username>"
    When user enters password "<password>"
    When user clicks on submit button
    Then error message1 is displayed "<expectedError>"

    Examples: 
      | username | password | expectedError                                                |
      | Great    | pass     | Please enter a valid email address (Ex: johndoe@domain.com). |
      |          | grehh    | Please enter a valid email address (Ex: johndoe@domain.com). |

  Scenario: should direct to forgotten password page
    Given user clicks on SignIn
    When user clicks on forgot password button
    Then should direct to Forgot your password page

  Scenario Outline: verify with wrong username/password
    Given user clicks on SignIn
    When user enters emailid1 "<username1>"
    When user enters password1 "<password1>"
    When user clicks on submit button
    Then error message2 is displayed "<expectedError1>"

    Examples: 
      | username1            | password1     | expectedError1                                                                                              |
      | harshitask@gmail.com | pass          | The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later. |
      | harshisk@gmail.com   | Bangalore@123 | The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later. |
      | harshisk@gmail.com   | pass          | The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later. |
