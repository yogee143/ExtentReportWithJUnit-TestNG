package com.withJUnit;
import java.io.IOException;

import org.junit.Test;
import com.aventstack.extentreports.Status;

public class ExtentReportWithJUnit extends SuperClass {
	@Test
	public void test1A() throws IOException {
		test = extent.createTest("GoogleSearchTestCase1","This is test to validate Google Search functionaltiy1");
		test.log(Status.INFO, "Starting test case");
		test.pass("Search button clicked");
		test.info("Test Completed");
	}

	@Test
	public void test2A() throws IOException {
		test = extent.createTest("GoogleSearchTestCase2","zzzzzzzzzzzzzzzzzzzzThis is test to validate Google Search functionaltiy1");
		test.log(Status.INFO, "Starting test case");
		test.pass("Naviaget to google.com");
	}

	@Test
	public void test3A() {
		test = extent.createTest("GoogleSearchTestCase3","This is test to validate Google Search functionaltiy 3");
		test.fail("Search button clicked");
		test.info("Test Completed");
	}

}
