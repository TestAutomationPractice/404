Feature: TestAuthonTask3
This feature will verify the running of two parallel browser sessions
 
Scenario: Check that you can log in with admin credentials and add a new movie
	Given I launch Chrome browser
	Then I open the website
	Then I enter the credentials of username and password of user
	
	Then I launch a new chrome browser
	Then I open the website
	And log in as a admin
	When I enter a new movie and log out as admin
	Then I switch back to previous browser
	And check if the movie is visible to user 