package com.ehrweb.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ehrweb.pageobject.Apply_Leave_Page;
import com.ehrweb.pageobject.Loginpage;




public class Tc_AddLeave_003 extends Baseclass {
	
	
	
	
	  
	
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
		
		
		
		Apply_Leave_Page apl=new Apply_Leave_Page(driver);
		
		

		apl.clickLeaveManagement();
		Logger.info("Leave Management Module is clicked");
		apl.clickLeaveForm();
		Logger.info("apply leave module is clicked");
		apl.clickAddLeave();
		Logger.info("Add Leave button is clicked");
		 apl.clickLeaveType();
		 Logger.info("Leave Type Drop down is clicked");
		 apl.clickLeaveTypeselect();
		 Logger.info("Leave type selected");
		apl.clickFromDate();
		Logger.info("From Date is clicked");
		apl.selectFromDate();
		Logger.info("From Date is selected");
		apl.clickToDate();
		Logger.info("To Date is clicked");
		apl.selectToDate();
		Logger.info("To Date is Selected");
		apl.clickStartTime();
		Logger.info("click on Start Time");
		apl.selectStartTimehour();
		Logger.info("hour is selected");
		apl.selectStartTimeMinute();
		Logger.info("Minute is selected ");
		apl.selectStartTimeAm();
		Logger.info("Am or Pm is selected");
		apl.selectStartTimeOk();
		Logger.info("Start time is set");
		apl.clickEndTime();
		Logger.info("End time is clicked");
		apl.selectEndTimehour();
		Logger.info("End time hour is selected");
		apl.selectEndTimeMinute();
		Logger.info("End time minute is selected");
		apl.selectEndTimeAm();
		Logger.info("Am or Pm is selected");
		apl.selectEndTimeOk();
		Logger.info("End time is set");
		apl.sendContactDetails(contact);
		Logger.info("Contact details are added");
		apl.clickCcTo();
		Logger.info("cc to drop down clicked");
		apl.selectCcTo();
		Logger.info("CC to is selected");
		Thread.sleep(3000);
		apl.addComments(comments);
		Logger.info("Comments are Added");
		Thread.sleep(3000);
		apl.clickLeaveSubmit();
		Logger.info("Leave application Submitted");
		
		 WebElement a =driver.findElement(By.xpath("//div[@class=\"swal2-popup swal2-modal swal2-show\"]"));
		    System.out.println(a.getText());
		
		
		
	}
	
	
	
	
}
