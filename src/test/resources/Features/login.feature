Feature: Login Stockbit

  @smokeTest
  Scenario Outline: login with valid credential
    Given browser is open and go to stockbit website
    And i see login button
    When I click login button in homepage
    And i can see username and password field
    And i input <username> and <password> correctly
    And i click login button
    Then I will direct to dashboard page
    
     Examples: 
      | username 										  | password 				|
    	| "hardi.uus.droid@gmail.com" 	| "Stockbit123" 	|
    	
    	
  @smokeTest
  Scenario Outline: login with invalid credential
    Given browser is open and go to stockbit website
    And i see login button
    When I click login button in homepage
    And i can see username and password field
    And i input <username> and <password> correctly
    And i click login button
    Then I will see error message displayed
    
     Examples: 
      | username 										| password 				|
    	| "hardi@gmail.com" 					| "Stockbit123" 	|
    	| "hardi.uus.droid@gmail.com"	|	"123"						|
    	
    	
  #@smokeTest
  #Scenario: verify SSO login appear
    #Given browser is open and go to stockbit website
    #And i see login button
    #When I click login button in homepage
    #Then I can see SSO login appear
#	