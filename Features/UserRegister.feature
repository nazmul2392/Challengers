Feature: User Registration
Scenario Outline: registar a valid user

Given I am on new tiurs homepage 
When I click on the registar link
And I enter "<first name>" "<last name>" "<phone number>" "<email>" "<user name>" "<password>" "<confirm password>"
And I click submit button
Then I recive confarmation page and message 

Examples:
| first name |  last name |  phone number | email | user name  | password | confirm password |
|Naz | King | 9292255933  | nazmulhussain4293@gmail.com | nazking | nazking2392|nazking2392  |