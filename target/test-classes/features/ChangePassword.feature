Feature: Change Password and Login

Background:
Given user navigate to Guru demo webiste "http://www.demo.guru99.com/V4/"
Then user enter valid  username "mngr191958" and" and  valid password "dyguqez" 
Then user click on login button  
Then should login successfully ands verify page URL "http://www.demo.guru99.com/V4/manager/Managerhomepage.php"
And verify manager id "mngr191958"  


Scenario: In order to verify change Password with invalid old password
Given user click on Change Password link in menu
Then user enter enter  password "invalid" and new password "dyguqez" and confirm "dyguqez"
Then user click on submit button
Then should get popup with message "Old Password is incorrect"



Scenario: Verify after password is changed page is redirected to Login screen
Given user click on Change Password link in menu
Then user enter enter  password "12345@" and new password "12345@" and confirm "12345@"
Then user click on submit button
Then should get popup with message "Password is Changed"
Then should be redirected to login page "http://www.demo.guru99.com/V4/index.php"




