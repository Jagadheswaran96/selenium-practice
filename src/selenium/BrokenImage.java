package selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenImage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Image.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement image = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
		if (image.getAttribute("naturalWidth").equals("0")) {
			System.out.println("this is brokn image");
		}else {
			System.out.println("this is not broken image");
		}
		driver.quit();
		
	}

}
