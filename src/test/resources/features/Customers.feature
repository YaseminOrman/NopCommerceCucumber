@customers
Feature: Customers

  Scenario: Add new Customer
    Given user opens url "https://admin-demo.nopcommerce.com/login"
    When user enters email as "admin@yourstore.com" and password as "admin"
    And click on login
    Then user can view dashboard
    When user click on customers menu
    And click on customers menu item
    And click on Add new button
    Then user can view Add new customer page
    When user enter customer info
    And click on Save button
    Then user can view confirmation message "The new customer has been added successfully."
    And close browser

    @searchEmail
    Scenario: Search Customer By EmailID
      Given user opens url "https://admin-demo.nopcommerce.com/login"
      When user enters email as "admin@yourstore.com" and password as "admin"
      And click on login
      Then user can view dashboard
      When user click on customers menu
      And click on customers menu item
      And enter customer email
      When click on search button
      Then user should found email in the search table
      And close browser



