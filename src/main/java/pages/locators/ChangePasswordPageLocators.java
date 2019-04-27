package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordPageLocators {

	@FindBy(name="oldpassword")
	public WebElement oldpassword;
	@FindBy(name="newpassword")
	public WebElement newpassword;
	@FindBy(name="confirmpassword")
	public WebElement confirmpassword;
	@FindBy(name="sub")
	public WebElement submitBtn;
	

}


