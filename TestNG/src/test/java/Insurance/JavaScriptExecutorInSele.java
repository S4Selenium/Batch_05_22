package Insurance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class JavaScriptExecutorInSele {
	@Test
	public void DragAndDropInSele() throws InterruptedException
	{
	 //Alert
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://login.yahoo.com");
	driver.manage().window().maximize();
	WebElement Ele = driver.findElement(By.id("persistent"));
	JavascriptExecutor Js =(JavascriptExecutor)driver;
	Js.executeScript("arguments[0].click();",Ele);
	driver.close();
	}
	
	//Waits
	//Thread.sleep(3000)--------->Red(120 mins)
	//Implicit wait(10secs)------>elemnt elemnt elemtn-----Run
	//ExplixitWait(20secs)------>especially for this (condition for a particular element)
}
