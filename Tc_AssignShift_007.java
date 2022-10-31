package com.ehrweb.testcases;

import org.testng.annotations.Test;

import com.ehrweb.pageobject.Assign_Shift_Page;
import com.ehrweb.pageobject.Loginpage;

public class Tc_AssignShift_007 extends Baseclass {

	
	
	

	@Test
	public void addLeaveForm() throws InterruptedException
	{
		
		Loginpage lp = new Loginpage(driver);
		lp.setUserName(username);
		Logger.info("user name is entered");
		lp.setpassword(password);
		Logger.info("password is entered");
		lp.clickSubmit();
		Logger.info("Successfuly logedin");
		
		Assign_Shift_Page A=new Assign_Shift_Page(driver);
		
		
		A.clickSidebar();
		A.clickMore();
		A.clickShiftmaster();		
		A.clickAssignShift();
		A.clickAssignShiftbtn();
		A.selectemployeeIdropdown();
		A.selectemployee();
		A.selectShiftNamedropdown();
		A.selectShiftName();
		A.selectAssignmentstartDate();
		A.selectAssignmentStartDateas27();
		A.selectAssignmentEnddate();
		A.selectAssignmentEnddateas28();
		A.selectStatus();
		A.selectStatusasActive();
		A.clickSubmit();
		
	}
				
				
				
				
}
