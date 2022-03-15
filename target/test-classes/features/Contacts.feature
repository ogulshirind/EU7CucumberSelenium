Feature: Contact page


  Scenario: default page number
    Given the user is on the login page
    And the user enters the driver login credentials
    When the user navigates to "Customer" "Contacts"
    Then default page number is 1


  Scenario: verify Create Calendar Event
    Given the user is on the login page
    And the user enters the sales manager login credentials
    When the user navigates "Activities", "Calendar Events"
    Then the title contains "Calendars"

  Scenario: menu options
    Given the user logged in as "driver"
    Then the user should see following options
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |


  Scenario: menu options
    Given the user logged in as "sales manager"
    Then the user should see following options
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |


  Scenario: menu options
    Given the user logged in as "store manager"
    Then the user should see following options
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |


  Scenario: login as a given user
    Given the user is on the login page
    When the user logs in following credentials
      | username  | user10      |
      | password  | UserUser123 |
      | firstname | John        |
      | lastname  | Doe         |
    Then the user should be able to login


  Scenario Outline: login as a given user <userName>
    Given the user is on the login page
    When the user logs in following credentials
      | username  | <userName>  |
      | password  | <password>  |
      | firstname | <firstName> |
      | lastname  | <lastName>  |
    Examples:
      | userName        | password    | firstName | lastName  |
      | user10          | UserUser123 | John      | Doe       |
      | storemanager101 | UserUser123 | Brendan   | Schneider |
