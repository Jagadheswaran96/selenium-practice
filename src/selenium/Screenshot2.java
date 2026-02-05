package selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		WebElement searchBar = driver.findElement(By.name("q"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].value='jagadhes'", searchBar);
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch(Exception e) {

		} finally {
			driver.navigate().back();
			driver.navigate().forward();
			try {
				driver.get("https://stackoverflow.com/");
				driver.navigate().back();
			} catch(Exception e){

			} finally {
				TakesScreenshot screenshot = (TakesScreenshot) driver;
				File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
				File file = new File("screenshot.png");
				try {
					FileUtils.copyFile(srcFile, file);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
