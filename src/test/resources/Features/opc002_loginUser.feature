@opc002_loginUserFeature
Feature: User login


  @opc0021_LoginWithValidCredentials @opc0021
  Scenario Outline: Login user with valid credential 
    Given user launch browser from "<sheet>" throw <row>
    When  user open the website
    Then  Verify that the home page is visible
    When  user clicks on myAccount
    And   user clicks on Login
    Then  Verify that "Returning Customer" on login page is visible
    When  user enters his login and password from "<sheet>" throw <row>
    And   on the login page user clicks on Login
    Then Verify that "My Account" is displayed
    When user clicks on Logout
    Then Verify "Account Logout" is displayed
    When user clicks on Continue to confirm logout

    Examples: 
      | sheet   | row   |
      | Sheet6  |     1 |
      
@opc0022_LoginWithInValidCredentials @opc0022
  Scenario Outline: Login with invalid credentials
  
   	Given user launch browser from "<sheet>" throw <row>
    When  user open the website
    Then  Verify that the home page is visible
    When  user clicks on myAccount
    And   user clicks on Login
    Then  Verify that "Returning Customer" on login page is visible
    When  user enters his login and password from "<sheet>" throw <row>
    And   on the login page user clicks on Login
    Then  On the loginPage, verify "Warning: No match for E-Mail Address and/or Password." is Displayed
  
   Examples: 
      | sheet   | row   |
      | Sheet7  |     1 |
      
 @opc0023_LoginWhenUserForgotHisPassword @opc0023
  Scenario Outline: Login when user forgot his password
  	
  	Given user launch browser from "<sheet>" throw <row>
    When  user open the website
    Then  Verify that the home page is visible
    When  user clicks on myAccount
    And   user clicks on Login
    Then  Verify that "Returning Customer" on login page is visible
    When  user clicks on Forgotten Password 
    Then  On ForgotYourPassword page, verify "Forgot Your Password?" is visible 
    When  On ForgotYourPassword page user enters email "<sheet>" throw <row> and clicks on Continue
    Then  OnLoginPage verify that "An email with a confirmation link has been sent your email address." is visible  
  
   Examples: 
      | sheet   | row   |
      | Sheet8  |     0 |
      