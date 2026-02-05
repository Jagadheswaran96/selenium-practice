package selenium;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportCreation {

	static ExtentReports extentReports;
	ExtentHtmlReporter extentHtmlReporter;
	ExtentTest extentTest;
	WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		extentReports = new ExtentReports();
		extentHtmlReporter = new ExtentHtmlReporter("ExtentReport.html");
		extentReports.attachReporter(extentHtmlReporter);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	  @Test public void openBing() throws IOException {
	  extentTest=extentReports.createTest("Verify bing");
	  driver.get("https://www.bing.com/");
	  String actual = "Bing";
	  String expected = "Bing";
	  assertEquals(actual, expected);
	  extentTest.pass("Pass");
	  TakesScreenshot screenshot= (TakesScreenshot) driver;
	  File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
	  File file=new File("bing.png");
	  FileUtils.copyFile(srcFile, file);
	  extentTest.addScreenCaptureFromPath("bing.png");
	  }
	@Test
	public void openGoogle() throws IOException {
		extentTest = extentReports.createTest("Verify google");
		driver.get("https://www.google.com/");
		String actual = "Google";
		String expected = "Google";
		assertEquals(actual, expected);
		extentTest.pass("Pass");
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		File file = new File("google.png");
		FileUtils.copyFile(srcFile, file);
		extentTest.addScreenCaptureFromPath("google.png");
	}
	@Test
	public void openYahoo() throws IOException {
		extentTest = extentReports.createTest("Verify yahoo");
		driver.get("https://in.yahoo.com/");
		String actual = "Yahoo India | News, Finance, Cricket, Lifestyle and Entertainment";
		String expected = "Yahoo";
		assertNotEquals(actual, expected);
		extentTest.pass("Fail");
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		File file = new File("yahoo.png");
		FileUtils.copyFile(srcFile, file);
		extentTest.addScreenCaptureFromPath("yahoo.png");
	}
	@AfterTest
	public void closeBrowser() {
		extentReports.flush();
		driver.quit();

	}
}
