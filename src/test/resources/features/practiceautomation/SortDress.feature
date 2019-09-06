Feature: Sort Dress

  Scenario: Verify that's possible to sort yellow summer dresses
    Given I go to : "http://automationpractice.com/index.php"
      And I select "Women" Tab
      And I select "Dresses" category
      And I select "Summer Dresses" subcategory
    When I select size "L" check box
      And I select "Yellow" color check box
      And I select "Price: Lowest first" option in Sort By dropdown
    Then Verify that "Printed Chiffon Dress" is displayed with a price of "$16.40"
      And Verify that "Printed Summer Dress" is displayed with a price of "$28.98"
      And Verify that the listed items have ascendant ordering by the price

#  1.      Go to: http://automationpractice.com/index.php
#  2.      Select "Women" tab
#  3.      Select "Dresses" > "Summer Dresses"
#  4.      Select size "L" check box
#  5.      Select "Yellow" color check box
#  6.      Select "Price: Lowest first" option in "Sort By" dropdown
#  7.      Verify that "Printed Chiffon Dress" is displayed with a price of $16.40
#  8.      Verify that "Printed Summer Dress" is displayed with a price of $28.98
#  9.      Verify that the listed items have ascendant ordering by the price