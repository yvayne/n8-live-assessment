Feature: Search on Google

  @yvr
  Scenario: Verify that's possible to search a text on google
    Given I go to "https://www.google.com.bo/"
    When I set "Goku" on search text field
      And I click on search button
    Then The page title should be: "Goku - Buscar con Google"
      And The text on search text field should be: "Goku"