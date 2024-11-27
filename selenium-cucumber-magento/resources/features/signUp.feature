Feature: User Account Creation

  Scenario: User signs up with valid details
    Given I am on the Sign-Up page
    When I enter "pawan" as first name, "kumar" as last name, "pawan.kumar@testing.com" as email, and "Password123" as password
    And I click on the "Create an Account" button
    Then I should see a confirmation message