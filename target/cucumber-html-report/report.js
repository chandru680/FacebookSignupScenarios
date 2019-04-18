$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SignupFacebookScenario.feature");
formatter.feature({
  "line": 1,
  "name": "To Signup an account for facebook web application",
  "description": "",
  "id": "to-signup-an-account-for-facebook-web-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "To signup an facebook account with randomly generated personal details",
  "description": "",
  "id": "to-signup-an-account-for-facebook-web-application;to-signup-an-facebook-account-with-randomly-generated-personal-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I Launch a web browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter the first set of personal details \"\u003cEnterFirstname\u003e\" \"\u003cEnterSurName\u003e\" \"\u003cEnterEmailaddress\u003e\" \"\u003cEnterPass\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Enter the second set of personal details \"\u003cEnterBirthDay\u003e\" \"\u003cEnterBirthMonth\u003e\" \"\u003cEnterBirthYear\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Signup for the facebook application",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I close the web browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "to-signup-an-account-for-facebook-web-application;to-signup-an-facebook-account-with-randomly-generated-personal-details;",
  "rows": [
    {
      "cells": [
        "EnterFirstname",
        "EnterSurName",
        "EnterEmailaddress",
        "EnterPass",
        "EnterBirthDay",
        "EnterBirthMonth",
        "EnterBirthYear"
      ],
      "line": 11,
      "id": "to-signup-an-account-for-facebook-web-application;to-signup-an-facebook-account-with-randomly-generated-personal-details;;1"
    },
    {
      "cells": [
        "Yes",
        "Yes",
        "Yes",
        "Yes",
        "Yes",
        "Yes",
        "Yes"
      ],
      "line": 12,
      "id": "to-signup-an-account-for-facebook-web-application;to-signup-an-facebook-account-with-randomly-generated-personal-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "To signup an facebook account with randomly generated personal details",
  "description": "",
  "id": "to-signup-an-account-for-facebook-web-application;to-signup-an-facebook-account-with-randomly-generated-personal-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I Launch a web browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter the first set of personal details \"Yes\" \"Yes\" \"Yes\" \"Yes\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Enter the second set of personal details \"Yes\" \"Yes\" \"Yes\"",
  "matchedColumns": [
    4,
    5,
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Signup for the facebook application",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I close the web browser",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpFacebookAccount.Launchwebbrowser()"
});
formatter.result({
  "duration": 9937591704,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Yes",
      "offset": 41
    },
    {
      "val": "Yes",
      "offset": 47
    },
    {
      "val": "Yes",
      "offset": 53
    },
    {
      "val": "Yes",
      "offset": 59
    }
  ],
  "location": "SignUpFacebookAccount.EnterSection1PersonalDetails(String,String,String,String)"
});
formatter.result({
  "duration": 870856136,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Yes",
      "offset": 42
    },
    {
      "val": "Yes",
      "offset": 48
    },
    {
      "val": "Yes",
      "offset": 54
    }
  ],
  "location": "SignUpFacebookAccount.EnterSection2PersonalDetails(String,String,String)"
});
formatter.result({
  "duration": 479336018,
  "status": "passed"
});
formatter.match({
  "location": "SignUpFacebookAccount.signup()"
});
formatter.result({
  "duration": 7101305099,
  "status": "passed"
});
formatter.match({
  "location": "SignUpFacebookAccount.closebrowser()"
});
formatter.result({
  "duration": 1447153916,
  "status": "passed"
});
});