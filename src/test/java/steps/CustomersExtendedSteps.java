package steps;

import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CustomersPage;
import utilities.SeleniumDriver;
import utilities.SeleniumHelper;

public class CustomersExtendedSteps {

	CustomersPage CustomersPage = new CustomersPage();

	@Given("^user click Delete Customer in menu link$")
	public void user_click_Delete_Customer_in_menu_link() throws Throwable {
	  SeleniumDriver.nav.gotoDeleteCustomer();
	}

	@Then("^user enter existing customer id \"([^\"]*)\"$")
	public void user_enter_existing_customer_id(String customerID) throws Throwable {
	    CustomersPage.enterCustomerIDtoDeleteAccount(customerID);
	}

	@When("^user click delete customer button$")
	public void user_click_delete_customer_button() throws Throwable {
		 CustomersPage.clickDeleteCustomerAccountBtn();
	}


	@Then("^verify a pop up with message \"([^\"]*)\" is shown$")
	public void verify_a_pop_up_with_message_is_shown(String expected) throws Throwable {
	
	   String actual = SeleniumHelper.getConfirmPopupMsg();
	   Assert.assertEquals(actual.toLowerCase(), expected.toLowerCase());
	}
	
	@Then("^verify a pop up \"([^\"]*)\" is shown$")
	public void verify_a_pop_up_is_shown(String expected) throws Throwable {
		SeleniumHelper.getPopupTxt();
	   String actual = SeleniumHelper.getConfirmPopupMsg();
	   Assert.assertEquals(actual.toLowerCase(), expected.toLowerCase());
	}

	@Then("^user enter existing customer id \"([^\"]*)\" with account associate with$")
	public void user_enter_existing_customer_id_with_account_associate_with(String customerID) throws Throwable {
	  CustomersPage.enterCustomerIDtoDeleteAccount(customerID);
	}

	

	@Then("^should redirect to Home Page$")
	public void should_redirect_to_Home_Page() throws Throwable {
	 String actual = SeleniumHelper.getPageTitle();
	 Assert.assertEquals(actual, "Guru99 Bank Delete Customer Page");
	}

	@Then("^user enter non existing customer id \"([^\"]*)\"$")
	public void user_enter_non_existing_customer_id(String customerID) throws Throwable {
		 CustomersPage.enterCustomerIDtoDeleteAccount(customerID);
	}
	
	@Then("^verify a pop - up \"([^\"]*)\" is shown$")
	public void verify_a_pop_up_with_msg_is_shown(String expected) throws Throwable {
		SeleniumHelper.getPopupTxt();
		 String actual = SeleniumHelper.getConfirmPopupMsg();
		 Assert.assertEquals(actual.toLowerCase(), expected.toLowerCase());
	}

	





}
