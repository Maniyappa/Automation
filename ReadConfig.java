package com.ehrweb.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
		File src=new File("./configuration/config.properties");
		
		try
		{
		   FileInputStream fis=new FileInputStream(src);
		   pro=new Properties();
		   pro.load(fis);
		}
		catch (Exception e)
		{
			System.out.println("Exception is"+e.getMessage());
		}
	}
	
	public String getApplicationurl()
	{
		String url=pro.getProperty("baseUrl");
		return url;
	}
	
	public String getUsername()
	{
		String username=pro.getProperty("username");
		return username;
	}
	
	public String getPassword()
	{
		String password=pro.getProperty("password");
		return password;
	}
	
	public String getChromepath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getMsedgepath()
	{
		String msedgepath=pro.getProperty("msedgepath");
		return msedgepath;
	}

	public String getContact() {
		String contact=pro.getProperty("contact");
		return contact;
	}

	public String getComments() {
		String comments=pro.getProperty("comments");
		return comments;
	}
	public String getUsername1()
	{
		String username1=pro.getProperty("username1");
		return username1;
	}
	
	public String getSource()
	{
		String source=pro.getProperty("source");
		return source;
	}
	public String getDestination()
		{
			String destination=pro.getProperty("destination");
			return destination;
		}
	public String getAmount()
	{
		String amount=pro.getProperty("amount");
		return amount;
	}
	
	public String getUsername2()
	{
		String username2=pro.getProperty("username2");
		return username2;
	}
	
	
	
	}
	
	


