package com.ehrweb.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Leave_Review_Page {
	WebDriver ldriver;
	public Leave_Review_Page(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	
	}
	
	@FindBy(how = How.XPATH, using="//a[@href='#LeaveManagement']")
	@CacheLookup
	WebElement btnleaveapply;
	
	@FindBy(how = How.XPATH, using="//a[@href='viewleavereview.php']")
	@CacheLookup
	WebElement btnleavereview;
	
	 @FindBy(how = How.XPATH, using="(//input[@type='checkbox'])[2]")
	@CacheLookup
	WebElement btncheckbox;
	
	
	 @FindBy(how = How.XPATH, using="(//button[@id='review_approve'])[1]")
		@CacheLookup
		WebElement btncleaveapprove;
	
	 
	 public void clickLeaveManagement()
		{
			btnleaveapply.click();
		}
	 
		public void clickLeaveReview()
		{
			btnleavereview.click();
		}
	 
	 
	 
		public void clickCheckbox()
		{
			btncheckbox.click();
		}
	 
	 
		public void clickLeavereviewApprove()
		{
			btncleaveapprove.click();
		}
	 

}
