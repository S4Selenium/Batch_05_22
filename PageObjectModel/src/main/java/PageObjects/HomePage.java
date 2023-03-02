package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
//Page Object Model with Page Object Factory
	WebDriver driver;
	
	@FindBy(id="shopping_cart_container")
	WebElement Cart;
	
	@FindBy(xpath="//li[@class='social_facebook']")
	WebElement FaceBook;
	
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public WebElement YourCart()
	{
		return Cart;
	}
	public WebElement FaceBookClick()
	{
		return FaceBook;
	}
}
