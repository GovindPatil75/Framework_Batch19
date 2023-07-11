package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentPom {
	
	// WebElement identify

	@FindBy(how=How.XPATH,using="Xpath Expression")
	private WebElement ABC;
	
	public WebElement getABC() {
		return ABC;
	}
	
	
}
