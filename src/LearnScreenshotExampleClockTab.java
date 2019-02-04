import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

import javax.imageio.ImageIO;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.Coords;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

public class LearnScreenshotExampleClockTab {
	WebDriver driver = null;
	
	@Test
	public void TC1_CompareImages() throws Exception{

		System.out.println("In Method....");
		System.setProperty("webdriver.chrome.driver", "C:\\Yogesh Learning\\Drivers\\chromedriver_win32_2.41\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.clocktab.com/");

		String image1Path="./ClockImage1.png";
		String image2Path="./ClockImage2.png";
		
		
		Thread.sleep(5000);
		
		Screenshot sc1 = new AShot().takeScreenshot(driver);
		ImageIO.write(sc1.getImage(), "png", new File (image1Path));

		
		//Screenshot sc2 = new AShot().coordsProvider(new WebDriverCoordsProvider()).addIgnoredElement(By.xpath("(//*[@id='digit2'])[1]")).takeScreenshot(driver,digit);
		Screenshot sc2 = new AShot().takeScreenshot(driver);
		ImageIO.write(sc2.getImage(), "png", new File (image2Path));

		BufferedImage expectedImage = ImageIO.read(new File(image1Path));
		BufferedImage actualImage = ImageIO.read(new File(image2Path));

		ImageDiffer imageDifferWithIgnored = new ImageDiffer().withColorDistortion(1);	
		ImageDiff diff = imageDifferWithIgnored.makeDiff(expectedImage, actualImage);
		BufferedImage diffImage = diff.getMarkedImage();
		
		ImageIO.write(diffImage, "png", new File ("./ClockDifference.png"));
		
		Assert.assertFalse("Images are not same",diff.hasDiff());
		

		driver.quit();
	}
	
	@Test
	public void TC2_CompareImages() throws Exception{

		System.out.println("In Method....");
		System.setProperty("webdriver.chrome.driver", "C:\\Yogesh Learning\\Drivers\\chromedriver_win32_2.41\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.clocktab.com/");

		String image1Path="./ClockImage1.png";
		String image2Path="./ClockImage2.png";
		
		
		Thread.sleep(5000);
		
		Screenshot sc1 = new AShot().takeScreenshot(driver);
		ImageIO.write(sc1.getImage(), "png", new File (image1Path));

		
		//Screenshot sc2 = new AShot().coordsProvider(new WebDriverCoordsProvider()).addIgnoredElement(By.xpath("(//*[@id='digit2'])[1]")).takeScreenshot(driver,digit);
		Screenshot sc2 = new AShot().takeScreenshot(driver);
		ImageIO.write(sc2.getImage(), "png", new File (image2Path));

		BufferedImage expectedImage = ImageIO.read(new File(image1Path));
		BufferedImage actualImage = ImageIO.read(new File(image2Path));

		ImageDiffer imageDifferWithIgnored = new ImageDiffer().withColorDistortion(1);	
		ImageDiff diff = imageDifferWithIgnored.makeDiff(expectedImage, actualImage);
		BufferedImage diffImage = diff.getMarkedImage();
		
		ImageIO.write(diffImage, "png", new File ("./ClockDifference.png"));
		
		Assert.assertFalse("Images are not same",diff.hasDiff());
		

		driver.quit();
	}

	@Test
	public void TC3_CompareImages() throws Exception{

		System.out.println("In Method....");
		System.setProperty("webdriver.chrome.driver", "C:\\Yogesh Learning\\Drivers\\chromedriver_win32_2.41\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.clocktab.com/");

		String image1Path="./ClockImage1.png";
		String image2Path="./ClockImage2.png";
		
		
		Thread.sleep(5000);
		
	
		Screenshot sc1 = new AShot().takeScreenshot(driver);
		ImageIO.write(sc1.getImage(), "png", new File (image1Path));

		
		//Screenshot sc2 = new AShot().coordsProvider(new WebDriverCoordsProvider()).addIgnoredElement(By.xpath("(//*[@id='digit2'])[1]")).takeScreenshot(driver,digit);
		Screenshot sc2 = new AShot().takeScreenshot(driver);
		ImageIO.write(sc2.getImage(), "png", new File (image2Path));

		BufferedImage expectedImage = ImageIO.read(new File(image1Path));
		BufferedImage actualImage = ImageIO.read(new File(image2Path));

		ImageDiffer imageDifferWithIgnored = new ImageDiffer().withColorDistortion(1);	
		ImageDiff diff = imageDifferWithIgnored.makeDiff(expectedImage, actualImage);
		BufferedImage diffImage = diff.getMarkedImage();
		
		ImageIO.write(diffImage, "png", new File ("./ClockDifference.png"));
		
		Assert.assertFalse("Images are not same",diff.hasDiff());
		

		driver.quit();
	}

	@Test
	public void TC4_CompareImages() throws Exception{

		System.out.println("In Method....");
		System.setProperty("webdriver.chrome.driver", "C:\\Yogesh Learning\\Drivers\\chromedriver_win32_2.41\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.clocktab.com/");

		String image1Path="./ClockImage1.png";
		String image2Path="./ClockImage2.png";
		
		
		Thread.sleep(5000);
		
		Screenshot sc1 = new AShot().takeScreenshot(driver);
		ImageIO.write(sc1.getImage(), "png", new File (image1Path));

		
		//Screenshot sc2 = new AShot().coordsProvider(new WebDriverCoordsProvider()).addIgnoredElement(By.xpath("(//*[@id='digit2'])[1]")).takeScreenshot(driver,digit);
		Screenshot sc2 = new AShot().takeScreenshot(driver);
		ImageIO.write(sc2.getImage(), "png", new File (image2Path));

		BufferedImage expectedImage = ImageIO.read(new File(image1Path));
		BufferedImage actualImage = ImageIO.read(new File(image2Path));

		ImageDiffer imageDifferWithIgnored = new ImageDiffer().withColorDistortion(1);	
		ImageDiff diff = imageDifferWithIgnored.makeDiff(expectedImage, actualImage);
		BufferedImage diffImage = diff.getMarkedImage();
		
		ImageIO.write(diffImage, "png", new File ("./ClockDifference.png"));
		
		Assert.assertFalse("Images are not same",diff.hasDiff());
		

		driver.quit();
	}

	@Test
	public void TC5_CompareImages() throws Exception{

		System.out.println("In Method....");
		System.setProperty("webdriver.chrome.driver", "C:\\Yogesh Learning\\Drivers\\chromedriver_win32_2.41\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.clocktab.com/");

		String image1Path="./ClockImage1.png";
		String image2Path="./ClockImage2.png";
		
		
		Thread.sleep(5000);
		
		Screenshot sc1 = new AShot().takeScreenshot(driver);
		ImageIO.write(sc1.getImage(), "png", new File (image1Path));

		
		//Screenshot sc2 = new AShot().coordsProvider(new WebDriverCoordsProvider()).addIgnoredElement(By.xpath("(//*[@id='digit2'])[1]")).takeScreenshot(driver,digit);
		Screenshot sc2 = new AShot().takeScreenshot(driver);
		ImageIO.write(sc2.getImage(), "png", new File (image2Path));

		BufferedImage expectedImage = ImageIO.read(new File(image1Path));
		BufferedImage actualImage = ImageIO.read(new File(image2Path));

		ImageDiffer imageDifferWithIgnored = new ImageDiffer().withColorDistortion(1);	
		ImageDiff diff = imageDifferWithIgnored.makeDiff(expectedImage, actualImage);
		BufferedImage diffImage = diff.getMarkedImage();
		
		ImageIO.write(diffImage, "png", new File ("./ClockDifference.png"));
		
		Assert.assertFalse("Images are not same",diff.hasDiff());
		

		driver.quit();
	}

	@Test
	public void TC6_TestScreenshot() throws Exception{

		System.out.println("In Method....");
		System.setProperty("webdriver.chrome.driver", "C:\\Yogesh Learning\\Drivers\\chromedriver_win32_2.41\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		Thread.sleep(800);		
		driver.get("http://www.clocktab.com/");

		String expectedImagePath = "./NewClockImage1.png";
		String actualImagePath = "./NewClockImage2.png";

		
		Set<By> bySet = new HashSet<>();
	    bySet.add(By.id("digit2"));
	    bySet.add(By.id("digit1"));
	    
		Screenshot sc1 = new AShot().takeScreenshot(driver);
		ImageIO.write(sc1.getImage(), "png", new File (expectedImagePath));

		
		//Screenshot sc2 = new AShot().takeScreenshot(driver);
		Screenshot sc2 = new AShot().coordsProvider(new WebDriverCoordsProvider()).ignoredElements(bySet).takeScreenshot(driver);
		ImageIO.write(sc2.getImage(), "PNG", new File(actualImagePath));
	
		 
		Set<Coords> coordsIgnor = sc2.getIgnoredAreas();
        
		Screenshot expected = new Screenshot(ImageIO.read(new File(expectedImagePath)));
		expected.setIgnoredAreas(coordsIgnor);
		
		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff diff = imgDiff.makeDiff(expected, sc2);
		
		BufferedImage diffImage = diff.getMarkedImage();
		
		ImageIO.write(diff.getDiffImage(),"PNG", new File("./Result_Diff2.png"));
		
		ImageIO.write(diffImage, "PNG", new File("./Result_Diff.png"));
	
		driver.quit();
	
	}		

}
