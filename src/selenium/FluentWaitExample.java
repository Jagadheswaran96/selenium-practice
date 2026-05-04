package selenium;

import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitExample {
    public static void main(String[] args) {
    	
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        // Define FluentWait
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))       // max wait time
                .pollingEvery(Duration.ofSeconds(2))       // check every 2 seconds
                .ignoring(NoSuchElementException.class);   // ignore missing element errors

        // Use FluentWait with a custom condition
        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement el = driver.findElement(By.id("finish"));
                if (el.isDisplayed()) {
                    return el;
                }
                return null;
            }
        });

        System.out.println("Element text: " + element.getText());
        driver.quit();
    }
}