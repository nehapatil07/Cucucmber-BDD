@users

Feature: JBK offline application test

Scenario: Verify user table headings
Given user should be on users page
When user selects table headings
Then verify with expected list