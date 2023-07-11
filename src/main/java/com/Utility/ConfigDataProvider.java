package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	public Properties pro ;
	public ConfigDataProvider() throws Exception {
		String filepath="C:\\Users\\hp\\Desktop\\project framework\\Framework_Batch19\\Config\\Config.Properties";
		FileInputStream fis=new FileInputStream(filepath);
		pro=new Properties();
		pro.load(fis);
	}

	 // Url 
	public String getBaseUrl() {
		return pro.getProperty("BaseUrl");
	}
	
	public String getBrowserName() {
		return pro.getProperty("BrowserName");
	}
}
