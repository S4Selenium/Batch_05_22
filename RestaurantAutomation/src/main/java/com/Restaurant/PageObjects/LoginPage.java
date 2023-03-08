package com.Restaurant.PageObjects;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Restaurant.BaseClass.BaseClass;
import com.Restaurant.Utilities.ExcelRead;

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
	
	public void LoginFnt() throws Exception
	
	{
		ExcelRead data = new ExcelRead();
		ArrayList exceldata = data.getData("Login");
		action.type(Username,(String) exceldata.get(0));
		action.type(Password,(String) exceldata.get(1));
		action.click1(LoginButton,"Clicking On Login Button");
	}

}
