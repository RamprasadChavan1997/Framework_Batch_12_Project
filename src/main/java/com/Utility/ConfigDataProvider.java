package com.Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider() throws Exception {
	String path="C:\\Users\\Dell\\eclipse-workspace\\Framework_2\\Config\\Config.properties";
    FileInputStream fis=new FileInputStream(path);
    pro=new Properties();
    pro.load(fis);
	}
	
	public String get_BaseUrl_QA1() {
		return pro.getProperty("BaseUrl_QA1");
	}
	
	
	

	
}
