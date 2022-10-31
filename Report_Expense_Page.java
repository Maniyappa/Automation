package com.ehrweb.pageobject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Report_Expense_Page {
	WebDriver ldriver;
	public Report_Expense_Page(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using="//a[@href='#Expense']")
	@CacheLookup
	WebElement btnexpense;
	
	@FindBy(how = How.XPATH, using="//a[@href=\"viewreportexpense.php\"]")
	@CacheLookup
	WebElement btnreportexpense;
	
	//@FindBy(how=How.XPATH,using="//button[@id=\"reportexpense\"]")
	@CacheLookup
	WebElement btnaddexpensereport;
	
	//@FindBy(how=How.ID,using="trip_source")
	@CacheLookup
	WebElement textfieldsource;
	
	@FindBy(how=How.XPATH,using="(//input[@name=\"trip_destination\"])[1]")
	@CacheLookup
	WebElement textfielddestination;
	
	@FindBy(how=How.XPATH,using="(//input[@class='form-control hasDatepicker'])[1]")
	@CacheLookup
	WebElement txtrfromdate;
	
	@FindBy(how=How.XPATH,using="//a[contains(.,'20')]")
	@CacheLookup
	WebElement selectrfromdate;
	
	@FindBy(how=How.XPATH,using="(//input[@name='date1'])[1]")
	@CacheLookup
	WebElement txtrtodate;
	
	@FindBy(how=How.XPATH,using="//a[contains(.,'20')]")
	@CacheLookup
	WebElement selectrtodate;
	
	@FindBy(how=How.XPATH,using="//span[contains(.,\"Select Type\")]")
	@CacheLookup
	WebElement selectetype;
	
	@FindBy(how=How.XPATH,using="(//span[contains(.,\"Sales\")])[1]")
	@CacheLookup
	WebElement selectetypeoption;
	
	
	@FindBy(how=How.XPATH,using="(//span[@class='filter-option pull-left'])[3]")
	@CacheLookup
	WebElement selecttype;
	
	@FindBy(how=How.XPATH,using="(//span[contains(.,\"Bus\")])[2]")
	@CacheLookup
	WebElement selecttypeoption;
	
	@FindBy(how=How.XPATH,using="//input[@name=\"amount[]\"]")
	@CacheLookup
	WebElement txtamount;
	
	@FindBy(how=How.ID,using="uploadFile")
	@CacheLookup
	WebElement btnattach;
	
	@FindBy(how=How.XPATH,using="//button[@name=\"expense_add\"]")
	@CacheLookup
	WebElement btnaddreport;
	
	
	
	public void clickExpense()
	{
		btnexpense.click();
	}
	
	public void clickReportExpense()
	{
		btnreportexpense.click();
	}
	
	public void clickAddReportExpense()
	{
		
		 WebDriverWait webdwait = new WebDriverWait(ldriver, Duration.ofSeconds(50));
			
			webdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='reportexpense']"))).click();
		//btnaddexpensereport.click();
	}
	
	public void sendSource()
	{
		 WebDriverWait webdwait = new WebDriverWait(ldriver, Duration.ofSeconds(50));
			
			webdwait.until(ExpectedConditions.elementToBeClickable(By.id("trip_source"))).sendKeys("coventry");
		
		
		//textfieldsource.sendKeys(source);
	}
	
	public void sendDestination()
	{
		textfielddestination.sendKeys("canada");
	}
	
	public void clickRFromDate()
	{
		txtrfromdate.click();
	}
	
	public void selectRFromDate()
	{
		selectrfromdate.click();
	}
	
	
	public void clickRToDate()
	{
		txtrtodate.click();
	}
	
	public void selectRTODate()
	{
		selectrtodate.click();
	}
	
	public void selecteType()
	{
		selectetype.click();
	}
	
	public void selecteTypeOption()
	{
		selectetypeoption.click();
	}
	
	public void selectType()
	{
		selecttype.click();
	}
	
	public void selectTypOption()
	{
		selecttypeoption.click();
	}
	
	public void clickAmount()
	{
		txtamount.sendKeys("5000");
	}
	
	public void uploadFile()
	{
		btnattach.sendKeys("C:\\Windows\\System32\\cmd.exe");
	}
	
	public void addReport()
	{
		btnaddreport.click();
	}
	

}
