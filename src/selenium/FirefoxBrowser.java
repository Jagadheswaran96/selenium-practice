package selenium;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;


public class FirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {

		String browserPath = "C:\\Users\\Jagadhez\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", browserPath);

		String profilePath = "C:\\Users\\Jagadhez\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\8s6df0ag.Jagdhes";
//
//        FirefoxProfile profile = new FirefoxProfile(new java.io.File(profilePath));
//
//        FirefoxOptions options = new FirefoxOptions();
//        options.setProfile(profile);
//
//        WebDriver driver = new FirefoxDriver(options);
//
//        Thread.sleep(15000);
//        driver.findElement(By.xpath("//span[text()='Downloads']")).click();
//        System.out.println("clicked");
//        driver.quit();

//		ProfilesIni profileIni = new ProfilesIni();
//        FirefoxProfile profile = profileIni.getProfile("Jagdhes"); //FirefoxAutomation
//
//        FirefoxOptions options = new FirefoxOptions();
//        options.setProfile(profile);
//
//        WebDriver driver = new FirefoxDriver(options);

		//FirefoxOptions options = new FirefoxOptions();

		//options.addArguments({"args": ["-profile", "/path/to/your/profile"]});

		DesiredCapabilities capabilities = new DesiredCapabilities();
		FirefoxProfile profile = new FirefoxProfile(new File(profilePath));
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);
		capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	}

}
