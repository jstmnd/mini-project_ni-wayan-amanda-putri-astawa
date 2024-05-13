Feature: Add Item
  As a user 
  I can add item
  So that I can add items I want to the list

  Scenario: Successfully add new item
    Given I am on the home page
    When I click Add New Item icon
    Then I input a valid name
    Then I input a valid quantity
    Then I click item list
    Then I select item that i want to add
    Then I click Add Item button
    Then I redirected to the home page

  Scenario: Unsuccessfully add new item by leaving all details blank
    Given I am on the home page
    When I click Add New Item icon
    Then I click item list
    Then I select item that i want to add
    Then I click Add Item button
    Then I get an error message that the name field must be filled in  

  Scenario: Unsuccessfully add new item with a blank name
    Given I am on the home page
    When I click Add New Item icon
    Then I input a valid quantity
    Then I click item list
    Then I select item that i want to add
    Then I click Add Item button
    Then I get an error message that the name field must be filled in

   Scenario: Unsuccessfully add new item with a blank quantity
    Given I am on the home page
    When I click Add New Item icon
    Then I input a valid name
    Then I click item list
    Then I select item that i want to add
    Then I click Add Item button