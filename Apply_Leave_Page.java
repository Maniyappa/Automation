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

public class Apply_Leave_Page {
	WebDriver ldriver;
	public Apply_Leave_Page(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	
	}
	
	@FindBy(how = How.XPATH, using="//a[@href='#LeaveManagement']")
	@CacheLookup
	WebElement btnleaveapply;
	
	@FindBy(how = How.XPATH, using="//a[@href='viewleave.php']")
	@CacheLookup
	WebElement btnleaveform;
	
	 @FindBy(how = How.XPATH, using="(//button[@type='button'])[1]")
	@CacheLookup
	WebElement btnaddleave;
	

		
		
	//new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(.,'Select Leave Type')])[1]")))
				//@FindBy(how = How.XPATH, using="(//button[@type='button'])[1]")
	@CacheLookup
	WebElement btnleavetype;
	
	@FindBy(how = How.XPATH, using="//a[contains(.,'CL')]")
	@CacheLookup
	WebElement btnleavetypeselect;
	
	@FindBy(how = How.XPATH, using="(//input[@name='from_date'])[1]")
	@CacheLookup
	WebElement btnfromdate;
	
	
	@FindBy(how = How.XPATH, using="//a[contains(.,'12')]")
	@CacheLookup
	WebElement btnselectdate;
	
	
	@FindBy(how = How.XPATH, using="(//input[@name='to_date'])[1]")
	@CacheLookup
	WebElement btntodate;
	
	
	@FindBy(how = How.XPATH, using="//a[contains(.,'12')]")
	@CacheLookup
	WebElement btnselecttodate;
	
	@FindBy(how = How.ID, using="start_time")
	@CacheLookup
	WebElement btnstarttime;
	
	@FindBy(how = How.XPATH, using="(//span[contains(.,'9')])[1]")
	@CacheLookup
	WebElement btnselectstarttimehour;
	
	@FindBy(how = How.XPATH, using="/html/body/div[3]/div/section[2]/div[1]/div[2]/div[1]/span")
	@CacheLookup
	WebElement btnselectstrattimeminute;
	
	@FindBy(how = How.XPATH, using="/html/body/div[3]/div/section[2]/div[1]/span[1]")
	@CacheLookup
	WebElement btnselectstrattimeAm;
	
	@FindBy(how = How.XPATH, using="(//span[@class='mdtp__button ok'])[1]")
	@CacheLookup
	WebElement btnselectstrattimeOk;
	
	
	@FindBy(how = How.ID, using="end_time")
	@CacheLookup
	WebElement btnendtime;
	
	@FindBy(how = How.XPATH, using="/html/body/div[4]/div/section[2]/div[1]/div[1]/div[5]/span")
	@CacheLookup
	WebElement btnselectendtimehour;
	
	@FindBy(how = How.XPATH, using="/html/body/div[4]/div/section[2]/div[1]/div[2]/div[1]/span")
	@CacheLookup
	WebElement btnselectendtimeminute;
	
	@FindBy(how = How.XPATH, using="/html/body/div[4]/div/section[2]/div[1]/span[2]")
	@CacheLookup
	WebElement btnselectendtimePm;
	
	@FindBy(how = How.XPATH, using="/html/body/div[4]/div/section[2]/div[2]/span[2]")
	@CacheLookup
	WebElement btnselectendtimeOk;
	
	@FindBy(how = How.ID, using="contact_details")
	@CacheLookup
	WebElement txtContact;
	
	@FindBy(how = How.XPATH, using="//button[@data-id='cc_to']")
	@CacheLookup
	WebElement btnCcto;
	
	@FindBy(how = How.XPATH, using="//span[contains( .,' Akhilesh Chaubey')]")
	@CacheLookup
	WebElement btnCctovalue;
	
	
	@FindBy(how = How.XPATH, using="//textarea[@id='reason']")
	@CacheLookup
	WebElement txtComments;
	
	@FindBy(how = How.XPATH, using="//*[@id='btn_leave']")
	@CacheLookup
	WebElement btnLeave;
	

	
	
	
	
	public void clickLeaveManagement()
	{
		btnleaveapply.click();
	}
	
	public void clickLeaveForm()
	{
		btnleaveform.click();
	}
	
	
	public void clickAddLeave()
	{
		btnaddleave.click();
	}
	
	public void clickLeaveType()
	{
          WebDriverWait webdwait = new WebDriverWait(ldriver, Duration.ofSeconds(40));
		
		webdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(.,'Select Leave Type')])[1]"))).click();
			//btnleavetype.click();
		
	}
	
	public void clickLeaveTypeselect()
	{
		btnleavetypeselect.click();
	}
	
	
	public void clickFromDate()
	{
		btnfromdate.click();
	}
	
	public void selectFromDate()
	{
		btnselectdate.click();
	}
	
	public void clickToDate()
	{
		btntodate.click();
	}
	
	public void selectToDate()
	{
		btnselecttodate.click();
	}

	public void clickStartTime()
	{
		btnstarttime.click();
	}
	
	
	public void selectStartTimehour()
	{
		btnselectstarttimehour.click();
	}
	
	public void selectStartTimeMinute()
	{
		btnselectstrattimeminute.click();
	}
	
	public void selectStartTimeAm()
	{
		btnselectstrattimeAm.click();
	}
	
	public void selectStartTimeOk()
	{
		btnselectstrattimeOk.click();
	}
	
	
	
	public void clickEndTime()
	{
		btnendtime.click();
	}
	
	
	public void selectEndTimehour()
	{
		btnselectendtimehour.click();
	}
	
	public void selectEndTimeMinute()
	{
		btnselectendtimeminute.click();
	}
	
	public void selectEndTimeAm()
	{
		btnselectendtimePm.click();
	}
	
	public void selectEndTimeOk()
	{
		btnselectendtimeOk.click();
	}
	
	public void sendContactDetails(String contact)
	{
		txtContact.sendKeys(contact);
	}
	
	public void clickCcTo()
	{
		btnCcto.click();
	}
	
	public void selectCcTo()
	{
		btnCctovalue.click();
	}
	
	public void addComments(String cmnts)
	{
		txtComments.sendKeys(cmnts);
	}
	
	public void clickLeaveSubmit()
	{
		btnLeave.click();
	}
	
	
}
