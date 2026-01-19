package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement menu = driver.findElement(By.className("//i[@class='pi pi-server layout-menuitem-icon']"));
		menu.click();
		driver.findElement(By.xpath("//label[text()='Javascript']/../../td[3]/div")).click();
	}

}
////span[text()='Element'][1]
//i[@class=pi pi-server layout-menuitem-icon]
////label[text()='Javascript']/../../td[3]/div
