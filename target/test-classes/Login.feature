Feature: Validating login function of facebook website
@sanity
Scenario: Validating login function with valid username and valid password.
Given User is on facebook website
When User should enter username and password
And User should click login button
Then User should validate home page is present or not 
@retest
Scenario: Validating login function with valid username and valid password.
Given User is on facebook website
When User should enter username and password
And User should click login button
Then User should validate home page is present or not 
@reg
Scenario: Validating login function with valid username and valid password.
Given User is on facebook website
When User should enter username and password
And User should click login button
Then User should validate home page is present or not 
@sanity
Scenario: Validating login function with valid username and valid password.
Given User is on facebook website
When User should enter username and password
And User should click login button
Then User should validate home page is present or not 

@smoke @retest
Scenario: Validating login function with valid username and valid password.
Given User is on facebook website
When User should enter username and password
And User should click login button
Then User should validate home page is present or not 