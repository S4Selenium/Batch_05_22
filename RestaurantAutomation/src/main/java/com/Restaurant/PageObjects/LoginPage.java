package com.Restaurant.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Restaurant.BaseClass.BaseClass;

public class LoginPage extends BaseClass{
//PageObjectModelWithPageObjectFactory
	@FindBy(css = "input[name='username']")
	WebElement Username;

	@FindBy(css = "input[name='password']")
	WebElement Password;

	@FindBy(css = "input[name='submit']")
	WebElement LoginButton;

	@FindBy(css = "img[alt='logo']")
	WebElement Logo;

	public LoginPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(getDriver(), this);
	}

	public WebElement DispLogo() {
		return Logo;
	}

	public WebElement Uname() {
		return Username;
	}

	public WebElement passwrd() {
		return Password;
	}

	public WebElement LoginBtn() {
		return LoginButton;
	}

	// Method to check whether the Login page is loaded
	// If present will get True else will get False
	public Boolean IsLogoPresent() {
		//return DispLogo().isDisplayed();
		return action.isDisplayed(getDriver(), Logo);
	}
	
	public void LoginFnt()
	{
		action.type(Username,prop.getProperty("Username"));
		action.type(Password,prop.getProperty("Password"));
		action.click1(LoginButton,"Clicking On Login Button");
	}

}
