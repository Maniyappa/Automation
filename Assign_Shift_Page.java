package com.ehrweb.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assign_Shift_Page {
	WebDriver ldriver;
	public Assign_Shift_Page(WebDriver rdiver){
		ldriver=rdiver;
		PageFactory.initElements(rdiver, this);
	}
	
	
	@FindBy(id="mySidebar")
	@CacheLookup
	WebElement sidebar;
	
	@FindBy(id="myBtn")
	@CacheLookup
	WebElement more;
	
	
	
	@FindBy(xpath="//a[@href='#ShiftMaster']")
	@CacheLookup
	WebElement btnShiftMaster;
	
	@FindBy(xpath="//a[@href='view_assignshift.php']")
	@CacheLookup
	WebElement moduleAssignshift;
	
	@FindBy(xpath="//button[contains(.,'Assign Shift')]")
	@CacheLookup
	WebElement btnAssignshift;
	
	@FindBy(xpath="//button[contains(.,'Select Employee ID')]")
	@CacheLookup
	WebElement selectemployeeid;
	
	@FindBy(xpath="(//span[contains(.,'669933')]")
	@CacheLookup
	WebElement selectemployeeid669933;
	
	@FindBy(xpath="//button[@data-id=\"assignshift_name\"]")
	@CacheLookup
	WebElement selectshiftName;
	
	@FindBy(xpath="(//span[contains(.,'Morning Shift')])[2]")
	@CacheLookup
	WebElement selectshiftNameMrngshift;
	
	
	@FindBy(xpath="//input[@id='assignfrom_date']")
	@CacheLookup
	WebElement selectAsssignmentStartDate;
	
	@FindBy(xpath="//a[contains(.,'27')]")
	@CacheLookup
	WebElement selectAsssignmentStartDate27;
	
	@FindBy(xpath="//input[@id='assignto_date']")
	@CacheLookup
	WebElement selectAsssignmentenddate;
	
	@FindBy(xpath="(//a[contains(.,'28')])[2]")
	@CacheLookup
	WebElement selectAsssignmentenddate28;
	
	
	@FindBy(xpath="//button[@data-id='shift_assign_status']")
	@CacheLookup
	WebElement selectstatusdropdown;
	
	
	
	@FindBy(xpath="(//span[contains(.,'Active')])[2]")
	@CacheLookup
	WebElement selectstatusactive;
	
	
	@FindBy(xpath="(//button[contains(.,'Submit')])[1]")
	@CacheLookup
	WebElement btnsubmit;
	
	public void clickSidebar()
	{
		sidebar.click();
	}
	
	public void clickMore()
	{
		more.click();
	}
	
	public void clickShiftmaster()
	{
		btnShiftMaster.click();
	}
	
	public void clickAssignShift()
	{
		moduleAssignshift.click();
	}
	
	public void clickAssignShiftbtn()
	{
		btnAssignshift.click();
	}
	
	public void selectemployeeIdropdown()
	{
		selectemployeeid.click();
	}
	
	public void selectemployee()
	{
		selectemployeeid669933.click();
	}
	
	public void selectShiftNamedropdown()
	{
		selectshiftName.click();
	}
	
	public void selectShiftName()
	{
		selectshiftNameMrngshift.click();
	}
	
	public void selectAssignmentstartDate()
	{
		selectAsssignmentStartDate.click();
	}
	
	
	public void selectAssignmentStartDateas27()
	{
		selectAsssignmentStartDate27.click();
	}
	
	public void selectAssignmentEnddate()
	{
		selectAsssignmentenddate.click();
	}
	
	public void selectAssignmentEnddateas28()
	{
		selectAsssignmentenddate28.click();
	}
	
	public void selectStatus()
	{
		selectstatusdropdown.click();
	}
	
	public void selectStatusasActive()
	{
		selectstatusactive.click();
	}
	
	public void clickSubmit()
	{
		btnsubmit.click();
	}
	


}
