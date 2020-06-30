$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/murta/eclipse-workspace/TestEnvironment/src/main/java/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to Test Environment",
  "description": "",
  "id": "login-to-test-environment",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login to My Account",
  "description": "",
  "id": "login-to-test-environment;login-to-my-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@loginTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "the user is on Test Environment Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on MyAccount",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enters username \u0027sdet@tekschool.us\u0027 and password \u0027sdet\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should be on user dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.the_user_is_on_Test_Environment_Page()"
});
formatter.result({
  "duration": 8198580699,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_click_on_MyAccount()"
});
formatter.result({
  "duration": 75587000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_click_on_Login()"
});
formatter.result({
  "duration": 327830400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username_sdet_tekschool_us_and_password_sdet()"
});
formatter.result({
  "duration": 192193100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_click_on_Login_button()"
});
formatter.result({
  "duration": 422376801,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_should_be_on_user_dashboard()"
});
formatter.result({
  "duration": 702994600,
  "status": "passed"
});
});