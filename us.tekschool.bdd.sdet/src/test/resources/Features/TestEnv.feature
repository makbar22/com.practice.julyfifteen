Feature: Test Environment


	@registerTest
  Scenario: Register Account for new User
    Given User is on TEST Environment page
    When User click on MyAccount
    And  User click on Register
    And User fills Register form with below information
    |firstName|LastName|E-mail|Telephone|password|
    |Jack|MA|jack.Ma@alibabea.com|2025058899|alibaba|
    And User select 'yes' for Subscribe 
    And User click privacy and policy button 
    And User click Continue button
    Then User should see message  'Your Account Has Been Created!'
    
