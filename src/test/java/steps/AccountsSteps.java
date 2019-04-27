package steps;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.AccountsPage;
import utilities.SeleniumDriver;
import utilities.SeleniumHelper;

public class AccountsSteps {

	AccountsPage AccountsPage = new AccountsPage();
	
	@Given("^user click on Delete Account link in menu$")
	public void user_click_on_Delete_Account_link_in_menu() throws Throwable {
		SeleniumDriver.nav.gotoDeleteAccount();
	}

	@Then("^user enter account number \"([^\"]*)\" to delete$")
	public void user_enter_account_number_to_delete(String accontNumber) throws Throwable {
		AccountsPage.enterAccountNotoDelete(accontNumber);
	}

	@When("^user click on delete account button$")
	public void user_click_on_delete_account_button() throws Throwable {
		AccountsPage.clickToDeleteAcocunt();
	}

	@Then("^a pop - up \"([^\"]*)\" is shown$")
	public void a_pop_up_is_shown(String expected) throws Throwable {
		String actual = AccountsPage.getDeleteAccountConfirmBoxTxt();
		//assertTrue(actual.contains(expected));
		Assert.assertEquals(actual.toLowerCase(), expected.toLowerCase());
	}

	
	@Then("^a message \"([^\"]*)\" is shown$")
	public void a_message_is_shown(String expected) throws Throwable {
		String actual = AccountsPage.getDeleteAcountSuccessMsg();
		Assert.assertEquals(actual.toLowerCase(), expected.toLowerCase());
	}

	@Then("^a pop - up \"([^\"]*)\" is shown and click on yes$")
	public void a_pop_up_is_shown_and_click_on_yes(String expected) throws Throwable {
		String actual = AccountsPage.getDeleteAcountSuccessMsg();
		Assert.assertEquals(actual.toLowerCase(), expected.toLowerCase());
	}

	
	@Then("^page redirected to manager home page \"([^\"]*)\"$" )
	public void page_redirected_to_manager_home_page(String expected) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String actual = SeleniumHelper.getCurrentPageURL();
		Assert.assertEquals(actual.toLowerCase(), expected.toLowerCase());
	}

	@Given("^user click on Mini Statement link in menu$")
	public void user_click_on_Mini_Statement_link_in_menu() throws Throwable {
		SeleniumDriver.nav.gotoMiniStatement();
	}

	@Then("^enter deleted account number \"([^\"]*)\"$")
	public void enter_deleted_account_number(String accontNumber) throws Throwable {
		AccountsPage.enterAccountNotoDelete(accontNumber);
	}
	
	@When("^user click on get mini statement button$")
	public void user_click_on_get_mini_statement_button() throws Throwable {
	   AccountsPage.clickToDeleteAcocunt();
	}

	

	@Then("^a pop up with message \"([^\"]*)\" appear$")
	public void a_pop_up_with_message_appear(String expected) throws Throwable {
		String actual = AccountsPage.getDeleteAcountSuccessMsg();
		Assert.assertEquals(actual.toLowerCase(), expected.toLowerCase());
		//assertTrue(actual.contains(expected));
	}



	@Then("^it should redirect to Mini Statement page$")
	public void it_should_redirect_to_Mini_Statement_page() throws Throwable {
		String actual = SeleniumHelper.getPageTitle();
		Assert.assertEquals(actual.toLowerCase(), "Guru99 Bank Mini Statement Page".toLowerCase());
		//assertTrue(actual.contains("Guru99 Bank Mini Statement Page"));
	}
	
	
	@Given("^click on Balance Enquiry menu link$")
	public void click_on_Balance_Enquiry_menu_link() throws Throwable {
	   SeleniumDriver.nav.gotoBalanceEnquiry();
	}

	@Then("^entered deleted account number \"([^\"]*)\"$")
	public void entered_deleted_account_number(String accountNumber) throws Throwable {
	   AccountsPage.enterDeletedAccountNumberForBalanceEnquiry(accountNumber);
	}

	@When("^user click on balance enquiry button$")
	public void user_click_on_balance_enquiry_button() throws Throwable {
		AccountsPage.retriveBalanceEnquiry();
	}

	@Then("^a pop up with get message \"([^\"]*)\"\" appear$")
	public void a_pop_up_with_get_message_appear(String expected) throws Throwable {
	    String actual = AccountsPage.retriveBalanceEnquiryResponse();
	    Assert.assertEquals(actual.toLowerCase(), expected.toLowerCase());
	}

	@Then("^it should redirects to Balance Enquiry page$")
	public void it_should_redirects_to_Balance_Enquiry_page() throws Throwable {
	   String actual = SeleniumHelper.getPageTitle();
	   Assert.assertEquals(actual.toLowerCase(), "Guru99 Bank Balance Enquiry Page".toLowerCase());
	   
	}

	@Given("^click on Customized statement in menu link$")
	public void click_on_Customized_statement_in_menu_link() throws Throwable {
		SeleniumDriver.nav.gotoCustomizedStatement();
	}

	@When("^user click on get customized statement button$")
	public void user_click_on_get_customized_statement_button() throws Throwable {
		AccountsPage.retriveCustomizeStatement();
		
	}

	@Then("^it should redirects to Customized Statement page$")
	public void it_should_redirects_to_Customized_Statement_page() throws Throwable {
		  String actual = SeleniumHelper.getPageTitle();
		   Assert.assertEquals(actual.toLowerCase(), "Guru99 Bank Statement Page".toLowerCase());
	}
	

}
