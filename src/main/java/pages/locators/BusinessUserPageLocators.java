package pages.locators;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class BusinessUserPageLocators {

	
	/*public BusinessUserPageLocators(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}*/

	//add user button
	@FindBy(xpath="//section[@class='content']//div[2][@class='col-sm-12']/a")
	public WebElement addNewBUserLnk;
	
	//add new business user fields
	@FindBy(id="categoryID")
	public WebElement categoryID;
	@FindBy(id="serviceID")
	public WebElement serviceID;
	@FindBy(id="fullName")
	public WebElement fullName;
	@FindBy(id="emailAddress")
	public WebElement emailAddress;
	@FindBy(id="contactNo")
	public WebElement contactNo;
	@FindBy(id="address")
	public WebElement address;
	@FindBy(id="username")
	public WebElement username;
	@FindBy(id="password")
	public WebElement password;
	@FindBy(xpath="//input[@type='submit']")
	public WebElement saveBusinessUsrBtn;
	@FindAll({
		@FindBy(xpath="//div[@class='col-sm-5 col-sm-offset-4 alert alert-success']"),
		@FindBy(xpath="//div[@class='col-sm-5 col-sm-offset-4 alert alert-danger")
	})
	public WebElement responseMsgBox;
	
	//edit business user 
	@FindBy(xpath="(//a[contains(@href,'UpdateUserDetails') and @class='btn btn-outline btn-info no-border'])[1]")
	public WebElement editBUserBtn;
	
	@FindBy(xpath="//input[@type='search']")
	public WebElement searchBox;
	
	@FindBy(xpath="//div[@class='box-body']//table//tr")
	public List<WebElement> tableCount;
	//public WebElement tableCount;
	
	
	
	
}
