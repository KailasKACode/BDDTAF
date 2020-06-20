#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Banking functionality

  Scenario: login on bank page
    Given Enter the url
    Then Enter "mngr265996" and "zenasYh"
    Then Msg Display Login successFully

  #Scenario Outline: :Login with bankApllication Multiple user
  # Given User is on Home Page
  #  When User Navigate to LogIn Page
  #  And User enters "<username>" and "<password>"
  #  Then Message displayed Login Successfully
  # Examples:
# |username|password|
#	|mngr265996|zenasYh|
#	|mngr265996|zenasYh|
#	|mngr265996|zenasYh|
	

	
	
	
	
