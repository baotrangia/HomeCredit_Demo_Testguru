package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomersPageLocators {

	@FindBy(name="name")
	public WebElement name;
	@FindBy(xpath="//input[contains(@type,'radio') and @value='m']")
	public WebElement male;
	@FindBy(xpath="//input[contains(@type,'radio') and @value='f']")
	public WebElement female;
	@FindBy(name="dob")
	public WebElement dob;
	@FindBy(name="addr")
	public WebElement addr;
	@FindBy(name="city")
	public WebElement city;
	@FindBy(name="state")
	public WebElement state;
	@FindBy(name="pinno")
	public WebElement pinno;
	@FindBy(name="telephoneno")
	public WebElement telephoneno;
	@FindBy(name="emailid")
	public WebElement emailid;
	@FindBy(name="password")
	public WebElement password;
	@FindBy(name="sub")
	public WebElement submitBtn;
	@FindBy(xpath="//table//p[@class=\"heading3\"]")
	public WebElement successMsg;
	
	@FindBy(xpath="//table[@name='account']//tr[4]/td[2]")
	public WebElement accountIDContainer;
	@FindBy(xpath="//table[@name='account']//tr[5]/td[2]")
	public WebElement customerIDContainer;
	@FindBy(xpath="//table[@name='account']//tr[1]//p[@class='heading3']")
	public WebElement newAccountSuccessMsg;
	
	@FindBy(name="cusid")
	public WebElement cusid;
	@FindBy(name="selaccount")
	public WebElement selaccount;
	@FindBy(name="inideposit")
	public WebElement inideposit;
	@FindBy(name="button2")
	public WebElement addNewAcocuntBtn;
	@FindBy(name="AccSubmit")
	public WebElement AccSubmit;
	
	
	
	
	
	
	
	
	
	
	
	
	

}


