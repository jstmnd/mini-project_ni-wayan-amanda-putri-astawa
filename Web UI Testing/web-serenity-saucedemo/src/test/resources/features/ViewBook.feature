@View
Feature: View Book
  As a user
  I can view a book
  So that I can see the entire book list

  Background:
    Given I am on the home page

  @View-table
  Scenario: As a user I can view the list of books in table form
    When I click on the Table button
    Then I can see the entire list of books in the table

  @View-card
  Scenario: As a user I can view the list of books in card form
    When I click on the Card button
    Then I can see the entire list of books in the card