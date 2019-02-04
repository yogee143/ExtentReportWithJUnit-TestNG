package com.withJUnit;
import java.io.IOException;

import org.junit.Test;

import com.aventstack.extentreports.Status;

public class ExtentReportWithJUnit2 extends SuperClass {

	@Test
	public void test1() throws IOException {
		test = extent.createTest("2#GoogleSearchTestCase1","This is test to validate Google Search functionaltiy1");
		test.log(Status.INFO, "Starting test case");
		test.pass("Naviaget to google.com");
		test.pass("Entered text in searchbox");
		test.pass("Search button clicked");
		test.info("Test Completed");
		test.addScreenCaptureFromPath("screenshot.png");
		
	}

	@Test
	public void test2() throws IOException {
		test = extent.createTest("2#GoogleSearchTestCase2","zzzzzzzzzzzzzzzzzzzzThis is test to validate Google Search functionaltiy1");
		test.log(Status.INFO, "Starting test case");
		test.pass("Naviaget to google.com");
		test.pass("Entered text in searchbox");
		test.pass("Search button clicked");
		test.info("Test Completed");
		test.addScreenCaptureFromPath("screenshot.png");
	
	}

	@Test
	public void test3() {
		test = extent.createTest("2#GoogleSearchTestCase3","This is test to validate Google Search functionaltiy 3");
		test.log(Status.INFO, "Starting test case");
		test.pass("Naviaget to google.com");
		test.pass("Entered text in searchbox");
		test.fail("Search button clicked");
		test.info("Test Completed");
	}

}
