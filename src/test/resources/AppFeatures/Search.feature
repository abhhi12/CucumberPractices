Feature: Amazon Search

@Smoke
Scenario: Search a Product Macbook Air
Given I have a search field on Amazon Page
When I search for a product with the name "Apple MacBook Pro" and price 1000
Then Product with name "Apple MacBook Pro" should be displayed
Then order id is 12345 and user name is "Abhishek kumar"

@Regression
Scenario: Search a Product iPhone
Given I have a search field on Amazon Page
When I search for a product with the name "iPhone" and price 12000
Then Product with name "iPhone" should be displayed
Then order id is 12354 and user name is "Abhishekkumar"