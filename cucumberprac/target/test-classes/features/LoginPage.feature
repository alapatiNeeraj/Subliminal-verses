Feature: App login

Scenario: Banking home page login
Given user is on netbanking landing page
When user has to login into app with username "starwars" and password "force awakens"
Then Netbanking home page is populated
And the cards are "successfully displayed"

Scenario: Banking home page login
Given user is on netbanking landing page
When user has to login into app with username "slipknot" and password "vermillion"
Then Netbanking home page is populated
And the cards are "not displayed"