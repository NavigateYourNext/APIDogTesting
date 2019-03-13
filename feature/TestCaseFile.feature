Feature: API Testing for Open Source Module

@TestCase1
Scenario: Validate all request and responses of open source API

Given User is on "https://dog.ceo/dog-api/" webpage
When  Title of the page is "Dog API"
Then  User will get list of all breeds



@TestCase2
Scenario:  Verify a breed

Given User have list of breeds
When User search for "retriever" breed
Then User succesfully get the breed "retriever"



@TestCase3
Scenario: Find sub-breads of a breed

Given User is on Home Page
When User search for a breed "retriever"
Then User will get all sub breeds of "retriever" breed



@TestCase4
Scenario: Find Image or Link of a sub-breed

Given User have all list of breeds
When User search for "golden" sub breed
Then User will get link of "golden" sub breed