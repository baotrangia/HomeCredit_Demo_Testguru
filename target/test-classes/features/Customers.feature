Feature: Add New Customer & Account

Background:
Given user navigate to Guru demo webiste "http://www.demo.guru99.com/V4/"
Then user enter valid  username "mngr191958" and  valid password "dyguqez" 
Then user click on login button  
Then should login successfully ands verify page URL "http://www.demo.guru99.com/V4/manager/Managerhomepage.php"
And verify manager id "mngr191958"  


Scenario: Verify after Adding New Customer, page redirects to details of added customer
Given user click on New Customer link in menu
Then user enter customer details 
    | Customer ID 		| 	Customer Name	|	Gender  |Birthdate		|Address 		|City			| State		|Pin			|  Mobile No 	|Email 						 |Password 	|
    | 16030						|		Badal Roi			|	male		|	2000-11-04	|Jamnagar		|Jamnagar	|Gujarat	|567321		|	8000439024	|	badalroi89@test.com 	 |1234$			|
Then user click on save customer button
Then details of added Customer must be shown with message "Customer Registered Successfully!!!"    
    

Scenario: Verify a new account can be added to new customer
Given user click on New Account link in menu
Then entrer account details
		| Customer ID	|	Account Type	| Initial deposit	|
		|	16030				| Savings				| 1000						|
Then user click on add acocunt submit button
Then details of new added account must be shown with message "Account Generated Successfully!!!" 
And account id and customer id mush be shown in details 
		
   	




