package selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/selenium/testing.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("dblClkBtn"))).doubleClick().build().perform();		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Generate Alert Box')]")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
