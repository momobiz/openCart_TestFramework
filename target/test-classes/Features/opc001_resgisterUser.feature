@Opc001_RegisterUserFeature 
Feature: User registration


  @Opc001_RegisterUser 
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
    Then Verify "Account logout" is displayed
    When user clicks on Continue to confirm logout

    Examples: 
      | sheet1   | row   | 
      | Sheet1   |     1 | 
    
     
