package Insurance;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DogInsuranceTest {

	@Test(priority=5,groups= {"SMK"})
	public void MobileLoginForD()
	{
		System.out.println("Dog Insurance Mobile Login");
		//Assert.assertEquals(false, true);
		
	}
	@Test(priority=1)
	public void MobileLogOutForD()
	{
		System.out.println("Dog Insurance Mobile Logout");
	}
	@Test(priority=2,groups= {"SMK"})
	public void WebLoginForD()
	{
		System.out.println("Dog Insurance Web Login");
	}
	@Test(priority=0)
	public void WebLogOutForD()
	{
		System.out.println("Dog Insurance Web Logout");
	}
}
