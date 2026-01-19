package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintLinkCount {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://krninformatix.com/");
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int size=links.size();
		System.out.println(size);
		/*for (int i = 0; i < links.length; i++) {
			
		}*/
	}

}
