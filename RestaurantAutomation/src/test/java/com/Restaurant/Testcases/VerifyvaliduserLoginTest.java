package com.Restaurant.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.Restaurant.Action.ActionClass;
import com.Restaurant.BaseClass.BaseClass;
import com.Restaurant.PageObjects.LoginPage;
import com.Restaurant.Utilities.Log;

public class VerifyvaliduserLoginTest extends BaseClass {

	@Test
	public void VerifyUserLogin()
	{
		Log.startTestCase("VerifyUserLogin");
		Assert.assertTrue(Lp.IsLogoPresent(),"LoginPage Is not Loaded");
		Log.info("Going to execute Login Function");
		Lp.LoginFnt();
		Assert.assertTrue(false);
		//User Inavlid Scenarios (10 test cases)
		//DataProvider
		Log.endTestCase("VerifyUserLogin");
	}
}
