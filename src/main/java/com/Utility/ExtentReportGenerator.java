package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	public static ExtentReports extent;
	public static ExtentReports getReport() {
		String path="C:\\Users\\Dell\\eclipse-workspace\\Framework_2\\Reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("Test Batch 12 Report");
		reporter.config().setTheme(Theme.STANDARD);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project Name", "Test Project");
		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("Tool", "Selenium WebDriver");
		extent.setSystemInfo("QA", "Ram");
		return extent;
		
	}
}
