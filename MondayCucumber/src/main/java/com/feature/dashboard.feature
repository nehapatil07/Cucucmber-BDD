@dash

Feature: JBK offline aplication test

Scenario: Verify courses
Given user should be on dashboard page
When user will create a list of courses
Then user will verify courses with expected

Scenario: verify userlink
Given user should be on dashboard page
When user will click on the users page
Then user page should be displayed


Scenario: Verify operators link
Given user should be on dashboard page
When user will click on the operators link
Then operators link should be opened

Scenario: Verify useful links
Given user should be on dashboard page
When user will click on the useful links
Then useful links page should be opened

Scenario: Verify Downloads page
Given user should be on dashboard page
When user clicks on the downloads page
Then downloads page should be opened

