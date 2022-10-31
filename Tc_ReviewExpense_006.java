package com.ehrweb.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.ehrweb.pageobject.Loginpage;
import com.ehrweb.pageobject.Review_Expense_Page;

public class Tc_ReviewExpense_006 extends Baseclass {
	
	@Test
	public void addLeaveForm() throws InterruptedException
	{
		
		Loginpage lp = new Loginpage(driver);
		lp.setUserName(username2);
		lp.setpassword(password);
		lp.clickSubmit();
	
		Review_Expense_Page rve=new Review_Expense_Page(driver);
		
		rve.clickEExpense();
		Logger.info("Expense module clicked");
		rve.clickReviewExpense();
		Logger.info("Review Expense module clicked");
	//	rve.searchExpense();
		Logger.info("Search field clicked");
		rve.clickEmployeeid();
		Logger.info("Employee id is serached");
		
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
	        jse.executeScript("window.scrollBy(0,500)");
		
		
		rve.clickApprovername();
		Logger.info("Approver name is clicked");
		rve.selectApprover();
		Logger.info("Approver Name is selected");
		
		
		
		rve.clickDate();
		Logger.info("Date is clicked");
		rve.selectDate();
		Logger.info("Date is selected");
		rve.clickStatus();
		Logger.info("Status dropdown is clicked");
		rve.selectStatus();
		Logger.info("Dropdown is Selected");
		rve.clickSubmit();
		Logger.info("Review details are submitted");
	}
	
}
