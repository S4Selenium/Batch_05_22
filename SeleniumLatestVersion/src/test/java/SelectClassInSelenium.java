import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();
		WebElement Staticdrop = driver.findElement(By.id("single-input-field"));
		Select sele = new Select(Staticdrop);
	    sele.selectByIndex(2);
	    Thread.sleep(2000);
		//sele.selectByValue("Red");
		//Thread.sleep(2000);
		//sele.selectByVisibleText("Green");
		sele.deselectByIndex(2);
		//driver.close();
	}

}
