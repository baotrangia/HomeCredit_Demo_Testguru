package pages.actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;

import pages.locators.LoginPageLocators;
import utilities.SeleniumDriver;

public class LoginPage {

	LoginPageLocators LoginPageLocators = null;

	public LoginPage() {
		this.LoginPageLocators = new LoginPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), LoginPageLocators);
	}

	public void enterLoginCredentials(String username, String password) {

		LoginPageLocators.UserID.sendKeys(username);
		LoginPageLocators.Password.sendKeys(password);

	}

	public void pressLoginBtn() {
		LoginPageLocators.btnLogin.click();
	}

	public String getWelcomeManagerID()
	{
		return LoginPageLocators.welcomeTxt.getText();
	}
	public String getCurrentPageURL() {
		return SeleniumDriver.getDriver().getCurrentUrl();
	}
	public String getInvalidCredentialsPopupMsg()
	{
		String actualBoxMsg = "";
	 	Alert alt = SeleniumDriver.getDriver().switchTo().alert();
		actualBoxMsg = alt.getText(); // get content of the Alter Message
		alt.accept();
		
		return actualBoxMsg;
	}
	

}
