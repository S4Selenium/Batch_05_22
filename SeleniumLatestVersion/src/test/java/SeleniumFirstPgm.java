import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class SeleniumFirstPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		//Using Selenium Manager
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.close();		
	}

}
