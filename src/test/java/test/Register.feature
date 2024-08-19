Feature: User is able to register to access account info
This functionality focus on user registration to the website with various details

Scenario: Register with all mandatory fields
Given User navigate to login page
When Enters First name "Naveen" and last name "Reddy"
And User enters Email "naveenreddye@gmail.com" and Telephone number "6565656"
And User enters password and Confirm password "Password"
And Click Continue button
Then User login details should and access acount details

Scenario: Register with all mandatory and Non mandatory fields
Given User navigate to login page
When Enters First name "Naveen" and last name "Reddy"
And User enters Email "naveenreddye@gmail.com" and Telephone number "6565656"
And User enters password and Confirm password "Password"
And Select News Letter subsribe as Yes
And Click Continue button
Then User login details should and access acount details