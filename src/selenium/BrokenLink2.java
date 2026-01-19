package selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/");
		//driver.get("https://www.techwalla.com/articles/how-to-recognize-a-fake-url");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (WebElement link : links) {
			String href = link.getAttribute("href");
			URL url = new URL(href);
			URLConnection urlConnecion = url.openConnection();
			HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnecion;
			httpURLConnection.setConnectTimeout(3000);
			httpURLConnection.connect();
			if (httpURLConnection.getResponseCode()==200) {
				System.out.println(href+httpURLConnection.getResponseCode()+httpURLConnection.getResponseMessage());
			}else
				System.err.println(href+httpURLConnection.getResponseCode()+httpURLConnection.getResponseMessage());
		}
	}

}
