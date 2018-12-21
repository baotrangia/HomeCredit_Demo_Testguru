package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {

	@FindBy(name="uid")
	public WebElement UserID;
	@FindBy(name="password")
	public WebElement Password;
	@FindBy(name="btnLogin")
	public WebElement btnLogin;
	@FindBy(xpath="//table//tr[@class='heading3']/td[contains(text(),'Manger Id')]")
	public WebElement welcomeTxt;

}


