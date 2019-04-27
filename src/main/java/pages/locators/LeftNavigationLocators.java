package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeftNavigationLocators {

	//dashboardLnk menu link
	@FindBy(xpath="//a[contains(@href,'Managerhomepage.php')]")
	public WebElement dashboardLnk;

	//change password menu link
	@FindBy(xpath="//a[contains(@href,'PasswordInput.php')]")
	public WebElement changePasswordLnk;
	
	//New Customer menu link 
	@FindBy(xpath="//a[contains(@href,'addcustomerpage.php')]")
	public WebElement newCustomerLnk;
	//Delete Account menu link 
	@FindBy(xpath="//a[contains(@href,'deleteAccountInput.php')]")
	public WebElement deleteAccountLnk;
	//Delete Account menu link 
	@FindBy(xpath="//a[contains(@href,'MiniStatementInput.php')]")
	public WebElement miniStatementLnk;
	//Balance Enquiry menu link 
	@FindBy(xpath="//a[contains(@href,'BalEnqInput.php')]")
	public WebElement balanceEnquiryLnk;
	//Balance Customized StatementInput menu link 
	@FindBy(xpath="//a[contains(@href,'CustomisedStatementInput.php')]")
	public WebElement customizedStatementLnk;
	//Delete Customer DeleteCustomerInput menu link 
	@FindBy(xpath="//a[contains(@href,'DeleteCustomerInput.php')]")
	public WebElement deleteCustomerLnk;

	//
	//logout menu link 
	@FindBy(xpath="//a[contains(@href,'Logout.php')]")
	public WebElement logoutLnk;
	
	//New Account menu link 
	@FindBy(xpath="//a[contains(@href,'addAccount.php')]")
	public WebElement addAccount;

	
}