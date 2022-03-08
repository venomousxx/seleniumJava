
Feature: logout

  Scenario: logout from stockbit
    Given I already login to stockbit
    When I click my avatar icon
    Then I see popover menu
    And i click logout button
    Then i logout from stockbit
