package selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		driver.findElement(By.xpath("//*[@id=\"onward_cal\"]")).click();
		driver.findElement(By.xpath("//td[contains(@class,'current day')]")).click();
		
	}

}
