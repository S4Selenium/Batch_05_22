import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdownsInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[1]")).click();
		//We are storing dynamic drop down values in the list
		List<WebElement> DropValues = driver.findElements(By.xpath("//li[@role='option']"));
		     //Itherating through the web elements using for each loop
		
		for(WebElement opt:DropValues)
		{
			System.out.println("WebElement is "+opt+"!!!!!This is the value of WE    "+opt.getText());
			if(opt.getText().equalsIgnoreCase("illinois"))
			{
				opt.click();
			}
		}
	}

}
