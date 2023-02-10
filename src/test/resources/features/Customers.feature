@customers
Feature: Customers

  Background: common steps for each scenario

    Given user opens url "https://admin-demo.nopcommerce.com/login"
    When user enters email as "admin@yourstore.com" and password as "admin"
    And click on login
    Then user can view dashboard
    When user click on customers menu
    And click on customers menu item

  Scenario: Add new Customer
    And click on Add new button
    Then user can view Add new customer page
    When user enter customer info
    And click on Save button
    Then user can view confirmation message "The new customer has been added successfully."
    And close browser

    @searchByEmail
    Scenario: Search Customer By EmailID

      And enter customer email
      When click on search button
      Then user should found email in the search table
      And close browser

      @SearchByName
      Scenario: Search Customer By Name

        And enter customer firstname
        And enter customer lastname
        When click on search button
        Then user should found name in the search table
        And close browser




