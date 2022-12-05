import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//WebDriverManager
			WebDriver driver =WebDriverManager.chromedriver().create();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			WebElement Ele = driver.findElement(By.id("login-button"));
			WebElement AccText=driver.findElement(By.xpath("(//h4)[1]"));
			System.out.println("Location Of Login btn Location--->"+Ele.getLocation());
			System.out.println("Location Of Login btn  Size--->"+Ele.getSize());
			System.out.println("Location Of Acc Text --->"+AccText.getCssValue("font-w"));
			
	}
}
