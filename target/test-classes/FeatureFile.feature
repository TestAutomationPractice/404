Feature: TestAuthonTask
This feature will verify the UI adding a new movie
 
Scenario: Check that you can log in with admin credentials and add a new movie
	Given I launch Chrome browser
	When I open the website
	Then I enter the credentials of username and password
	And I get logged in as admin and get add movie option
	Then we add all the details of the movie
	And submit the movie data