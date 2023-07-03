@Opc001_RegisterUserFeature 
Feature: User registration


  @Opc0011_RegisterUser @Opc0011
  Scenario Outline: Verify that user is successfully registred
    Given user launch browser from "<sheet1>" throw <row>
    When  user open the website
    Then  Verify that the home page is visible
    When  user clicks on myAccount
    And   user clicks on Register
    Then Verify "Register Account" is visible
    When  user enters firstname, lastname, email,phone and password taken from "<sheet1>" through <row>
    And  user subscribes in newsLetter "<sheet1>" through <row>
    And  user clicks on Policy and privacy 
    And  user clicks on Continue 
    Then Verify that "Your account has been created" is visible
    When user clicks on Continue to confirm his registration
    Then Verify that "My Account" is displayed
    When user clicks on Logout
    Then Verify "Account Logout" is displayed
    When user clicks on Continue to confirm logout

    Examples: 
      | sheet1   | row   | 
      | Sheet1   |     1 | 
    
     @opc0012_RegisterWithAnExistingAccount @opc0012
     Scenario Outline: Verify that a warning message is generated when user try to register with an existing email
     	Given user launch browser from "<sheet>" throw <row>
    	When  user open the website
    	Then  Verify that the home page is visible
    	When  user clicks on myAccount
    	And   user clicks on Register
    	Then Verify "Register Account" is visible
    	When  user enters firstname, lastname, email,phone and password taken from "<sheet>" through <row>
    	And  user subscribes in newsLetter "<sheet>" through <row>
    	And  user clicks on Policy and privacy 
    	And  user clicks on Continue 
    	Then Verify warning that registration warning message "Warning: E-Mail Address is already registered!" is visible
    
    Examples: 
      | sheet    | row   | 
      | Sheet2   |     0 | 
      
    @opc0013_RegisterUserWithInvalidEmail @opc0013
    Scenario Outline: Verify registration with invalid email
      Given user launch browser from "<sheet>" throw <row>
    	When  user open the website
    	Then  Verify that the home page is visible
    	When  user clicks on myAccount
    	And   user clicks on Register
    	Then Verify "Register Account" is visible
    	When  user enters firstname, lastname, email,phone and password taken from "<sheet>" through <row>
    	And  user subscribes in newsLetter "<sheet>" through <row>
    	And  user clicks on Policy and privacy 
    	And  user clicks on Continue 
    	Then Verify invalidity email warning "E-Mail Address does not appear to be valid!" is visible
      
      Examples: 
      | sheet    | row   | 
      | Sheet3   |     0 | 
      
      @opc0014_RegisterWithInvalidConfirmPassword @opc0014
      Scenario Outline: Verify registration with incorrect confirm password
      
      Given user launch browser from "<sheet>" throw <row>
    	When  user open the website
    	Then  Verify that the home page is visible
    	When  user clicks on myAccount
    	And   user clicks on Register
    	Then Verify "Register Account" is visible
    	When  user enters firstname, lastname, email,phone and password taken from "<sheet>" through <row>
    	And  user subscribes in newsLetter "<sheet>" through <row>
    	And  user clicks on Policy and privacy 
    	And  user clicks on Continue
    	Then Verify warning invalidity message "Password confirmation does not match password!" is visible
      
      Examples: 
      | sheet    | row   | 
      | Sheet4   |     1 | 
      
      @opc0015_RegisterWithoutCheckingAgreeWithPrivacyPolicy @opc0015
      Scenario Outline: Verify registration without checking privacy policy checkboox
      
      Given user launch browser from "<sheet>" throw <row>
    	When  user open the website
    	Then  Verify that the home page is visible
    	When  user clicks on myAccount
    	And   user clicks on Register
    	Then Verify "Register Account" is visible
    	When  user enters firstname, lastname, email,phone and password taken from "<sheet>" through <row>
    	And  user subscribes in newsLetter "<sheet>" through <row>   	
    	And  user clicks on Continue
    	Then Verify warning privacy policy "Warning: You must agree to the Privacy Policy!" is visible
      
      
      
       Examples: 
      | sheet    | row   | 
      | Sheet5   |     1 | 
      
