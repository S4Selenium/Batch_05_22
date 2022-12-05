package Insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class DragAndDropSelenium {
	@Test
	public void DragAndDropInSele() throws InterruptedException
	{
	 //Alert
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	
	WebElement DragAmount = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
	WebElement DropPlace = driver.findElement(By.id("amt7"));
	Actions act = new Actions(driver);
	act.dragAndDrop(DragAmount, DropPlace).perform();
	
	}
}
