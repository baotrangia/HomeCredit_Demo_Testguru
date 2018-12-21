package steps;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.actions.LoginPage;
import utilities.SeleniumDriver;

public class LoginUserSteps {

	
	LoginPage LoginPage = new LoginPage();
	
	@Given("^user navigate to Guru demo webiste \"([^\"]*)\"$")
	public void user_navigate_to_Guru_demo_webiste(String url) throws Throwable {
	   SeleniumDriver.openPage(url);
	}

	@Given("^user enter valid  username \"([^\"]*)\" and  valid password \"([^\"]*)\"$")
	public void user_enter_valid_username_and_valid_password(String username, String password) throws Throwable {
	   LoginPage.enterLoginCredentials(username, password);
	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	   LoginPage.pressLoginBtn();
	}

	@Then("^should login successfully ands verify page URL \"([^\"]*)\"$")
	public void should_login_successfully_ands_verify_page_URL(String expected) throws Throwable {
	   String actual= LoginPage.getCurrentPageURL();
	   Assert.assertEquals(actual, expected);
	}

	@Then("^verify manager id \"([^\"]*)\"$")
	public void verify_manager_id(String expected) throws Throwable {
	   String actual = LoginPage.getWelcomeManagerID();
	   assertTrue(actual.contains(expected));
	}

	@Given("^user enter invalid  username \"([^\"]*)\" and  valid password \"([^\"]*)\"$")
	public void user_enter_invalid_username_and_valid_password(String username, String password) throws Throwable {
	   LoginPage.enterLoginCredentials(username, password);
	}

	@Then("^should get popup with message \"([^\"]*)\"$")
	public void should_get_popup_with_message(String expected) throws Throwable {
	  String actual = LoginPage.getInvalidCredentialsPopupMsg();
	  Assert.assertEquals(actual, expected);
	}

	@Given("^user enter valid  username \"([^\"]*)\" and  invalid password \"([^\"]*)\"$")
	public void user_enter_valid_username_and_invalid_password(String username, String password) throws Throwable {
		  LoginPage.enterLoginCredentials(username, password);
	}

	@Given("^user enter invalid  username \"([^\"]*)\" and  invalid password \"([^\"]*)\"$")
	public void user_enter_invalid_username_and_invalid_password(String username, String password) throws Throwable {
		 LoginPage.enterLoginCredentials(username, password);
	}


}
