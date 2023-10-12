Feature: Student registration

  Background:
    Given the student is on the registration page

  Scenario: Student registration with valid data
    When the student fills in all mandatory fields with correct data
    And the student submits the registration form
    Then the student should see a registration confirmation
    And close the browser

