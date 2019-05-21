#Author: gauravdw@buffalo.edu
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
@tag
Feature: SmokeTests for Gmail login
Gmail Login Validation Check


@SmokeTest @E2ETest
Scenario Outline: Test Login 
	Given Open firefox and start the application
	When I enter valid "<username>" and invalid "<password>"
	Then User should get an error message
		
Examples: 
	| username     			| password	 |
	| gauravdwivedi10     	| check123   |
	
		
