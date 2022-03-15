@login
Feature: Users should be able to login

  Background: Given the user is on the login page

  @driver
  Scenario: Login as a driver
    When the user enters the driver login credentials
    Then the user should be able to login

  @sales_manager @YTR-123
  Scenario: Login as a sales manager
    When the user enters the sales manager login credentials
    Then the user should be able to login

    @store_manager @smoke
  Scenario: Login as a store manager
    When the user enters the store manager login credentials
    Then the user should be able to login