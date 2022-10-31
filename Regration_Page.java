package com.ehrweb.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Regration_Page {
	WebDriver ldriver;
	public Regration_Page(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(how = How.XPATH, using="//a[@href=\"#OrganizationDesign\"]")
	@CacheLookup
	WebElement moduleOrganizationDesign;
	
	@FindBy(how = How.XPATH, using="//a[@href=\"#Recruitment\"]")
	@CacheLookup
	WebElement moduleRecruitment;
	
	@FindBy(how = How.XPATH, using="//a[@href=\"#CompetenceMgmt\"]")
	@CacheLookup
	WebElement moduleCompetencemgmnt;
	
	@FindBy(how = How.XPATH, using="//a[@href=\"viewonboarding.php\"]")
	@CacheLookup
	WebElement moduleOnboarding;
	
	@FindBy(how = How.XPATH, using="//a[@href=\"#ExitManagement\"]")
	@CacheLookup
	WebElement moduleExitmanagement;
	
	@FindBy(how = How.XPATH, using="//a[@href=\"#LeaveManagement\"]")
	@CacheLookup
	WebElement moduleLeavemanagement;
	
	@FindBy(how = How.XPATH, using="//a[@href=\"#benefitsandpayrol\"]")
	@CacheLookup
	WebElement moduleBenefitsandpayroll;
	
	@FindBy(how = How.XPATH, using="//a[@href=\"#Communications\"]")
	@CacheLookup
	WebElement moduleCommunication;
	
	@FindBy(how = How.XPATH, using="//a[@href=\"#TimeTracking\"]")
	@CacheLookup
	WebElement moduleTimeTracking;
	
	@FindBy(how = How.XPATH, using="//a[@href=\"#Expense\"]")
	@CacheLookup
	WebElement moduleExpense;
	
	@FindBy(how = How.XPATH, using="//a[@href=\"#Admin\"]")
	@CacheLookup
	WebElement moduleAdmin;
	
	@FindBy(how = How.XPATH, using="//a[@href=\"#PerformanceMgmt\"]")
	@CacheLookup
	WebElement modulePerformancemanagement;
	
	@FindBy(how = How.XPATH, using="//a[@href=\"#Documentation\"]")
	@CacheLookup
	WebElement moduleDocumentaion;
	
	@FindBy(how = How.XPATH, using="//a[@href=\"viewoffboarding.php\"]")
	@CacheLookup
	WebElement moduleOffboarding;
	
	@FindBy(how = How.XPATH, using="//a[@href=\"#JobClocking\"]")
	@CacheLookup
	WebElement moduleJobclocking;
	
	@FindBy(how = How.XPATH, using="//a[@href=\"#ShiftMaster\"]")
	@CacheLookup
	WebElement moduleShiftMaster;
	
	@FindBy(how = How.XPATH, using="//a[@href=\"#Report\"]")
	@CacheLookup
	WebElement moduleReport;
	
	@FindBy(how = How.XPATH, using="//a[@href=\"#HRIMS\"]")
	@CacheLookup
	WebElement moduleHrims;
	
	@FindBy(how = How.XPATH, using="//a[@href=\"attendanceupdatecrone.php\"]")
	@CacheLookup
	WebElement moduleDailyattendance;
	
	@FindBy(how = How.XPATH, using="//a[@href=\"leave_cron.php\"]")
	@CacheLookup
	WebElement moduleLeaveupdate;
	
	@FindBy(how = How.XPATH, using="//a[@href=\"visitor_management.php\"]")
	@CacheLookup
	WebElement moduleVistormanagement;
	
	@FindBy(how = How.XPATH, using="//a[@href=\"#Attendance\"]")
	@CacheLookup
	WebElement moduleAttendance;
	
	@FindBy(how = How.XPATH, using="//a[@href=\"view_target.php\"]")
	@CacheLookup
	WebElement moduleTarget;
	
	@FindBy(how = How.XPATH, using="//a[@href=\"#SpeakUp\"]")
	@CacheLookup
	WebElement moduleSpeakup;
	
	@FindBy(how = How.XPATH, using="//a[@href=\"#ExpenseNew\"]")
	@CacheLookup
	WebElement moduleExpensenew;
	
	public void clickOrganazationDesign()
	{
		moduleOrganizationDesign.click();
	}
	
	
	public void clickRecruitment()
	{
		moduleRecruitment.click();
	}
	
	public void clickCompetencemanagement()
	{
		moduleCompetencemgmnt.click();
	}
	
	public void clickOnboarding()
	{
		moduleOnboarding.click();
	}
	
	public void clickExitmanagement()
	{
		moduleExitmanagement.click();
	}
	
	public void clickLeavemanagement()
	{
		moduleLeavemanagement.click();
	}
	
	public void clickBenefitsandpayroll()
	{
		moduleBenefitsandpayroll.click();
	}
	
	public void clickCommunications()
	{
		moduleCommunication.click();
	}
	
	public void clickTimeTracking()
	{
		moduleTimeTracking.click();
	}
	
	public void clickExpense()
	{
		moduleExpense.click();
	}
	
	public void clickAdmin()
	{
		moduleAdmin.click();
	}
	
	public void clickPerformanceManagement()
	{
		modulePerformancemanagement.click();
	}
	
	public void clickDocumentation()
	{
		moduleDocumentaion.click();
	}
	
	public void clickOffboarding()
	{
		moduleOffboarding.click();
	}
	
	public void clickJobclocking()
	{
		moduleJobclocking.click();
	}
	
	public void clickShiftMaster()
	{
		moduleShiftMaster.click();
	}
	
	public void clickReport()
	{
		moduleReport.click();
	}
	
	public void clickHrims()
	{
		moduleHrims.click();
	}
	
	public void clickDailyAttendance()
	{
		moduleDailyattendance.click();
	}
	
	public void clickLeaveUpdate()
	{
		moduleLeaveupdate.click();
	}
	
	public void clickVistorManagement()
	{
		moduleVistormanagement.click();
	}
	
	public void clickAttendance()
	{
		moduleAttendance.click();
	}
	
	public void clickTarget()
	{
		moduleTarget.click();
	}
	
	public void clickSpeakup()
	{
		moduleSpeakup.click();
	}
	
	public void clickExpenseNew()
	{
		moduleExpensenew.click();
	}

}
