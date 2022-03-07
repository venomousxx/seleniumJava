Feature: login feature

  @smokeTest
  Scenario: 
    Given browser is open and go to stockbit website
    And i see login button
    When I click login button in homepage
    And i can see username and password field
    And i input username and password correctly
    And i click login button
    Then I will direct to dashboard page
