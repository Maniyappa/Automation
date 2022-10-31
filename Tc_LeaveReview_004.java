package com.ehrweb.testcases;

import org.testng.annotations.Test;

import com.ehrweb.pageobject.Leave_Review_Page;
import com.ehrweb.pageobject.Loginpage;

public class Tc_LeaveReview_004 extends Baseclass {
	
	
	@Test
	public void addLeaveForm() throws InterruptedException
	{
		
		Loginpage lp = new Loginpage(driver);
		lp.setUserName(username1);
		Logger.info("user name is entered");
		lp.setpassword(password);
		Logger.info("password is entered");
		lp.clickSubmit();
		Logger.info("Successfuly logedin");
	
		Leave_Review_Page lr=new Leave_Review_Page(driver);
		
		lr.clickLeaveManagement();
		Logger.info("Leave Management Module is clicked");
		lr.clickLeaveReview();
		Logger.info("Leave Review Module is clicked");
		lr.clickCheckbox();
		Logger.info("Check box is clicked");
		lr.clickLeavereviewApprove();
		Logger.info("Leave is Approved Succesfully " );
	
	
	}
	
	
	
	
	
	
	

}
