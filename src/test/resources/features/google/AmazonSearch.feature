Feature: Amazon Search

  @test01
  Scenario: Verify that's possible to search a topic on Amazon
    Given I go to "https://www.amazon.com/"
    When I type "QA Automation" in searchText on AmazonHome page
      And I click on magnifierIcon on AmazonHome page
      And I select the first result of the search
      And I click on add cart button on item page
    Then Verify that the message "Added to Cart" appears
    When I click on navigation cart icon
    Then Verify the price should be: "USD 29.93"
      And Verify the item has been added the quantity should be: "1"
      And I verified the book title should be: "Complete Guide to Test Automation: Techniques, Practices, and Patterns for Building and Maintaining Effective Software Projects"