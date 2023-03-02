package Swaglabs;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import PageObjects.HomePage;
import PageObjects.LoginPage;

public class VerifyUserLoginTest {
	@Test
	public void UserLoginToSwagLabs() throws InterruptedException
	{	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	LoginPage Lp = new LoginPage(driver);
	Lp.Uname().click();
	Lp.Uname().sendKeys("standard_user");
	Lp.Pswd().click();
	Lp.Pswd().sendKeys("secret_sauce");
	Lp.LoginBtn().click();
	//Thread.sleep(3000);
	HomePage Hp = new HomePage(driver);
	Hp.YourCart().click();
	
	}

}
