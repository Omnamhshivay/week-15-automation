
Feature: Sign Page Test
  As user I want to sign in on automation website

  @sanity
  Scenario: User should navigate to sign in page successfully
    Given I am on home page
    When I click on Sign in link
    Then I should see the message Authentication

  @smoke
  Scenario Outline: User should the error message with in valid credentials
    Given I am on home page
    When I click on Sign in link
    And I enter email "<email>"
    And I enter password "<password>"
    And I click on sign in button
    Then I should get error message "<errorMessage>"
    Examples:
      | email          | password | errorMessage               |
      |                | 123456   | An email address required. |
      | abcd@gmail.com |          | Password is required.      |
      | adfdfgfg       | 123456   | Invalid email address.     |
      | abcd@gmail.com | 123456   | Authentication failed.     |

  @regression
  Scenario: User Should Log In SuccessFully With Valid Credentials
    Given I am on home page
    When I click on Sign in link
    And I enter email "Rockybhai@gmial.com"
    And I enter password "rocky123"
    And I click on sign in button
    Then I should see sign out button

  @regression
  Scenario: User Should Log Out SuccessFully
    Given I am on home page
    When I click on Sign in link
    And I enter email "Rockybhai@gmial.com"
    And I enter password "rocky123"
    And I click on sign in button
    And I click on sign out button
    Then I should see sign in link

