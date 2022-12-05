package Insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MousehoverInSelenium {
	
	@Test
	public void ActionClassMousehover() throws InterruptedException
	{
	   
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	WebElement closebutton = driver.findElement(By.xpath("//button[@Class='_2KpZ6l _2doB4z']"));
	try {
		closebutton.click();
	}
	catch(Exception e)
	{
		closebutton.click();
	}
	WebElement ele = driver.findElement(By.xpath("//img[@alt='Electronics']"));
	Actions act = new Actions(driver);
	act.moveToElement(ele).perform();
	Thread.sleep(3000);
	WebElement elesound = driver.findElement(By.linkText("Soundbars"));
	act.moveToElement(elesound).click().perform();
	driver.navigate().back();
	//Insprint Automation----->manual check----->
	//Smoke suite we are always adding API test cases
	//Dev---->QA----->UAT----->Stage(PreProd)---->Prod
	//Story--->dev(Smoke)---->QA AutoRegression--->maintenance----Code QA(Also cherry pick this in term)---->UAT------>Stage
	//Regression----->API---->folder(55API)
	//Regression------->UI---->300(UI)
	//Backlog---->stable--->
	}
}
