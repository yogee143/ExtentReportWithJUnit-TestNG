package com.withTestNG;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class CapturingScreenshot {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	WebDriver driver;
	
	@BeforeTest
	public void startReport() {
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/MyOwnReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("Tester", "Yogesh");
		extent.setSystemInfo("OS", "Windows 7");
		
		htmlReporter.config().setTheme(Theme.DARK);
	}
	

	@Test
	public void captureScreenshot() {
		test = extent.createTest("capture Screenshot");
		System.setProperty("webdriver.gecko.driver", "C:\\Yogesh Learning\\Drivers\\chromedriver_win32_2.41\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.automationtesting.in");
		String title = driver.getTitle();
		
		Assert.assertEquals("Home - Automation Test", title);
		
	}
	
	
	@AfterMethod
	public void getResult(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
			String screenshotPath = GetScreenShot.capture(driver, "screenShotName");
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"This is failed", ExtentColor.RED));
			test.fail(result.getThrowable());
			test.fail("Snapshot below:"+test.addScreenCaptureFromPath(screenshotPath));
			
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+"This is PASS", ExtentColor.GREEN));
		}
		else {
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+"This is Skipped", ExtentColor.YELLOW));
			test.skip(result.getThrowable());
		}
			
	}
	
	@AfterTest
	public void tearDown() {
		extent.flush();
	}

	
}
