$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/TestCaseFile.feature");
formatter.feature({
  "line": 1,
  "name": "API Testing for Open Source Module",
  "description": "",
  "id": "api-testing-for-open-source-module",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Validate all request and responses of open source API",
  "description": "",
  "id": "api-testing-for-open-source-module;validate-all-request-and-responses-of-open-source-api",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TestCase1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on \"https://dog.ceo/dog-api/\" webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Title of the page is \"Dog API\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User will get list of all breeds",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://dog.ceo/dog-api/",
      "offset": 12
    }
  ],
  "location": "StepDefination.user_is_on_webpage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Dog API",
      "offset": 22
    }
  ],
  "location": "StepDefination.title_of_the_page_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.user_will_get_list_of_all_breeds()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 13,
  "name": "Verify a breed",
  "description": "",
  "id": "api-testing-for-open-source-module;verify-a-breed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@TestCase2"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User have list of breeds",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User search for \"retriever\" breed",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User succesfully get the breed \"retriever\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_have_list_of_breeds()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "retriever",
      "offset": 17
    }
  ],
  "location": "StepDefination.user_search_for_breed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "retriever",
      "offset": 32
    }
  ],
  "location": "StepDefination.user_succesfully_get_the_breed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 22,
  "name": "Find sub-breads of a breed",
  "description": "",
  "id": "api-testing-for-open-source-module;find-sub-breads-of-a-breed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@TestCase3"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "User search for a breed \"retriever\"",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User will get all sub breeds of \"retriever\" breed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_is_on_Home_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "retriever",
      "offset": 25
    }
  ],
  "location": "StepDefination.user_search_for_a_breed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "retriever",
      "offset": 33
    }
  ],
  "location": "StepDefination.user_will_get_all_sub_breeds_of_breed(String)"
});
formatter.result({
  "status": "skipped"
});
});