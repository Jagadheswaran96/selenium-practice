package selenium;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//two ways to take screenshot
		//1.using takes screenshot
		//2.robot class
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		
		// two ways to copy file
		//1.using file class of java
		//2. using file handler of Selenium
		File file2 = new File("C:\\Users\\Jagadhez\\OneDrive\\Desktop\\screenshot.png");
		FileUtils.copyFile(file, file2);
		
		try {
			Robot robot=new Robot();
			Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle rectangle=new Rectangle(screenSize);
			BufferedImage screenShot=robot.createScreenCapture(rectangle);
			File file3=new File("C:\\Users\\Jagadhez\\OneDrive\\Desktop\\SCREENSHOT.png");
			ImageIO.write(screenShot, "png", file3);
		} catch (Exception e) {
			
		}
		driver.quit();
	}

}