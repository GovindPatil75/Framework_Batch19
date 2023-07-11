package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {
	
	public static ExtentReports extent;
	public static ExtentReports getReports() {
		
		String path="C:\\Users\\Admin\\OneDrive\\Desktop\\Framework_Batch19\\Framework_Batch19\\Reports";
	
		 //ExtentSparkReporter
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("Batch 19 Test Report");
		reporter.config().setTheme(Theme.DARK);
		
		//ExtentReports
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project Name", "Batch 19");
		extent.setSystemInfo("O.S.", "Window 10");
		extent.setSystemInfo("Browser Name", "Chrome");
		extent.setSystemInfo("QA", "ABC");
		return extent;
		
	
	
	}

}
