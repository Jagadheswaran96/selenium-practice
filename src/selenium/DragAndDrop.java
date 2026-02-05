package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));

		WebElement element1 = driver.findElement(By.xpath("//h1[contains(text(),'Block 1')]"));
		WebElement element2 = driver.findElement(By.xpath("//h1[contains(text(),'Block 4')]"));

		Actions actions = new Actions(driver);
		actions.dragAndDrop(element1, element2).perform();
	}

}
