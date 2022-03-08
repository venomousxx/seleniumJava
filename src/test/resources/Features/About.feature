Feature: About Us feature

  @smokeTest
  Scenario: go to about us
    Given browser is open and go to stockbit
    And i see About Us in main page
    When I tap About Us
    Then I will direct to About Us page
    And i can see informasi perusahaan