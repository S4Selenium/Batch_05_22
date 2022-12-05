package Insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertInSelenium {
	@Test
	public void AlertInSele() throws InterruptedException
	{
	 //Alert
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
	//Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.findElement(By.id("runbtn")).click();
	//IFRAME(Switching inside iframe)
	driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
	//driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	//Thread.sleep(3000);
	//Since the below element is outside Iframe we need to switch back
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
	//going inside iframe trying the alert and accepting it
	driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
	driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	driver.switchTo().alert().accept();
	}
}
