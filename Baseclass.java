package com.ehrweb.testcases;





import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.ehrweb.utilities.ReadConfig;

public class Baseclass {
	
	ReadConfig readconfig= new ReadConfig();
	
	public String baseUrl=readconfig.getApplicationurl();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public String contact=readconfig.getContact();
	public String comments=readconfig.getComments();
	public String username1=readconfig.getUsername1();
	public String username2=readconfig.getUsername2();
	
	public  WebDriver driver;
	
	
	
	
	public static Logger Logger;
	
	
	@SuppressWarnings("static-access")
	@Parameters("browser")
	
	@BeforeClass
	public   void setup(String br)
	{
	
		BasicConfigurator.configure();
	
	
	if(br.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
		driver=new ChromeDriver();
		
	}
	
	else if (br.equals("edge"))
	{
		
		System.setProperty("webdriver.edge.driver",readconfig.getMsedgepath());
		driver=new EdgeDriver();
//		System.setProperty("webdriver.msedge.driver",readconfig.getmsedgepath());
//		driver=new FirefoxDriver();
		
	}
	
	
	Logger = Logger.getLogger("ehrWeb");
	PropertyConfigurator.configure("log4j.properties");
	
	driver.get(baseUrl);
	
	driver.manage().window().maximize();
	

	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}


}
