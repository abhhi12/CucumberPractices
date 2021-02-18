Feature: Amazon Order Page
In my order to check my order details
As a registered user
I want to specify the feature of order details page

Background:
Given a register user exists
Given user is on Amazon login page
When enters username
And user enters password
And user click on login button
Then user navigates to order page

Scenario: Check Previous Order Details
When User Clicks on Order details
Then user checks the previous order details

Scenario: Check Open Order Details
When User Clicks on Open Order details
Then user checks the Open order details


Scenario: Check Cancelled Order Details
When User clicks on Cancelled Order links
Then user checks the Cancelled order details
