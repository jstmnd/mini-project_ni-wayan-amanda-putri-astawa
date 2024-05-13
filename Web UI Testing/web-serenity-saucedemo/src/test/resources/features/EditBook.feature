@Edit
Feature: Edit Book
  As a user
  I can edit a book
  So that I can change the format of a book

  Background:
    Given I am on the home page

  @Can-edit
  Scenario: As a user I can edit a book
    When I click on the Edit Book Icon
    And I input valid edited book title
    And I input valid edited author
    And I input valid edited publish year
    And I click Edit Book button
    Then I am on the show book page and see see success alert "Book edited successfully"

  @Cannot-edit
  Scenario: As a user I cannot edit a book by leaving the book details blank
    When I click on the Edit Book Icon
    And I click Edit Book button
    Then I can see error alert "Book edit failed"

  @Cannot-edit-title
  Scenario: As a user I cannot edited a book with a blank title
    When I click on the Edit Book Icon
    And I input valid edited author
    And I input valid edited publish year
    And I click Edit Book button
    Then I can see error alert "Book edit failed"

  @Cannot-edit-author
  Scenario: As a user I cannot created a book with a blank author
    When I click on the Create Book Icon
    And I input valid edited publish year
    And I click Edit Book button
    Then I can see error alert "Book edit failed"

  @Cannot-edit-year
  Scenario: As a user I cannot created a book with a blank publish year
    When I click on the Create Book Icon
    And I input valid edited book title
    And I input valid edited author
    And I click Edit Book button
    Then I can see error alert "Book edit failed"