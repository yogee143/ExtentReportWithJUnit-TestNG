import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportWithTestNG2 {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	
	@BeforeClass 	
	public void setUp() {
		htmlReporter = new ExtentHtmlReporter("./extent2TestNG.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}

	@Test
	public void test1() throws IOException {
		ExtentTest test = extent.createTest("GoogleSearchTestCase1","This is test to validate Google Search functionaltiy1");
		test.log(Status.INFO, "Starting test case");
		test.pass("Naviaget to google.com");
		test.pass("Entered text in searchbox");
		test.pass("Search button clicked");
		test.info("Test Completed");
		test.addScreenCaptureFromPath("screenshot.png");
	}

	@Test
	public void test2() {
		ExtentTest test = extent.createTest("GoogleSearchTestCase2","This is test to validate Google Search functionaltiy2");
		test.log(Status.INFO, "Starting test case");
		test.pass("Naviaget to google.com");
		test.pass("Entered text in searchbox");
		test.fail("Search button clicked");
		test.info("Test Completed");
	}

	@Test
	public void test3() throws IOException {
		ExtentTest test = extent.createTest("GoogleSearchTestCase1","This is test to validate Google Search functionaltiy1");
		test.log(Status.INFO, "Starting test case");
		test.pass("Naviaget to google.com");
		test.pass("Entered text in searchbox");
		test.pass("Search button clicked");
		test.info("Test Completed");
		test.addScreenCaptureFromPath("screenshot.png");
	}

	@Test
	public void test4() {
		ExtentTest test = extent.createTest("GoogleSearchTestCase2","This is test to validate Google Search functionaltiy2");
		test.log(Status.INFO, "Starting test case");
		test.pass("Naviaget to google.com");
		test.pass("Entered text in searchbox");
		test.fail("Search button clicked");
		test.info("Test Completed");
	}

	@Test
	public void test5() throws IOException {
		ExtentTest test = extent.createTest("GoogleSearchTestCase1","This is test to validate Google Search functionaltiy1");
		test.log(Status.INFO, "Starting test case");
		test.pass("Naviaget to google.com");
		test.pass("Entered text in searchbox");
		test.pass("Search button clicked");
		test.info("Test Completed");
		test.addScreenCaptureFromPath("screenshot.png");
	}

	@Test
	public void test6() {
		ExtentTest test = extent.createTest("GoogleSearchTestCase2","This is test to validate Google Search functionaltiy2");
		test.log(Status.INFO, "Starting test case");
		test.pass("Naviaget to google.com");
		test.pass("Entered text in searchbox");
		test.fail("Search button clicked");
		test.info("Test Completed");
	}

	@Test
	public void test7() throws IOException {
		ExtentTest test = extent.createTest("GoogleSearchTestCase1","This is test to validate Google Search functionaltiy1");
		test.log(Status.INFO, "Starting test case");
		test.pass("Naviaget to google.com");
		test.pass("Entered text in searchbox");
		test.pass("Search button clicked");
		test.info("Test Completed");
		test.addScreenCaptureFromPath("screenshot.png");
	}

	@Test
	public void test8() {
		ExtentTest test = extent.createTest("GoogleSearchTestCase2","This is test to validate Google Search functionaltiy2");
		test.log(Status.INFO, "Starting test case");
		test.pass("Naviaget to google.com");
		test.pass("Entered text in searchbox");
		test.fail("Search button clicked");
		test.info("Test Completed");
	}

	
	@AfterClass
	public void tearDown() {
		extent.flush();
	
	}

}
