package com.ehrweb.testcases;

import org.testng.annotations.Test;

import com.ehrweb.pageobject.Loginpage;
import com.ehrweb.pageobject.Report_Expense_Page;

public class Tc_ReportExpense_005 extends Baseclass {
	
	@Test
	public void addLeaveForm() throws InterruptedException
	{
		
		Loginpage lp = new Loginpage(driver);
		lp.setUserName(username);
		lp.setpassword(password);
		lp.clickSubmit();
		
		Report_Expense_Page re=new Report_Expense_Page(driver);
		
		
		re.clickExpense();
		Logger.info("Expense module clicked");
		re.clickReportExpense();
		Logger.info("Report Expense module clicked");
		re.clickAddReportExpense();
		Logger.info("Add report Expense module clicked");
		re.sendSource();
		Logger.info("Sorce is entered");
		re.sendDestination();
		Logger.info("Destination is entered");
		re.clickRFromDate();
		Logger.info("From Date clicked");
		re.selectRFromDate();
		Logger.info("From Date is Selected");
		re.clickRToDate();
		Logger.info("To Date is Clicked");
		re.selectRTODate();
		Logger.info("To Date is Selected");
		re.selecteType();
		Logger.info("Expense Type is clicked");
		re.selecteTypeOption();
		Logger.info("Expense Type is Selected");
		re.selectType();
		Logger.info("Type of Transport is clicked");
		re.selectTypOption();
		Logger.info("Type of Transport is selected");
		re.clickAmount();
		Logger.info("Amount is Entered");
		re.uploadFile();
		Logger.info("File is Uploaded");
		re.addReport();
		Logger.info("Expense Report is Added Succesfully");
	}
		
	

}
