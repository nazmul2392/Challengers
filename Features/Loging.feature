@Login
Feature: login to flights

Scenario Outline: login a valid user

Given i am on the flight homepage
When i enter "<user name>", "<password>"
And i click sign in button
Then i am on the flight reservation page

Examples:
|user name | password|
|Guest     | Guest   |
