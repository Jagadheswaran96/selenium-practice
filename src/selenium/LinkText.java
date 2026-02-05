package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("incognito");
		chrome.addArguments("disable-infobars");
		chrome.addArguments("start-maximized");
		chrome.addArguments("version");
		WebDriver driver = new ChromeDriver(chrome);
		driver.navigate().to("https://www.w3schools.com/sql/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("window.scrollBy(0,4000)", "");
		List<WebElement> references = driver.findElements(By.xpath("//div[@class='w3-col l3 m6 s12'][2]//a"));
		int size = references.size();
		for(int i=0; i<size; i++){
		WebElement allLinks = references.get(i);
		String linksText = allLinks.getText();
		System.out.println(linksText);
		}
		int threadCount = Thread.activeCount();
		System.out.println(threadCount);
		Thread.sleep(2000);
		driver.quit();

	}

}
