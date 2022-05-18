Feature: Women Category page
  As User I want to use women category page

  @sanity
  Scenario: User Should Navigate To Women Category Page Successfully
    Given I am on home page
    When I click on women category tab
    Then I should see women text

  @smoke
  Scenario Outline: User Should Add Product To The Cart Successfully
    Given I am on home page
    When I click on women category tab
    And I click on "<product>"
    And I change quantity "<qty>"
    And I select size"<size>"
    And I select colour "<colour>"
    And I click to add cart button
    Then I should see the message "<message>"
    And I click on x button and close the popup

    Examples:
      | product               | qty | size | colour | message                                          |
      | Blouse                | 2   | M    | White  | Product successfully added to your shopping cart |
      | Printed Dress         | 3   | L    | Orange | Product successfully added to your shopping cart |
      | Printed Chiffon Dress | 4   | S    | Green  | Product successfully added to your shopping cart |
      | Printed Summer Dress  | 2   | M    | Blue   | Product successfully added to your shopping cart |


