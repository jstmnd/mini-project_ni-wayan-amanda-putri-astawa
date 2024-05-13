@Delete
Feature: Delete Book
  As a user
  I can delete a book
  So that I can delete a book from the list

  Background:
    Given I am on the home page

  @Can-create
  Scenario: As a user I can delete a book
    When I click on the Delete Book Icon
    Then I click yes button