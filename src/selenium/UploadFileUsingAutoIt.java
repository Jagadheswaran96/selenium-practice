package selenium;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileUsingAutoIt {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		By chooseSingleFile = By.id("singleFileInput");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(chooseSingleFile));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(driver.findElement(By.id("singleFileInput"))).click().perform();
		
		
		String autoItScriptPath = "C:\\Users\\Jagadhez\\OneDrive\\Desktop\\AutoItScriptForUploadFile.exe";
		String uploadFilePath = "C:\\Users\\Jagadhez\\OneDrive\\Desktop\\Upload with AutoIt.txt";
		
		// Create a File object 
		File file = new File(uploadFilePath); 		
		// Get the file name with extension 
		String expectedFileName = file.getName(); 
		System.out.println("File name: " + expectedFileName);
		
		Runtime.getRuntime().exec(new String[] {autoItScriptPath, uploadFilePath});
		
		Thread.sleep(15000);
		actions.moveToElement(driver.findElement(By.xpath("//button[@type='submit' and text()='Upload Single File']"))).click().perform();
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		String uploadedFilePath = (String) js.executeScript( "return document.getElementById('singleFileInput').value;" ); 
		System.out.println("File path from input: " + uploadedFilePath);
		
		String actualFileName = uploadedFilePath.substring(uploadedFilePath.lastIndexOf("\\") + 1);
		System.out.println("File name: " + actualFileName);
		
		Boolean result = actualFileName.equals(expectedFileName);
		if (result) {
			System.out.println("File is uploaded successfully");
		} else {
			throw new FileNotFoundException();
		}
		
		driver.quit();
	}

}
