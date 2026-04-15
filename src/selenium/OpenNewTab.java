package selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenNewTab {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String parentWindow = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parentWindow);
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		// It will throw SocketException when using driver.close()
		driver.quit();

	}

}
