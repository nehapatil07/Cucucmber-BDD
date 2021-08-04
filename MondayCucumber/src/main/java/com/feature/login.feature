@Login
Feature:jbk offline application test

Scenario Outline:Login test
Given User should be on login page
When User enters "<uname>" and "<pass>"
And User hits submit button
Then User should be on homepage

Examples:
|uname|pass|
|kiran@gmail.com  |123456|
|nilam@gmail.com  |qwerty|
|mangesh@gmail.com|asdfgh|


#@Logo
#Scenario: Logo test
#Given User should be on login page
#Then user should see jbk logo

#@Title
#Scenario: Title test
#Given User should be on login page
#Then User should see title
