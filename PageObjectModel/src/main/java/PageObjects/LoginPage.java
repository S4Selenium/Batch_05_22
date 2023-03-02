package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
//Page Object Model Without Page Object Factory
	
	WebDriver driver;
	
	By Username = By.id("user-name");
	By Password = By.id("password");
	By LoginButton = By.id("login-button");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement Uname()
	{
	   return driver.findElement(Username);
	}
	public WebElement Pswd()
	{
	   return driver.findElement(Password);
	}
	public WebElement LoginBtn()
	{
	   return driver.findElement(LoginButton);
	}
}