Feature: search something and add
  Background:
    Given Navigate to page
    Then User should go home successfully

    Scenario: As an admin user I should be able to search registered info.
      Given Navigate to page
      And search and add product
      Then User should go home successfully




