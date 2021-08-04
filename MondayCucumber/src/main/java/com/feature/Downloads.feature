@downloads
Feature: JBK offline application test

Scenario: Verify vendor versions
Given user should be on downloads page
When user gets the actual list of versions
Then users verifies it with expected list