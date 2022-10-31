package com.ehrweb.pageobject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Review_Expense_Page {
	WebDriver ldriver;
	public Review_Expense_Page(WebDriver rdriver)
	{
		ldriver=rdriver;
	//	PageFactory.initElements(rdriver, this);
	}
	
	//@FindBy(how = How.XPATH, using="//a[@href='#Expense']")
	@CacheLookup
	WebElement btneexpense;
	
	//@FindBy(how = How.XPATH, using="//a[@href=\"review_expense.php\"]")
	@CacheLookup
	WebElement btnreviewexpense;
	
	//@FindBy(how = How.XPATH, using="//input[@class=\"form-control form-control-sm\"]")
	@CacheLookup
	WebElement txtsearch;
	
	//@FindBy(how = How.XPATH, using="//a[@onclick=\"approveform(287);\"]")
	@CacheLookup
	WebElement btnemployeeid;
	
	//@FindBy(how = How.XPATH, using="(//span[@class='filter-option pull-left'])[2]")
	@CacheLookup
	WebElement txtapprover;
	
//	@FindBy(how = How.XPATH, using="//span[contains(.,'  Priyanka T  S')]")
	@CacheLookup
	WebElement selectapprover;
	
	//@FindBy(how = How.CLASS_NAME, using="form-control next_datepicker hasDatepicker")
	@CacheLookup
	WebElement btnDate;
	
	//@FindBy(how = How.XPATH, using="//a[contains(.,'20')]")
	@CacheLookup
	WebElement selectdate;
	
	//@FindBy(how = How.CLASS_NAME, using="\"btn dropdown-toggle btn-default\"")
	@CacheLookup
	WebElement btnstatus;
	
	//@FindBy(how = How.XPATH, using="(//span[contains(.,\"Approve\")])[2]")
	@CacheLookup
	WebElement selectstatus;
	
	
	//@FindBy(how = How.ID, using="approved_details_submit")
	@CacheLookup
	WebElement btnsubmit;
	
	
	public void clickEExpense()
	{
		
		
		 WebDriverWait webdwait = new WebDriverWait(ldriver, Duration.ofSeconds(50));
			
			webdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='#Expense']"))).click();
		//btneexpense.click();
	}
	
	public void clickReviewExpense()
	{
		 WebDriverWait webdwait = new WebDriverWait(ldriver, Duration.ofSeconds(50));
			
			webdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href=\"review_expense.php\"]"))).click();
		
		
	//	btnreviewexpense.click();
	}
	
	/*public void searchExpense()
	{
		 WebDriverWait webdwait = new WebDriverWait(ldriver, Duration.ofSeconds(50));
			
			webdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class=\"form-control form-control-sm\"]"))).sendKeys("canada");
		
		
		
		
		
		// txtsearch.sendKeys("canada");
	}*/
	
	public void clickEmployeeid()
	{
		 WebDriverWait webdwait = new WebDriverWait(ldriver, Duration.ofSeconds(50));
			
			webdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@onclick=\"approveform(287);\"]"))).click();
		
		
		// btnemployeeid.click();
	}
	
	public void clickApprovername()
	{
		WebDriverWait webdwait = new WebDriverWait(ldriver, Duration.ofSeconds(50));
		
		webdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='filter-option pull-left'])[2]"))).click();
	
		
		//txtapprover.click();
	}
	
	public void selectApprover()
	{
         WebDriverWait webdwait = new WebDriverWait(ldriver, Duration.ofSeconds(50));
		
		webdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'  Priyanka T  S')]"))).click();
	
		
		
		//selectapprover.click();
	}
	
	public void clickDate()
	{
        WebDriverWait webdwait = new WebDriverWait(ldriver, Duration.ofSeconds(50));
		
		webdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name=\"expense_date[]\"]"))).click();
	
		
		
		// btnDate.click();
	}
	
	public void selectDate()
	{
		WebDriverWait webdwait = new WebDriverWait(ldriver, Duration.ofSeconds(50));
	
	webdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(.,'20')]"))).click();

		
		
		//selectdate.click();
	}
	
	public void clickStatus()
	{
        WebDriverWait webdwait = new WebDriverWait(ldriver, Duration.ofSeconds(50));
		
		webdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='btn dropdown-toggle btn-default'])[4]"))).click();
	
		
		//btnstatus.click();
	}
	
	public void selectStatus()
	{
       WebDriverWait webdwait = new WebDriverWait(ldriver, Duration.ofSeconds(50));
		
		webdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(.,\"Approve\")])[2]"))).click();
	
		
		
		//selectstatus.click();
	}
	
	public void clickSubmit()
	{
		
          WebDriverWait webdwait = new WebDriverWait(ldriver, Duration.ofSeconds(50));
		
		webdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(.,\"Submit\")]"))).click();
	
		
		
		
		//btnsubmit.click();
	}
	
	
	
	
	
	

}
