@page_title_navigation
Feature: Navigation Menu

  @fleet_vehicles
  Scenario: Navigating Fleet--Vehicles
    Given the user is on the login page
    And the user enters the sales manager login credentials
    When the user navigates Fleet, Vehicles
    Then the page title should be Vehicles

  @marketing_campaigns
  Scenario: Navigating Marketing--Campaigns
    Given the user is on the login page
    And the user enters the sales manager login credentials
    When the user navigates Marketing, Campaigns
    Then the page title should be Campaigns

  @activities_calendar_events
  Scenario: Navigating Activities--Calendar Events
    Given the user is on the login page
    And the user enters the sales manager login credentials
    When the user navigates Activities, Calendar Events
    Then the page title should be Calendar Events

