Feature: Data Table use for Gmail login

@RegressionTest @E2ETest
Scenario: Test Login 
	Given Open firefox and start the application
	When I enter valid username and invalid password
	| gauravdwivedi10	| check123   |
	Then User should get an error message
		