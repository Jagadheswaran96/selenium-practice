package selenium;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeBrowser {

	public static void main(String[] args) {

		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Jagadhez\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		WebDriverManager.edgedriver().setup();

		//WebDriverManager.edgedriver().browserVersion("X.X.X").setup();

        EdgeOptions options = new EdgeOptions();

        options.addArguments(
            "user-data-dir=C:\\Users\\Jagadhez\\AppData\\Local\\Microsoft\\Edge\\User Data");

        //DesiredCapabilities capabilities = DesiredCapabilities.edge();

        //capabilities.setCapability("useAutomationExtension", false);

        //options.merge(capabilities);

        options.addArguments("profile-directory=Profile 1");
        options.addArguments("--start-maximized","--remote-allow-origins=*");
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
		options.setPageLoadStrategy(PageLoadStrategy.NONE);

		Map<String, Object> pref = new HashMap<>();
		pref.put("credentials_enable_service", false);
		pref.put("profile.password_manager_enabled", false);
		pref.put("profile.default_content_setting_values.notifications", Integer.valueOf(2));
		pref.put("Browser.setDownloadBehavior", "allow");
		pref.put("download.default_directory", "C:\\Users\\Jagadhez\\Downloads");

		options.setExperimentalOption("prefs", pref);

		WebDriver driver = new EdgeDriver(options);

		driver.get("https://carriercentral.amazon.com/");
	}

}
