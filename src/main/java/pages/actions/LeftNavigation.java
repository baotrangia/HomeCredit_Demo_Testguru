package pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import pages.locators.LeftNavigationLocators;

public class LeftNavigation {
	
	public LeftNavigationLocators leftNavigationObj ;
	public LeftNavigation(WebDriver driver){
		
		this.leftNavigationObj = new LeftNavigationLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.leftNavigationObj);
	}
	
	public void gotoDashboard()
	{
		leftNavigationObj.dashboardLnk.click();
	}
	
	public void gotoChangePassword()
	{
		leftNavigationObj.changePasswordLnk.click();
	}
	
	public void gotoNewCustomer()
	{
		leftNavigationObj.newCustomerLnk.click();
	}
	
	public void gotoAddNewAccount()
	{
		leftNavigationObj.addAccount.click();
	}
	
	public void signout() throws InterruptedException {
		leftNavigationObj.logoutLnk.click();
	}
	public void gotoDeleteAccount()
	{
		leftNavigationObj.deleteAccountLnk.click();
	}
	public void gotoMiniStatement()
	{
		leftNavigationObj.miniStatementLnk.click();
	}
	
	public void gotoBalanceEnquiry()
	{
		leftNavigationObj.balanceEnquiryLnk.click();
	}
	
	public void gotoCustomizedStatement()
	{
		leftNavigationObj.customizedStatementLnk.click();
	}
	
	public void gotoDeleteCustomer() {
		leftNavigationObj.deleteCustomerLnk.click();
	}
	
	public  boolean elementHasClass(WebElement element, String desiredClass) {
		 return element.getAttribute("class").contains(desiredClass);
	}
	
	
	
	
}
