$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful login with valid credentials",
  "description": "",
  "id": "login-functionality;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user navigates to login",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter valid username \"standard_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user should be redirected to the home page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 9,
  "name": "Login with invalid credentials",
  "description": "",
  "id": "login-functionality;login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user navigates to login",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user enter invalid username \"invalid_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user should see an error message \"Epic sadface: Username and password do not match any user in this service\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 15,
  "name": "Login without entering credentials",
  "description": "",
  "id": "login-functionality;login-without-entering-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "user navigates to login",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user should see an error message \"Epic sadface: Username is required\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});