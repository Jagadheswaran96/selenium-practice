package selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResizeBrowser {
    @Test
    public void launchBrowser() {
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.softwaretestingmaterial.com");
        System.out.println(driver.manage().window().getSize());
        //Create object of Dimensions class
        Dimension d = new Dimension(480,620);
        //Resize the current window to the given dimension
        driver.manage().window().setSize(d);
        System.out.println(driver.manage().window().getSize());
        Set<Cookie> cookie = driver.manage().getCookies();
        System.out.println(cookie);
        driver.manage().deleteAllCookies();
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies);
     }
}