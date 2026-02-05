package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MenuDropDowns2 {

	public static void main(String[] args){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement Branches = driver.findElement(By.xpath("//span[text()='Branches']"));
		WebElement Marathahalli = driver.findElement(By.xpath("//span[text()='Marathahalli']"));
		WebElement in_Marathahalli = driver.findElement(By.xpath("//a[contains(text(),'Selenium-Training-in-Marathahalli')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Branches).moveToElement(Marathahalli).moveToElement(in_Marathahalli).build().perform();
		actions.contextClick(in_Marathahalli).build().perform();
		actions.sendKeys("T").perform();
	}

}
