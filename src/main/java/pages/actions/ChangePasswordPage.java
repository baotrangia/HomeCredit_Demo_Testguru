package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.ChangePasswordPageLocators;
import utilities.SeleniumDriver;
import utilities.SeleniumHelper;

public class ChangePasswordPage {

	ChangePasswordPageLocators ChangePasswordPageLocators = null;

	public ChangePasswordPage() {
		this.ChangePasswordPageLocators = new ChangePasswordPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), ChangePasswordPageLocators);
	}
	
	public void enterPasswordCredentials(String oldpassword, String newPassword, String confirmPassword)
	{
		ChangePasswordPageLocators.oldpassword.clear();
		ChangePasswordPageLocators.newpassword.clear();
		ChangePasswordPageLocators.confirmpassword.clear();
		
		ChangePasswordPageLocators.oldpassword.sendKeys(oldpassword);
		ChangePasswordPageLocators.newpassword.sendKeys(newPassword);
		ChangePasswordPageLocators.confirmpassword.sendKeys(confirmPassword);
	}
	
	public void clickOnSubmitBtntoChangepass()
	{
		ChangePasswordPageLocators.submitBtn.click();
	}
	
	

}
