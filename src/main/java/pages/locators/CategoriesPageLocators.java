package pages.locators;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class CategoriesPageLocators {

	
	//add service button
		@FindBy(xpath="//a[contains(@href, 'AddCategory')]")
		public WebElement addNewCategoryBtn;
		
		//add new service fields
		@FindBy(id="categoryTitle")
		public WebElement categoryTitle;
		@FindBy(id="categoryTitle_Arabic")
		public WebElement categoryTitle_Arabic;
		
		@FindBy(xpath="//input[@type='submit']")
		public WebElement saveCategoryBtn;
		
		@FindAll({
			@FindBy(xpath="//div[@class='col-sm-5 col-sm-offset-4 alert alert-success']"),
			@FindBy(xpath="//div[@class='col-sm-5 col-sm-offset-4 alert alert-danger")
		})
		public WebElement responseMsgBox;
		
		//edit service 
		@FindBy(xpath="(//a[contains(@href,'updateCategory') and @class='btn btn-outline btn-info no-border'])[1]")
		public WebElement editCategoryBtn;
		
		//delete service 
		@FindBy(xpath="(//a[contains(@class,'delete_btn')])[1]")
		public WebElement deleteCategoryBtn;
		
		//confirm delete 
		@FindBy(xpath="//div[contains(@class,'bootbox-confirm')]//button[@data-bb-handler='confirm']")
		public WebElement confirmDeleteBtn;
		
				
		@FindBy(xpath="//input[@type='search']")
		public WebElement searchBox;
		
		@FindBy(xpath="//div[@class='box-body']//table//tr")
		public List<WebElement> tableCount;
		//public WebElement tableCount;
	
	
	
	
}
