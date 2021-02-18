@All
Feature: Uber Booking Feature

@Smoke @qa-ready @US-1001 @Epic-900
Scenario: Booking Sedan
Given User Wants to select a car Type "Sedan" from Uber aap
When User selects car "seadn" and pick point "Banglore" and drop location "Pune"
Then Driver Starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Regression @Smoke
Scenario: Booking SUV
Given User Wants to select a car Type "SUV" from Uber aap
When User selects car "seadn" and pick point "Banglore" and drop location "Hydrabad"
Then Driver Starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Prod
Scenario: Booking Mini
Given User Wants to select a car Type "Mini" from Uber aap
When User selects car "seadn" and pick point "Pune" and drop location "Mumbai"
Then Driver Starts the journey
And Driver ends the journey
Then User pays 1000 USD