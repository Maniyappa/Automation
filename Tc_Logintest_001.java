package com.ehrweb.testcases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;


import com.ehrweb.pageobject.Loginpage;



public class Tc_Logintest_001 extends Baseclass {
	@Test
	public void loginTest() throws IOException
	{
		
		
		Loginpage lp = new Loginpage(driver);
		lp.setUserName(username);
		Logger.info("username is Entered");
		lp.setpassword(password);
		Logger.info("Password is Entered");
		lp.clickSubmit();
		Logger.info("Login button clicked");
		
		
		if (driver.getTitle().equals("e - HR"))
		{
			Assert.assertTrue(true);
			Logger.info("Login Passed");
		}
		else
		{
			captureScreen( driver, "Tc_Logintest_001");
			Assert.assertTrue(false);
			Logger.info("Login Failed");
		}
}}
