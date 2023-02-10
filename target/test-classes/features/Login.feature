@login
Feature: Login

  Scenario: Successful login with valid credentials

    Given user opens url "https://admin-demo.nopcommerce.com/login"
    When user enters email as "admin@yourstore.com" and password as "admin"
    And click on login
    Then page title should be "Dashboard / nopCommerce administration"
    When user click on log out link
    Then page title should be "Your store. Login"
    And close browser

    @Login_dataDriven
    Scenario Outline: Login Data Driven

      Given user opens url "https://admin-demo.nopcommerce.com/login"
      When user enters email as "<email>" and password as "<admin>"
      And click on login
      Then page title should be "Dashboard / nopCommerce administration"
      When user click on log out link
      Then page title should be "Your store. Login"
      And close browser
      Examples:
        | email | admin |
        | admin@yourstore.com | admin |
        | admin1@yourstore.com | admin123 |
