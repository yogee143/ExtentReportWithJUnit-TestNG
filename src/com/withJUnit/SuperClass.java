package com.withJUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class SuperClass {

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	@BeforeClass
	public static void setUp() {
		String path="./extent2Junit.html";
		htmlReporter = new ExtentHtmlReporter(path);
		htmlReporter.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}

	@AfterClass
	public static void tearDown() {
		extent.flush();
	}

}