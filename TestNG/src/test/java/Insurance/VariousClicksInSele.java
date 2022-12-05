package Insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class VariousClicksInSele {

	@Test
	public void ClicksInSele() throws InterruptedException
	{
	 //Alert
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	/*
	 * driver.manage().window().maximize();
	 * driver.findElement(By.id("user-name")).click();
	 * driver.findElement(By.id("user-name")).sendKeys("standard_user");
	 * driver.findElement(By.id("password")).click();
	 * driver.findElement(By.id("password")).sendKeys("secret_sauce");
	 * driver.findElement(By.id("login-button")).click();
	 */
	WebElement RightClickButton = driver.findElement(By.cssSelector(".context-menu-one.btn.btn-neutral"));
	WebElement DoubClick = driver.findElement(By.tagName("button"));
	Thread.sleep(3000);
	Actions act = new Actions(driver);
	act.contextClick(RightClickButton).build().perform();
	act.doubleClick(DoubClick).perform();
	driver.switchTo().alert().accept();
	}
}
