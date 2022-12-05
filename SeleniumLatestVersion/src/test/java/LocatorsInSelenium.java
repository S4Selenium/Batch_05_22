import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		//Locator 1 ID
		driver.findElement(By.id("user-name")).click();
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//Lactor 2 xpath
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		//Locator 3 name
		driver.findElement(By.name("password")).click();
		//Lactor Css selector
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.className("bm-burger-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='react-burger-cross-btn']")).click();
		//Locator 4 Link text
		//driver.findElement(By.linkText("Facebook")).click();
		//Locator 5 PartialLink text
		driver.findElement(By.partialLinkText("Face")).click();
		//driver.close();
		
		

	}

}
