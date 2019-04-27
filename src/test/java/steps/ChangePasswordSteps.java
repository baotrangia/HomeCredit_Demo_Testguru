package steps;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.actions.ChangePasswordPage;
import utilities.SeleniumDriver;
import utilities.SeleniumHelper;

public class ChangePasswordSteps {

	
	ChangePasswordPage ChangePasswordPage = new ChangePasswordPage();
	
	@Given("^user click on Change Password link in menu$")
	public void user_click_on_Change_Password_link_in_menu() throws Throwable {
	 SeleniumDriver.nav.gotoChangePassword();
	}
	
	@Then("^user enter enter  password \"([^\"]*)\" and new password \"([^\"]*)\" and confirm \"([^\"]*)\"$")
	public void user_enter_enter_password_and_new_password_and_confirm(String oldPassword, String newPassword, String confirmPassword) throws Throwable {
		ChangePasswordPage.enterPasswordCredentials(oldPassword, newPassword, confirmPassword);
	}


	@Then("^user click on submit button$")
	public void user_click_on_submit_button() throws Throwable {
	  ChangePasswordPage.clickOnSubmitBtntoChangepass();
	}

	

	@Then("^should be redirected to login page \"([^\"]*)\"$")
	public void should_be_redirected_to_login_page(String expected) throws Throwable {
	   String actual =SeleniumHelper.getCurrentPageURL();
	   Assert.assertEquals(actual, expected);
	}


}
