package com.ehrweb.testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ehrweb.pageobject.Loginpage;
import com.ehrweb.utilities.XLUtils;

public class Tc_LoginDDT_02 extends Baseclass
{

	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) throws InterruptedException {
		

		Loginpage login=new Loginpage(driver);
		login.setUserName(user);
		login.setpassword(pwd);
		login.clickSubmit();
		Thread.sleep(3000);
	
		login.clickProfile();
		Thread.sleep(3000);
		login.clickLogout();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
	}
	
	


	@DataProvider(name="LoginData")
    public String [][] getData() throws IOException
	{
		String path="C:\\Users\\EMPULSE\\Desktop\\workspace\\ehrWeb\\src\\test\\java\\com\\ehrweb\\testdata\\LoginData.xlsx";
	    int rownum=XLUtils.getRowCount(path, "sheet1");
	    int colcount=XLUtils.getCellCount(path, "sheet1", 1);
	    String logindata[][]=new String[rownum][colcount];
	    for(int i=1;i<=rownum;i++) {
	    	for(int j=0;j<colcount;j++) {
	    		logindata[i-1][j]=XLUtils.getCellData(path, "sheet1", i, j);//1,0
	    	}
	    }
	    return logindata;
	}


}