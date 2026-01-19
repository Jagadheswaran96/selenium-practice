package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("start-maximized");
		ChromeDriver driver = new ChromeDriver(chrome);
		driver.get("http://www.leafground.com/");
		WebElement hyperLink = driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[3]"));
		hyperLink.click();
		WebElement homePage = driver.findElement(By.xpath("(//a[contains(text(),'Go to Home Page')])[1]"));
		homePage.click();
		driver.navigate().back();
		WebElement where = driver.findElement(By.xpath("//a[contains(text(),'Find')]"));
		String href = where.getAttribute("href");
		System.out.println("navigating to" + " " + href);
		WebElement verify = driver.findElement(By.xpath("//a[contains(text(),'Verify am I broken?')]"));
		verify.click();
		String title = driver.getTitle();
		if (title.contains("404")) {
			System.out.println("it is broken link");
		}else {
			System.out.println("it is not broken link");
		}
		driver.navigate().back();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = links.size();
		System.out.println("total number of links are" + " " + count);
	}

}
