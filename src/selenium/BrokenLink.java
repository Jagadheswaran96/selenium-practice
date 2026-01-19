package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {

	public static void main(String[] args) throws IOException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		//driver.get("https://www.techwalla.com/articles/how-to-recognize-a-fake-url");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int totalLinks = allLinks.size();
		System.out.println("total liks are" + " " + totalLinks);
		for (WebElement links : allLinks) {
			String href = links.getAttribute("href");
			URL url;
			try {
				url = new URL(href);
				URLConnection urlConnection = url.openConnection();
				HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
				httpURLConnection.setConnectTimeout(3000);
				httpURLConnection.connect();
				if (httpURLConnection.getResponseCode()==200) {
					System.out.println(href + "-" + "it is valid link" + "-" + httpURLConnection.getResponseCode() 
					+ "-" + httpURLConnection.getResponseMessage());
				}else
					System.err.println(href + "-" + "it is invalid link" + "-" + httpURLConnection.getResponseCode() 
					+ "-" + httpURLConnection.getResponseMessage());
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
