package selenium;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser {

	public static void main(String[] args) {

			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();

			Map<String, Object> prefs = new HashMap<>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			prefs.put("profile.default_C:\\Users\\Jagadhez\\AppData\\Local\\Programs\\Operacontent_setting_values.notifications", Integer.valueOf(2));
			prefs.put("Browser.setDownloadBehavior", "allow");
			prefs.put("download.default_directory", "C:\\Users\\Jagadhez\\Downloads");

			options.setExperimentalOption("useAutomationExtension", false);
			options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
			options.setPageLoadStrategy(PageLoadStrategy.NONE);

			options.setCapability("prefs", prefs);
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://google.com/");
	}
}
