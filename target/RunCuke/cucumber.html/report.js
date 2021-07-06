$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Validate Login Functionality",
  "description": "This features comtains all test cases to check login functionality with both valid and \r\ninvalid credentials",
  "id": "validate-login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Validate Login Functionality with Valid Credentials",
  "description": "",
  "id": "validate-login-functionality;validate-login-functionality-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enter valid Username \"\u003cusername\u003e\" and Password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User lands on Dashboard Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "validate-login-functionality;validate-login-functionality-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "validate-login-functionality;validate-login-functionality-with-valid-credentials;;1"
    },
    {
      "cells": [
        "nandeesh.cl@impactanalytics.co",
        "Apjkalam!123"
      ],
      "line": 14,
      "id": "validate-login-functionality;validate-login-functionality-with-valid-credentials;;2"
    },
    {
      "cells": [
        "nandeesh.cl@impactanalytics.co",
        "Apjkalam!123"
      ],
      "line": 15,
      "id": "validate-login-functionality;validate-login-functionality-with-valid-credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3412281800,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Validate Login Functionality with Valid Credentials",
  "description": "",
  "id": "validate-login-functionality;validate-login-functionality-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enter valid Username \"nandeesh.cl@impactanalytics.co\" and Password \"Apjkalam!123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User lands on Dashboard Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_is_on_Login_Page()"
});
formatter.result({
  "duration": 7740694300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nandeesh.cl@impactanalytics.co",
      "offset": 27
    },
    {
      "val": "Apjkalam!123",
      "offset": 73
    }
  ],
  "location": "LoginSteps.user_enter_valid_Username_and_Password(String,String)"
});
formatter.result({
  "duration": 523769200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.click_on_Login_Button()"
});
formatter.result({
  "duration": 140392300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_lands_on_Dashboard_Page()"
});
formatter.result({
  "duration": 782832000,
  "status": "passed"
});
formatter.after({
  "duration": 751857900,
  "status": "passed"
});
formatter.before({
  "duration": 2004490300,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Validate Login Functionality with Valid Credentials",
  "description": "",
  "id": "validate-login-functionality;validate-login-functionality-with-valid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enter valid Username \"nandeesh.cl@impactanalytics.co\" and Password \"Apjkalam!123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User lands on Dashboard Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_is_on_Login_Page()"
});
formatter.result({
  "duration": 8350844700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nandeesh.cl@impactanalytics.co",
      "offset": 27
    },
    {
      "val": "Apjkalam!123",
      "offset": 73
    }
  ],
  "location": "LoginSteps.user_enter_valid_Username_and_Password(String,String)"
});
formatter.result({
  "duration": 16994500,
  "error_message": "org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027IABLR-LT155\u0027, ip: \u002710.0.75.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:125)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.clear(RemoteWebElement.java:124)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy21.clear(Unknown Source)\r\n\tat pages.LoginPage.setUserID(LoginPage.java:35)\r\n\tat steps.LoginSteps.user_enter_valid_Username_and_Password(LoginSteps.java:26)\r\n\tat ✽.When User enter valid Username \"nandeesh.cl@impactanalytics.co\" and Password \"Apjkalam!123\"(login.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.click_on_Login_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.user_lands_on_Dashboard_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2656013600,
  "status": "passed"
});
});