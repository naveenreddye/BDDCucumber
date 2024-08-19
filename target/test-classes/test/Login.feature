Feature: User Login
Registered User should be able to login to access account details

Background: 
Given User navigates to Login page

Scenario Outline: Login with valid credentials
When User enters valid email address <email>
And Enters valid password <password>
And Clicks on Login button
Then User should login successfully
Examples:
|email                  |password|
|aaaa@gmail.com |12345|
|bbbb@gmail.com |12345|
|ccccc@gmail.com |12345|
|sdsadsa@hams.com |23432423|

Scenario: Login with invalid credentials
When User enters invalid email address "amotooricap343434343@gmail.com"
And Enters invalid password "1234567890"
And Clicks on Login button
Then User should get a proper warning message

Scenario: Login with valid email address and invalid password
When User enters valid email address "amotooricap343434343@gmail.com"
And Enters invalid password "1234567890"
And Clicks on Login button
Then User should get a proper warning message

Scenario: Login with invalid email address and valid password
When User enters invalid email address "amotooricap343434343@gmail.com"
And Enters valid password "1234567890"
And Clicks on Login button
Then User should get a proper warning message