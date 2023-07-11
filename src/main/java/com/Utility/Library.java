package com.Utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	public static ExtentTest test;
	//common -sendKeys
	public static void custom_sendKeys(WebElement element,String value,String fieldname) {
		try {
			//risky
		element.sendKeys(value);
		test.log(Status.PASS, fieldname+"==Value Successfully Send=="+value);
		}catch(Exception e) {
			
			test.log(Status.FAIL, e.getMessage());
			
		}
	}

	//common -click
	
	public static void custom_click(WebElement element,String fieldname) {
		
		try {
			element.click();
			test.log(Status.PASS, "Click succesfully =="+fieldname);
		}catch(Exception e) {
			
			test.log(Status.FAIL, e.getMessage());
			System.out.println(e.getMessage());
		}
	}
	
	public static Alert Handle_Alert(WebDriver driver) {
		return driver.switchTo().alert();
	}
	
	public static void HandleDropDown(WebElement element,String text) {
		try {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
