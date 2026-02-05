package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/learn.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> Allcheckbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		int size=Allcheckbox.size();

		for (int i = 0; i < size; i++) {
			WebElement check=Allcheckbox.get(i);
			check.click();
			if (check.isSelected()) {
				System.out.println("true");
			}
		}

		//driver.quit();

	}

}
