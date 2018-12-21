package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeftNavigationLocators {

	//dashboard menu 
	@FindBy(xpath="//ul[@class='sidebar-menu']/li[1]/a")
	public WebElement dashboardLnk;
	
	//categories menu 
	@FindBy(xpath="//ul[@class='sidebar-menu']/li[2]")
	public WebElement categoriesDropDown;
	@FindBy(xpath="//ul[@class='sidebar-menu']/li[2]/a/span[1]")
	public WebElement categoriesLnk;
	@FindBy(xpath="//ul[@class='sidebar-menu']/li[2]/ul/li[1]/a")
	public WebElement businessUsrLnk;
	@FindBy(xpath="//ul[@class='sidebar-menu']/li[2]/ul/li[2]/a")
	public WebElement servicesLnk;
	@FindBy(xpath="//ul[@class='sidebar-menu']/li[2]/ul/li[3]/a")
	public WebElement categoriesListingLnk;
	
	//survey menu 
	@FindBy(xpath="//ul[@class='sidebar-menu']/li[3]")
	public WebElement surveryDropDown;
	@FindBy(xpath="//ul[@class='sidebar-menu']/li[3]/a")
	public WebElement surveyLnk;
	@FindBy(xpath="//ul[@class='sidebar-menu']/li[3]/ul/li[1]/a")
	public WebElement surveyQuestionsLnk;
	@FindBy(xpath="//ul[@class='sidebar-menu']/li[3]/ul/li[2]/a")
	public WebElement manageSurveyLnk;
	
	//suggestion menu 
	@FindBy(xpath="//ul[@class='sidebar-menu']/li[4]/a")
	public WebElement suggestionLnk;
	
	//complaint menu 
	@FindBy(xpath="//ul[@class='sidebar-menu']/li[5]/a")
	public WebElement complaintLnk;
	
	//logout
	@FindBy(xpath="//li[contains(@class, 'user-menu')]/a")
	public WebElement logoutContainer;
	
	@FindBy(xpath="//li[contains(@class, 'user-menu')]//ul//a")
	public WebElement signOutLnk;
	
}