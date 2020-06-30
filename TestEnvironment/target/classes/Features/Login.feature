Feature: Login to Test Environment

@loginTest
Scenario: Login to My Account
	Given the user is on Test Environment Page
	When user click on MyAccount
	And user click on Login
	And user enters username 'sdet@tekschool.us' and password 'sdet'
	And user click on Login button
	Then user should be on user dashboard