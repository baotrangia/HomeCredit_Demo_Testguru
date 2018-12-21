package pages.locators;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class SurveyPageLocators {

	
	//add service button
		@FindBy(xpath="//a[contains(@href, 'AddNewService')]")
		public WebElement addNewServiceBtn;
		
		//add new service fields
		@FindBy(id="categoryID")
		public WebElement categoryID;
		@FindBy(id="serviceTitle")
		public WebElement serviceTitle;
		@FindBy(id="serviceTitle_Arabic")
		public WebElement serviceTitle_Arabic;
		@FindBy(xpath="//input[@type='submit']")
		public WebElement saveServiceBtn;
		
		@FindAll({
			@FindBy(xpath="//div[@class='col-sm-5 col-sm-offset-4 alert alert-success']"),
			@FindBy(xpath="//div[@class='col-sm-5 col-sm-offset-4 alert alert-danger")
		})
		public WebElement responseMsgBox;
		
		//edit service 
		@FindBy(xpath="(//a[contains(@href,'UpdateService') and @class='btn btn-outline btn-info no-border'])[1]")
		public WebElement editServiceBtn;
		
		//delete service 
		@FindBy(xpath="(//a[contains(@class,'delete_btn')])[1]")
		public WebElement deleteServiceBtn;
		
		//confirm delete 
		@FindBy(xpath="//div[contains(@class,'bootbox-confirm')]//button[@data-bb-handler='confirm']")
		public WebElement confirmDeleteBtn;
		
				
		@FindBy(xpath="//input[@type='search']")
		public WebElement searchBox;
		
		@FindBy(xpath="//div[@class='box-body']//table//tr")
		public List<WebElement> tableCount;
		//public WebElement tableCount;
	
	
	
	
}
