package Insurance;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeInsuranceTest {
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("I am going to run before the Test Cases");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("*************"+"I am going to run before Each Test Method");
	}
	
	
	@Test(groups= {"SMK"})
	public void MobileLoginForH()
	{
		System.out.println("Home Insurance Mobile Login");
	}
	@Test
	public void MobileLogOutForH()
	{
		System.out.println("Home Insurance Mobile Logout");
	}
	
	
	@Test(groups= {"SMK"})
	public void WebLoginForH()
	{
		System.out.println("Home Insurance Web Login");
	}
	@Test()
	public void WebLogOutForH()
	{
		System.out.println("Home Insurance Web Logout");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("-----------"+"I am going to run after Each Test Method");
	}
	
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("I am going to run after the Test Cases got executed");
	}
	

}
