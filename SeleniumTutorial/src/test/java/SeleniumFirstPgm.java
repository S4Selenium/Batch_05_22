import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFirstPgm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Why they are keeping webdriver as an interface
		  System.setProperty("webdriver.chrome.driver","D:\\skillup\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		  driver.manage().window().maximize();
		//WebDriverManager
		//WebDriver driver =WebDriverManager.chromedriver().create();
		//diff b/w driver.get and driver.navigate.to
		//driver.get("https://www.saucedemo.com/");
		String Title=driver.getTitle();
		System.out.println("This is the page Title--"+Title);
		String URL = driver.getCurrentUrl();
		System.out.println("This is the page URL--"+URL);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().forward();
		//driver.resetInputState();
		//driver.navigate().forward();
		//driver.navigate().to("https://www.saucedemo.com/");
		//driver.close();
		//driver.quit();
		//What is the diff b/w driver.close() and driver.quit()
		
		
		
	}

}
