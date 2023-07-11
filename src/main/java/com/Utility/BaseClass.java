package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static ExcleDataProvider excel;
	public static ConfigDataProvider config;
	
	@BeforeSuite
	public void initilizationObject() throws Exception {
		 excel=new ExcleDataProvider();
		 config=new ConfigDataProvider();
		 
	}
	//Browser Open
	@Parameters("BrowserName")
	@BeforeMethod
	public void setUp(String BrowserName ) {
		
		System.out.println("Browser Open");
		if(BrowserName.equalsIgnoreCase(config.getBrowserName())) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		driver.get(config.getBaseUrl());
		driver.manage().window().maximize();
		
	}
	
	//Browser Close
	@AfterMethod
	public void tearDown() {
		System.out.println("Browser Close");
		if(driver!=null) {
			
			//driver.close(); //Current Window Close
		}
		
	}

}
