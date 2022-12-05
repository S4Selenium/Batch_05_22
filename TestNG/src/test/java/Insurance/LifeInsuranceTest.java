package Insurance;

import org.testng.annotations.Test;

public class LifeInsuranceTest {

	@Test(groups= {"SMK"},priority=1)
	public void MobileLoginForL()
	{
		System.out.println("Life Insurance Mobile Login");
	}
	@Test(priority=2)
	public void MobileLogOutForL()
	{
		System.out.println("Life Insurance Mobile Logout");
	}
	@Test(groups= {"SMK"},enabled=false,priority=3)
	public void WebLoginForL()
	{
		System.out.println("Life Insurance Web Login");
	}
	@Test(dependsOnMethods= {"WebLoginForL"},priority=4)
	public void WebLogOutForL()
	{
		System.out.println("Life Insurance Web Logout");
	}
}
