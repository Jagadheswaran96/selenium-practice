package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuDropDowns {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement menu = driver.findElement(By.xpath("//span[text()='Courses Offered']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(menu).perform();
		actions.contextClick(menu).perform();
		actions.sendKeys(Keys.ARROW_DOWN).perform();
		actions.sendKeys(Keys.ENTER).perform();
		/*actions.sendKeys("T").perform();
		actions.sendKeys("W").perform();*/

	}

}
