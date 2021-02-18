Feature: User Registration

Scenario: user registration with different data
 Given User in on registration page
 When User enters following user details
   | abhi | kumar | abh@gmail.com | 99999 | Babglore |
   | tom  | peter | tom@gmail.com | 88888 | London |
   | Lisa | desza | lisa@gmail.com | 7777 | sfo |
 Then user registration should be successful
 
Scenario: user registration with different data from column
 Given User in on registration page
 When User enters following user details from column
   | firstname | lastname | email | phoneno | city |
   | abhi | kumar | abh@gmail.com | 99999 | Babglore |
   | tom  | peter | tom@gmail.com | 88888 | London |
   | Lisa | desza | lisa@gmail.com | 7777 | sfo |
 Then user registration should be successful 