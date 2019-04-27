package pages.actions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import pages.locators.CustomersPageLocators;
import utilities.SeleniumDriver;
import utilities.SeleniumHelper;

public class CustomersPage {

	CustomersPageLocators CustomersPageLocators = null;

	public CustomersPage() {
		this.CustomersPageLocators = new CustomersPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), CustomersPageLocators);
	}

	public void enterCustomerDetails(DataTable table) {
		
		List<Map<String,String>> data = table.asMaps(String.class, String.class);
		//BusinessUserPageLocators.fullName.sendKeys(data.get(0).get("FullName"));
		//clear all input fields
		/*CustomersPageLocators.name.clear();
		CustomersPageLocators.addr.clear();
		CustomersPageLocators.dob.clear();
		CustomersPageLocators.city.clear();
		CustomersPageLocators.pinno.clear();
		CustomersPageLocators.state.clear();
		CustomersPageLocators.telephoneno.clear();
		CustomersPageLocators.emailid.clear();
		CustomersPageLocators.password.clear();*/
		
		CustomersPageLocators.name.sendKeys(data.get(0).get("Customer Name"));
		String gender = data.get(0).get("Gender");
		if(gender=="male")
		{
			CustomersPageLocators.male.click();
		}else
		{
			CustomersPageLocators.female.click();
		}
		
		CustomersPageLocators.dob.sendKeys(data.get(0).get("Birthdate"));
		CustomersPageLocators.addr.sendKeys(data.get(0).get("Address"));
		CustomersPageLocators.city.sendKeys(data.get(0).get("City"));
		CustomersPageLocators.state.sendKeys(data.get(0).get("State"));
		CustomersPageLocators.pinno.sendKeys(data.get(0).get("Pin"));
		CustomersPageLocators.telephoneno.sendKeys(data.get(0).get("Mobile No"));
		CustomersPageLocators.emailid.sendKeys(data.get(0).get("Email"));
		CustomersPageLocators.password.sendKeys(data.get(0).get("Password"));
		
	}
	
	public void clickSaveCustomerBtn()
	{
		CustomersPageLocators.submitBtn.click();
	}
	
	public String verifyNewCustomedAdded()
	{
		try {
			return CustomersPageLocators.successMsg.getText();
		}catch(Exception e){
			return  SeleniumHelper.getPopupTxt();
		}
	
	}
	
	public void enterAccountDetails(DataTable table)
	{
		List<Map<String,String>> data = table.asMaps(String.class, String.class);
		
		CustomersPageLocators.cusid.sendKeys(data.get(0).get("Customer ID"));
		Select AccountType = new Select(CustomersPageLocators.selaccount);
		AccountType.selectByValue(data.get(0).get("Account Type"));
		CustomersPageLocators.inideposit.sendKeys(data.get(0).get("Initial deposit"));
	}
	
	public void clickOnAddNewAcocuntBtn()
	{
		CustomersPageLocators.addNewAcocuntBtn.click();
	}
	
	
	public String verifyCustomerAccountAdded()
	{
		try {
			return CustomersPageLocators.newAccountSuccessMsg.getText();
		}catch(Exception e){
			return  SeleniumHelper.getPopupTxt();
		}
	
	}
	
	public String verifyAccountIDExists()
	{
		return CustomersPageLocators.accountIDContainer.getText();
	}

	public void enterCustomerIDtoDeleteAccount(String customerID)
	{
		CustomersPageLocators.cusid.sendKeys(customerID);
	}
	
	public void clickDeleteCustomerAccountBtn()
	{
		CustomersPageLocators.AccSubmit.click();
	}
	

}
