Feature: Verify the login section

Background:
Given user navigate to Guru demo webiste "http://www.demo.guru99.com/V4/"


Scenario: In order to verify login with valid username and valid password
Given user enter valid  username "mngr168496" and  valid password "apAsAvY" 
Then user click on login button  
Then should login successfully ands verify page URL "http://www.demo.guru99.com/V4/manager/Managerhomepage.php"
And verify manager id "mngr168496"  


Scenario: In order to verify invalid login
Given user enter invalid  username "invalid" and  valid password "apAsAvY" 
Then user click on login button  
Then should get popup with message "User or Password is not valid"

Scenario: In order to verify invalid login
Given user enter valid  username "mngr168496" and  invalid password "invalid" 
Then user click on login button  
Then should get popup with message "User or Password is not valid"


Scenario: In order to verify invalid login
Given user enter invalid  username "invalid" and  invalid password "invalid" 
Then user click on login button  
Then should get popup with message "User or Password is not valid"



