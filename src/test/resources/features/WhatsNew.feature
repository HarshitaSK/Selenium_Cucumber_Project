Feature: validate What's New page

  Background: 
    Given user is already logged in

  Scenario: user navigates to What's New Page
    When user clicks on What's New
    Then user should navigate to What's new page

  Scenario: navigate to Hoodies and Sweatshirts page
    Given user clicks on What's New
    When user clicks on Hoodies and Sweatshirts
    Then should navigate to Hoodies and Tshirts page

  Scenario: navigate to Jackets page
    Given user clicks on What's New
    When user clicks on Jacket
    Then user should navigate to Jackets page

  Scenario: navigate to Tees page
    Given user clicks on What's New
    When user clicks on Tees
    Then user should navigate to Tee page

  Scenario: navigate to Bras & Tanks page
    Given user clicks on What's New
    When user clicks on Bras & Tanks
    Then user should navigate to Bras & Tanks page

  Scenario: navigate to Pants page
    Given user clicks on What's New
    When user clicks on Pants
    Then user should navigate to Pants page

  Scenario: navigate to Shorts page
    Given user clicks on What's New
    When user clicks on Shorts
    Then user should navigate to Shorts page
