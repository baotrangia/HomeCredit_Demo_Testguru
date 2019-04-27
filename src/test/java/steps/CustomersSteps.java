package steps;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.actions.CustomersPage;
import utilities.SeleniumDriver;

public class CustomersSteps {

	CustomersPage CustomersPage = new CustomersPage();

	@Given("^user click on New Customer link in menu$")
	public void user_click_on_New_Customer_link_in_menu() throws Throwable {
		SeleniumDriver.nav.gotoNewCustomer();
	}

	@Then("^user enter customer details$")
	public void user_enter_customer_details(DataTable table) throws Throwable {
		CustomersPage.enterCustomerDetails(table);
	}

	@Then("^user click on save customer button$")
	public void user_click_on_save_customer_button() throws Throwable {
		CustomersPage.clickSaveCustomerBtn();
	}

	@Then("^details of added Customer must be shown with message \"([^\"]*)\"$")
	public void details_of_added_Customer_must_be_shown_with_message(String expected) throws Throwable {
		String actual = CustomersPage.verifyNewCustomedAdded();
		System.out.println("actual message is "+actual);
		assertTrue(actual.contains(expected));
	}
	
	/*
	 * Account section
	 * */
	
	@Given("^user click on New Account link in menu$")
	public void user_click_on_New_Account_link_in_menu() throws Throwable {
	   SeleniumDriver.nav.gotoAddNewAccount();
	}

	@Then("^entrer account details$")
	public void entrer_account_details(DataTable table) throws Throwable {
	  CustomersPage.enterAccountDetails(table);
	}

	@Then("^user click on add acocunt submit button$")
	public void user_click_on_add_acocunt_submit_button() throws Throwable {
	   CustomersPage.clickOnAddNewAcocuntBtn();
	}

	@Then("^details of new added account must be shown with message \"([^\"]*)\"$")
	public void details_of_new_added_account_must_be_shown_with_message(String expected) throws Throwable {
	   String actual = CustomersPage.verifyCustomerAccountAdded();
	   assertTrue(actual.contains(expected));
	}

	@Then("^account id and customer id mush be shown in details$")
	public void account_id_and_customer_id_mush_be_shown_in_details() throws Throwable {
	   String accountID = CustomersPage.verifyAccountIDExists();
	   assertNotNull(accountID);
	}



}
