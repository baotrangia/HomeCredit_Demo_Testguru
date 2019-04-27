@manager-acceptance-test

Feature: Delete Customer & Edit customer

Background:
Given user navigate to Guru demo webiste "http://www.demo.guru99.com/V4/"
Then user enter valid  username "mngr191958" and  valid password "dyguqez" 
Then user click on login button  
Then should login successfully ands verify page URL "http://www.demo.guru99.com/V4/manager/Managerhomepage.php"
And verify manager id "mngr191958"  


Scenario: Verify confirmation message is shown when customer is deleted
Given user click Delete Customer in menu link
Then user enter existing customer id "19897" 
When user click delete customer button
Then verify a pop up with message "Do you really want to delete this customer?" is shown
    

Scenario: Verify that customer should not be deleted if any account exists for that customer
Given user click Delete Customer in menu link
Then user enter existing customer id "16030" with account associate with 
When user click delete customer button
Then verify a pop - up "customer could not be deleted!!. first delete all accounts of this customer then delete the customer" is shown
Then should redirect to Home Page
   	

Scenario: Verify deleted customer cannot be edited
Given user click Delete Customer in menu link
Then user enter existing customer id "33477" with account associate with 
When user click delete customer button
Then verify a pop - up "customer does not exist!!" is shown
Then should redirect to Home Page

Scenario: Verify system behaviour when manager deletes a non existing customer ID
Given user click Delete Customer in menu link
Then user enter non existing customer id "4344"  
When user click delete customer button
Then verify a pop - up "customer does not exist!!" is shown
Then should redirect to Home Page






