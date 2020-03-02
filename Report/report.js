$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality in adactin application",
  "description": "",
  "id": "login-functionality-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User validate the login function using username and password",
  "description": "",
  "id": "login-functionality-in-adactin-application;user-validate-the-login-function-using-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter the username",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enter the password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User click on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefintion.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 7664222600,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefintion.user_enter_the_username()"
});
formatter.result({
  "duration": 3155378700,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefintion.user_enter_the_password()"
});
formatter.result({
  "duration": 569535200,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefintion.user_click_on_the_login_button()"
});
formatter.result({
  "duration": 4735823900,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "User logout from the application",
  "description": "",
  "id": "login-functionality-in-adactin-application;user-logout-from-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 43,
      "name": "@logout"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "User click on logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefintion.User_click_on_logout_button()"
});
formatter.result({
  "duration": 1739822900,
  "status": "passed"
});
});