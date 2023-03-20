Feature: As a user, I should be able to land on Employees menu; so that I can use Employees modules

  Scenario:verify user should be able to land on Employees menu
    Given user enters valid credentials
    When user clicks Employees Menu
    And user should display company structure

    When user clicks Employees Menu
    And user should display telephone directory