package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.AccountsPageLocators;
import utilities.SeleniumDriver;
import utilities.SeleniumHelper;

public class AccountsPage {

	AccountsPageLocators AccountsPageLocators = null;

	public AccountsPage() {
		this.AccountsPageLocators = new AccountsPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), AccountsPageLocators);
	}
	
	public void enterAccountNotoDelete(String accontNumber)
	{
		if(!AccountsPageLocators.accountno.getText().isEmpty()) {
			AccountsPageLocators.accountno.clear();
		}
		AccountsPageLocators.accountno.sendKeys(accontNumber);
	}
	
	public void clickToDeleteAcocunt()
	{
		AccountsPageLocators.AccSubmit.click();
	}
	
	public String getDeleteAccountConfirmBoxTxt()
	{
		return SeleniumHelper.getPopupTxt();
	}
	
	public void clickToConfirmDeleteAcocunt()
	{
		SeleniumHelper.confirmOrDismissPopup("confirm");
	}
	
	public String getDeleteAcountSuccessMsg()
	{
		return SeleniumHelper.getPopupTxt();
	}

	public void enterDeletedAccountNumberForBalanceEnquiry(String accountNumber)
	{
		AccountsPageLocators.accountno.sendKeys(accountNumber);
	}
	
	public void retriveBalanceEnquiry()
	{
		AccountsPageLocators.AccSubmit.click();
	}
	
	public String retriveBalanceEnquiryResponse()
	{
		return SeleniumHelper.getPopupTxt();
	}
	
	public void retriveCustomizeStatement()
	{
		AccountsPageLocators.AccSubmit.click();
	}
	

	

}
