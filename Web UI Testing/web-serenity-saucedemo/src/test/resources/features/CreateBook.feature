@Create
Feature: Create Book
  As a user
  I can create a book
  So that I can add a book to the list

  Background:
    Given I am on the home page

  @Can-create
  Scenario: As a user I can create a book
    When I click on the Create Book Icon
    And I input valid book title
    And I input valid author
    And I input valid publish year
    And I click Save Book button
    Then I am on the home page and see success alert "Book created successfully"

  @Cannot-create
  Scenario: As a user I cannot create a book by leaving the book details blank
    When I click on the Create Book Icon
    And I click Save Book button
    Then I can see error alert "Book failed to create"

  @Cannot-create-title
  Scenario: As a user I cannot created a book with a blank title
    When I click on the Create Book Icon
    And I input valid author
    And I input valid publish year
    And I click Save Book button
    Then I can see error alert "Book failed to create"

  @Cannot-create-author
  Scenario: As a user I cannot created a book with a blank author
    When I click on the Create Book Icon
    And I input valid book title
    And I input valid publish year
    And I click Save Book button
    Then I can see error alert "Book failed to create"

  @Cannot-create-year
  Scenario: As a user I cannot created a book with a blank publish year
    When I click on the Create Book Icon
    And I input valid book title
    And I input valid author
    And I click Save Book button
    Then I can see error alert "Book failed to create"