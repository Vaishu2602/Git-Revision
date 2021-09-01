$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Login.feature");
formatter.feature({
  "name": "Validating login function of facebook website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validating login function with valid username and valid password.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@reg"
    }
  ]
});
formatter.step({
  "name": "User is on facebook website",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.user_is_on_facebook_website()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter username and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.user_should_enter_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.user_should_click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should validate home page is present or not",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_should_validate_home_page_is_present_or_not()"
});
formatter.result({
  "status": "skipped"
});
});