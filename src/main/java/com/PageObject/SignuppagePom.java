package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignuppagePom {

	
	//Identify Webelement
	@FindBy(how=How.XPATH,using="//input[@name='firstname']")
	private WebElement FirstName;
	
	@FindBy(how=How.XPATH,using="//input[@name='lastname']")
	private WebElement LastName;
	
	@FindBy(how=How.XPATH,using="//input[@name='reg_email__']")
	private WebElement EmailAddress;

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getEmailAddress() {
		return EmailAddress;
	}
}

