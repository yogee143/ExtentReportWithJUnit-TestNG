import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
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


public class GenerateExtentReport
{
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	
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
	public void demoTestPass() {
		test = extent.createTest("demoTestPass","This test will demo the pass test case");
		Assert.assertTrue(true);
	}
		
	@Test
	public void demoTestFail() {
		test = extent.createTest("demoTestPass","This test will demo the fail test case");
		Assert.assertTrue(false);
	}

	@Test
	public void demoTestSkip() {
		test = extent.createTest("demoTestPass","This test will demo the skip test case");
		throw new SkipException("This test case not ready for execution");
	}
	
	@AfterMethod
	public void getResult(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"This is failed", ExtentColor.RED));
			test.fail(result.getThrowable());
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
