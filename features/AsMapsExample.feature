Feature: Maps use for Gmail login

@SmokeTest @RegressionTest @E2ETest
Scenario: Test Login 
	Given Open firefox and start the application
	When User enters valid username and invalid password
	| username 			| password	|	
	| gauravdwivedi10	| check123  | 
	Then User should get an error message