Feature: Reset Form
  As a user 
  I can reset form
  So that I can change the form details

  Scenario: Clear all input fields
    Given I am on the home page
    When I click Add New Item icon
    Then I input a valid name
    Then I input a valid quantity
    Then I click item list
    Then I select item that i want to add
    Then I click Reset button
    Then The form was successfully reset