$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/MyApplication.feature");
formatter.feature({
  "name": "SmokeTests for Gmail login",
  "description": "Gmail Login Validation Check",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Test Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@E2ETest"
    }
  ]
});
formatter.step({
  "name": "Open firefox and start the application",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter valid \"\u003cusername\u003e\" and invalid \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User should get an error message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "gauravdwivedi10",
        "check123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Test Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@E2ETest"
    }
  ]
});
formatter.step({
  "name": "Open firefox and start the application",
  "keyword": "Given "
});
formatter.match({
  "location": "SmokeTest.open_firefox_and_start_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid \"gauravdwivedi10\" and invalid \"check123\"",
  "keyword": "When "
});
formatter.match({
  "location": "SmokeTest.i_enter_valid_username_and_invalid_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should get an error message",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeTest.user_should_get_an_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});