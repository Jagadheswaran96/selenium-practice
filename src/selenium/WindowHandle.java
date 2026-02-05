package selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {
	public static void main(String[] args) throws Exception {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Load the website
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// It will return the parent window name as a String
		String parent = driver.getWindowHandle();
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("PopUp")));
		
		WebElement openWindows = driver.findElement(By.id("PopUp"));
		openWindows.click();
		
		Set<String> windows = driver.getWindowHandles();

		for (String win : windows) {
		    driver.switchTo().window(win);
		    System.out.println(driver.getTitle());
		}

		// Close child windows only
		for (String win : windows) {
		    if (!win.equals(parent)) {
		        driver.switchTo().window(win);
		        driver.close();
		    }
		}

		// Go back to parent
		driver.switchTo().window(parent);

		// Small wait to let WebSocket finish
		Thread.sleep(1000);

		// Close everything cleanly
		driver.quit();
	}
}
