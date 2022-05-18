Feature: Create Account Test
  As User I want to create account on automation website

  @regression
  Scenario Outline: User Should Create Account Successfully
    Given I am on home page
    When I click on Sign in link
    And I enter email to create account "<email>"
    And I click on create account button
    And I enter  customer first name "<CustomerFirstName>"
    And I enter customer last name "<CustomerLastName>"
    And I enter password "<password>"
    And I enter first name "<firstName>"
    And I enter last name "<lastname>"
    And I enter address "<address>"
    And I enter city "<city>"
    And I select state "<state>"
    And I enter zipcode "<zipcode>"
    And I enter mobile number "<mobile>"
    Then I click on register button
    Examples:
      | email                | CustomerFirstName | CustomerLastName | password  | firstName | lastname | address       | city    | state  | zipcode | mobile      |
      | Pushpa1007@gmail.com | pushpa            | raj              | pushpa123 | pushpa    | raj      | 900 Lanark Dr | Wasilla | Alaska | 99654   | 07712345678 |
#    Use this email id Pushpa@outlook.com