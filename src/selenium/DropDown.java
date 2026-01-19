package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/");
		driver.navigate().refresh();
		WebElement dropdownBox = driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[5]"));
		dropdownBox.click();
		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropDown1);
		List<WebElement> allOptions = select.getOptions();
		for(WebElement options : allOptions) {
			String option = options.getText();
			System.out.println(option);
		}
		select.selectByIndex(1);
		select.selectByValue("0");
		select.selectByVisibleText("UFT/QTP");
		Thread.sleep(2000);
		driver.close();
	}

}
