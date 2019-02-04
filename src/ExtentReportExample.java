import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportExample {

	
	
	public static void main(String[] args) {
	
		WebDriver driver = null;
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./extentReports.html");
			
			ExtentReports extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			
			ExtentTest test1 = extent.createTest("GoogleSearchTestCase1","This is test to validate Google Search functionaltiy");
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Yogesh Learning\\Drivers\\chromedriver_win32_2.41\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			test1.log(Status.INFO, "Starting test case");
			driver.get("http://www.google.com/");
			
			test1.pass("Naviaget to google.com");
			
			//driver.findElement(By.name("q")).sendKeys("Yogi");
			test1.pass("Entered text in searchbox");
			
			//driver.findElement(By.name("btnK")).click();
			test1.pass("Search button clicked");
			
			test1.info("Test Completed");
			
			driver.close();
			driver.quit();
			
			extent.flush();
			
	}

}
