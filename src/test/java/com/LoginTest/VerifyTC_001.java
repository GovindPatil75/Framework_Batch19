package com.LoginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class VerifyTC_001 extends BaseClass{
	
	@Test
	public void verifyTC_001_loginvalidCredentials() {
		System.out.println("Test 001");
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		//Email -
		Library.custom_sendKeys(login.gettxt_Email(), excel.getStringData_excel("Login", 0, 0),"Email");
		//Password
		Library.custom_sendKeys(login.getxt_Password(), excel.getStringData_excel("Login", 0, 1),"Password");
		//Login
		Library.custom_click(login.getbtn_login(),"Login Button");
		
		Assert.assertTrue(false);
		//Library.Handle_Alert(driver).dismiss();
	
		//Library.HandleDropDown(null, null);
	}

}
