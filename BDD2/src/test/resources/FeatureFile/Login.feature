Feature: Test the LinkedIn Application
 
  Scenario: Test Login Functionality
    Given I am on login page
    When I entered valid user name
    Then I am on home page