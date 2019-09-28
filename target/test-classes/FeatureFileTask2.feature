Feature: TestAuthonTask2
This feature will verify the Data driven login test
 
Scenario: Check that you can log in and if the login is successful
	Given I launch Chrome browser
	When I open the website
	Then I enter the credentials of username and password
	And I get logged in as user 
	