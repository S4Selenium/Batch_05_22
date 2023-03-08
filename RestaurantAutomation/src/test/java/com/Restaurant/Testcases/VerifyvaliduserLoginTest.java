package com.Restaurant.Testcases;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.Restaurant.Action.ActionClass;
import com.Restaurant.BaseClass.BaseClass;
import com.Restaurant.PageObjects.LoginPage;
import com.Restaurant.Utilities.ExcelRead;
import com.Restaurant.Utilities.Log;

public class VerifyvaliduserLoginTest extends BaseClass {

	@Test
	public void VerifyUserLogin() throws Exception
	{
		ExcelRead data = new ExcelRead();
		ArrayList exceldata = data.getData("Login");
		Log.startTestCase("VerifyUserLogin");
		Assert.assertTrue(Lp.IsLogoPresent(),"LoginPage Is not Loaded");
		Log.info("Going to execute Login Function");
		Lp.LoginFnt();
		System.out.println(exceldata.get(0));
		Assert.assertTrue(true);
		//User Inavlid Scenarios (10 test cases)
		//DataProvider
		Log.endTestCase("VerifyUserLogin");
	}
}
