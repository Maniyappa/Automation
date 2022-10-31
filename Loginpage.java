package com.ehrweb.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver ldriver;
	public Loginpage(WebDriver rdiver){
		ldriver=rdiver;
		PageFactory.initElements(rdiver, this);
	}
	@FindBy(xpath="//input[@id='login-username']")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(xpath="//input[@id='login-password']")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(xpath="//a[@id='login']")
	@CacheLookup
	WebElement btnlogin;
	
	@FindBy(xpath="//a[@data-toggle='dropdown']")
	@CacheLookup
	WebElement btnProfile;
	
	@FindBy(xpath="(//a[contains(.,'Logout')])[1]")
	@CacheLookup
	WebElement btnlogout;
	
	
	public void setUserName(String Uname)
	{
		txtUserName.sendKeys(Uname);
	}
	
	public void setpassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		btnlogin.click();
	}
	
	public void clickProfile()
	{
		btnProfile.click();
	}
	
	
	public void clickLogout()
	{
		btnlogout.click();
	}
	

}