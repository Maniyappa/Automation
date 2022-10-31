package com.ehrweb.testcases;

import org.testng.annotations.Test;

import com.ehrweb.pageobject.Loginpage;
import com.ehrweb.pageobject.Regration_Page;

public class Tc_Regration extends Baseclass {
	
	@Test
	public void regrationTest()
	{
		Loginpage lp = new Loginpage(driver);
		lp.setUserName(username);
		Logger.info("user name is entered");
		lp.setpassword(password);
		Logger.info("password is entered");
		lp.clickSubmit();
		Logger.info("Successfuly logedin");
		
		
		Regration_Page rs = new Regration_Page(driver);
		
		
		
		rs.clickOrganazationDesign();
		rs.clickRecruitment();
	//	rs.clickCompetencemanagement();
//		rs.clickOnboarding();
//		rs.clickOnboarding();
		rs.clickExitmanagement();
		rs.clickExitmanagement();
		rs.clickLeavemanagement();
		rs.clickLeavemanagement();
//		rs.clickBenefitsandpayroll();
//		rs.clickBenefitsandpayroll();
		rs.clickCommunications();
		rs.clickCommunications();
		rs.clickTimeTracking();
		rs.clickTimeTracking();
		rs.clickExpense();
		rs.clickExpense();
		rs.clickAdmin();
		rs.clickAdmin();
		rs.clickPerformanceManagement();
		rs.clickDocumentation();
		rs.clickOffboarding();
		rs.clickJobclocking();
		rs.clickShiftMaster();
		rs.clickReport();
		rs.clickReport();
		rs.clickHrims();
		rs.clickDailyAttendance();
		rs.clickLeaveUpdate();
		rs.clickVistorManagement();
		rs.clickAttendance();
		rs.clickTarget();
		rs.clickSpeakup();
		rs.clickExpenseNew();
		
	}
	

}
