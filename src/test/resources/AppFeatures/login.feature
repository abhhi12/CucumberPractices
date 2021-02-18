Feature: Login Feature

Scenario Outline: Login Fails - Possible combinations
 Given user is on application landing page
 When user click on sign in button
 Then user is displayed login screen
 When user enters "<UserName>" in username field
  And user enters "<Password>" in password field
  And user clicks Sign in button
  Then user gets login failed error message
  
  Examples:
     | UserName          | Password |
     | incorrectusername | 123456   |
     | abhishekkumar     | incorrectpassword |
     | incorrectusername | incorrectpassword |
 