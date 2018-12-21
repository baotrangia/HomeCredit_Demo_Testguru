$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginUser.feature");
formatter.feature({
  "line": 1,
  "name": "Verify the login section",
  "description": "",
  "id": "verify-the-login-section",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4764085918,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user navigate to Guru demo webiste \"http://www.demo.guru99.com/V4/\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.demo.guru99.com/V4/",
      "offset": 36
    }
  ],
  "location": "LoginUserSteps.user_navigate_to_Guru_demo_webiste(String)"
});
formatter.result({
  "duration": 4444219639,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "In order to verify login with valid username and valid password",
  "description": "",
  "id": "verify-the-login-section;in-order-to-verify-login-with-valid-username-and-valid-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "user enter valid  username \"mngr168496\" and  valid password \"apAsAvY\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "should login successfully ands verify page URL \"http://www.demo.guru99.com/V4/manager/Managerhomepage.php\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "verify manager id \"mngr168496\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "mngr168496",
      "offset": 28
    },
    {
      "val": "apAsAvY",
      "offset": 61
    }
  ],
  "location": "LoginUserSteps.user_enter_valid_username_and_valid_password(String,String)"
});
formatter.result({
  "duration": 426419018,
  "status": "passed"
});
formatter.match({
  "location": "LoginUserSteps.user_click_on_login_button()"
});
formatter.result({
  "duration": 1881730398,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.demo.guru99.com/V4/manager/Managerhomepage.php",
      "offset": 48
    }
  ],
  "location": "LoginUserSteps.should_login_successfully_ands_verify_page_URL(String)"
});
formatter.result({
  "duration": 46609009,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mngr168496",
      "offset": 19
    }
  ],
  "location": "LoginUserSteps.verify_manager_id(String)"
});
formatter.result({
  "duration": 155351546,
  "status": "passed"
});
formatter.after({
  "duration": 894274383,
  "status": "passed"
});
formatter.before({
  "duration": 3360919622,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user navigate to Guru demo webiste \"http://www.demo.guru99.com/V4/\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.demo.guru99.com/V4/",
      "offset": 36
    }
  ],
  "location": "LoginUserSteps.user_navigate_to_Guru_demo_webiste(String)"
});
formatter.result({
  "duration": 3683846207,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "In order to verify invalid login",
  "description": "",
  "id": "verify-the-login-section;in-order-to-verify-invalid-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "user enter invalid  username \"invalid\" and  valid password \"apAsAvY\"",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "should get popup with message \"User or Password is not valid\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "invalid",
      "offset": 30
    },
    {
      "val": "apAsAvY",
      "offset": 60
    }
  ],
  "location": "LoginUserSteps.user_enter_invalid_username_and_valid_password(String,String)"
});
formatter.result({
  "duration": 367173654,
  "status": "passed"
});
formatter.match({
  "location": "LoginUserSteps.user_click_on_login_button()"
});
formatter.result({
  "duration": 419606107,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "User or Password is not valid",
      "offset": 31
    }
  ],
  "location": "LoginUserSteps.should_get_popup_with_message(String)"
});
formatter.result({
  "duration": 12961979,
  "status": "passed"
});
formatter.after({
  "duration": 882748789,
  "status": "passed"
});
formatter.before({
  "duration": 3410974273,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user navigate to Guru demo webiste \"http://www.demo.guru99.com/V4/\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.demo.guru99.com/V4/",
      "offset": 36
    }
  ],
  "location": "LoginUserSteps.user_navigate_to_Guru_demo_webiste(String)"
});
formatter.result({
  "duration": 4976096030,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "In order to verify invalid login",
  "description": "",
  "id": "verify-the-login-section;in-order-to-verify-invalid-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "user enter valid  username \"mngr168496\" and  invalid password \"invalid\"",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "should get popup with message \"User or Password is not valid\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "mngr168496",
      "offset": 28
    },
    {
      "val": "invalid",
      "offset": 63
    }
  ],
  "location": "LoginUserSteps.user_enter_valid_username_and_invalid_password(String,String)"
});
formatter.result({
  "duration": 275654665,
  "status": "passed"
});
formatter.match({
  "location": "LoginUserSteps.user_click_on_login_button()"
});
formatter.result({
  "duration": 1042348374,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "User or Password is not valid",
      "offset": 31
    }
  ],
  "location": "LoginUserSteps.should_get_popup_with_message(String)"
});
formatter.result({
  "duration": 12930257,
  "status": "passed"
});
formatter.after({
  "duration": 2810416888,
  "status": "passed"
});
formatter.before({
  "duration": 3346567444,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user navigate to Guru demo webiste \"http://www.demo.guru99.com/V4/\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.demo.guru99.com/V4/",
      "offset": 36
    }
  ],
  "location": "LoginUserSteps.user_navigate_to_Guru_demo_webiste(String)"
});
formatter.result({
  "duration": 8765860988,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "In order to verify invalid login",
  "description": "",
  "id": "verify-the-login-section;in-order-to-verify-invalid-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "user enter invalid  username \"invalid\" and  invalid password \"invalid\"",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "should get popup with message \"User or Password is not valid\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "invalid",
      "offset": 30
    },
    {
      "val": "invalid",
      "offset": 62
    }
  ],
  "location": "LoginUserSteps.user_enter_invalid_username_and_invalid_password(String,String)"
});
formatter.result({
  "duration": 280555818,
  "status": "passed"
});
formatter.match({
  "location": "LoginUserSteps.user_click_on_login_button()"
});
formatter.result({
  "duration": 986077010,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "User or Password is not valid",
      "offset": 31
    }
  ],
  "location": "LoginUserSteps.should_get_popup_with_message(String)"
});
formatter.result({
  "duration": 9844293,
  "status": "passed"
});
formatter.after({
  "duration": 3035601241,
  "status": "passed"
});
});