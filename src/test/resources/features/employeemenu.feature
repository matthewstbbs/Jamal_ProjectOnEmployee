
@wip @APCRM-299
Feature: As a user, I should be able to land on Employees menu; so that I can use Employees modules
Background: I like to move it
Given user already logged in main page
When user clicks Employees tab

 @APCRM-347
  Scenario:Verify user should be able to display company structure

    And user should see company structure title
  @APCRM-348
    Scenario:Verify user should be able to display telephone directory

    When user clicks telephone directory tab
    And user should see telephone directory title