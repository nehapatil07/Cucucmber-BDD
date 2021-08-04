@Operators
Feature: jbk offline application test

Scenario: Verify Person names
Given user should be on operators page
When user gets all actual person names from page
Then user verify with expected list