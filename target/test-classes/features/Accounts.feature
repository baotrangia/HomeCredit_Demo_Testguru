Feature: Delete Account & check  Mini Statement, Balance Enquiry

Background:
Given user navigate to Guru demo webiste "http://www.demo.guru99.com/V4/"
Then user enter valid  username "mngr191958" and  valid password "dyguqez" 
Then user click on login button  
Then should login successfully ands verify page URL "http://www.demo.guru99.com/V4/manager/Managerhomepage.php"
And verify manager id "mngr191958"  


Scenario: Verify confirmation message is shown on deletion of an account
Given user click on Delete Account link in menu
Then user enter account number "54368" to delete
When user click on delete account button
Then a pop - up "Do you really want to delete this Account?" is shown
 
    

Scenario: Verify system behaviour after Account is deleted
Given user click on Delete Account link in menu
Then user enter account number "54368" to delete
When user click on delete account button
Then a pop - up "Do you really want to delete this Account?" is shown and click on yes 
Then a message "Account Deleted Sucessfully" is shown
Then page redirected to manager home page "http://www.demo.guru99.com/V4/manager/Managerhomepage.php"
		

Scenario: Verify that mini statement is not generated for a deleted account
Given user click on Mini Statement link in menu
Then enter deleted account number "54368"
When user click on get mini statement button
Then a pop up with message "Account does not exist" appear
Then it should redirect to Mini Statement page



Scenario: Verify balance for deleted account
Given click on Balance Enquiry menu link
Then entered deleted account number "54368"
When user click on balance enquiry button
Then a pop up with get message "Account does not exist"" appear
Then it should redirects to Balance Enquiry page

Scenario: Verify that customized statement is not generated for deleted account
Given click on Customized statement in menu link
Then entered deleted account number "54368"
When user click on get customized statement button
Then a pop up with get message "Account does not exist"" appear
Then it should redirects to Customized Statement page





