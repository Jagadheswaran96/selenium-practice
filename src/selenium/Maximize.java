package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Maximize {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\chromedriver.exe");

		//3rd way using ChromeOptions by creating an object for that only working with Chrome browser
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.get("https://google.com");

		//1st way using maximize() method
		/*driver.manage().window().maximize();
		driver.get("https://google.com");*/

		//2nd way using selenium's dimension() method, for that, we need an object for dimension class
		/*Dimension dimension=new Dimension(500, 500);
		driver.manage().window().setSize(dimension);
		driver.get("https://google.com");*/

	}

}
