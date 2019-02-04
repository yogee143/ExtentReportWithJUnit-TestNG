package com.withTestNG;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GetScreenShot {

	public static String capture(WebDriver driver, String screenShotName) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		String destFileNamePath = System.getProperty("user.dir")+"/ErrorScreenShots/"+screenShotName+".png";
		File destFile = new File(destFileNamePath);
		FileUtils.copyFile(srcFile, destFile);
		
		return destFileNamePath;
		
	}
}
