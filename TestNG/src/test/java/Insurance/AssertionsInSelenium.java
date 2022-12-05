package Insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsInSelenium {
	
	@Test
	public void VerifySwagLabsLoginForValidUser() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement Logo = driver.findElement(By.xpath("//div[@class='login_logo']"));
		//Assertions (HardAssert and SoftAssert)
		//Diff b/w Hard Assert and SoftAssert
		//Hard Assert
		//Assert.assertEquals(true, true);
		//Assert.assertEquals(false, true);
		Assert.assertTrue(Logo.isDisplayed());
		//Assert.assertEquals(true, Logo.isDisplayed());
		WebElement Username = driver.findElement(By.id("user-name"));
		WebElement Password= driver.findElement(By.name("password"));
		WebElement LoginButton = driver.findElement(By.id("login-button"));
		Assert.assertTrue(Username.isDisplayed(),"Username Textfield is not Displayed");
		Username.click();
		Username.sendKeys("standard_user");
		Assert.assertTrue(Password.isDisplayed(),"Password Textfield is not Displayed");
		Password.click();
		Password.sendKeys("secret_sauce");
		Assert.assertTrue(LoginButton.isDisplayed(), "Login Button is not Displayed");
		LoginButton.click();
		Thread.sleep(3000);
	
		
		//Soft Assert
		SoftAssert Sassert = new SoftAssert();
		Sassert.assertEquals(false, true, "Failed in soft Assert Step But will execute below lines");
		System.out.println("I m getting executed After Softer Assert");
		System.out.println("I m getting executed After Softer Assert");
		System.out.println("I m getting executed After Softer Assert");
		System.out.println("I m getting executed After Softer Assert");
		Sassert.assertAll();
		
		
		
	}
	

}
