import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClassInSelenium {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
			//WebDriverManager
		    WebDriver driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://testfile.org/all-pdf-sample-test-file-download-direct/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//h4[contains(text(),'10MB')]")).click();
			Robot rb = new Robot();
			Thread.sleep(5000);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_S);
			Thread.sleep(5000);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_S);
			rb.keyRelease(KeyEvent.VK_ENTER);
	}
}
