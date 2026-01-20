package selenium;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload {
	
	public static WebDriver driver;
	
	public boolean isFileDownloaded(String downloadPath, String fileName) {
		File dir = new File("C:\\Users\\Jagadhez\\Downloads");
		File[] dirContents = dir.listFiles();
		for (int i = 0; i < dirContents.length; i++) {
			if (dirContents[i].getName().equals(fileName)) {
				// File has been found, it can now be deleted:
				dirContents[i].delete();
				return true;
			}
		}
		return false;
	}

	public void toDownload() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/test-on-the-right-mobile-devices");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("accept-cookie-notification")).click();
		driver.findElement(By.xpath("//a[@class='icon-csv']")).click();
		System.out.println("file is downloaded now");
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		String fileName = "BrowserStack - List of devices to test on.csv";
		FileDownload fileDownload=new FileDownload();
		if(fileDownload.isFileDownloaded("C:\\\\Users\\\\Jagadhez\\\\Downloads", fileName)) {
			System.out.println("file is deleted");
		}else
			System.out.println("not existing");
			fileDownload.toDownload();
		//to minimize window
		//driver.manage().window().setPosition(new Point(0, -2000));
	}
}