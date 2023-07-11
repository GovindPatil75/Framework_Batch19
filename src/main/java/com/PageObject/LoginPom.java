package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Utility.BaseClass;

public class LoginPom extends BaseClass{

	//Identify WebElement -XPath
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement txt_Email;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement txt_Password;
	
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement btn_login;
	
	
	//getter
	public WebElement gettxt_Email() {
		return txt_Email;
	}
	
	public WebElement getxt_Password() {
		return txt_Password;
	}
	
	public WebElement getbtn_login() {
		return btn_login;
	}
}
