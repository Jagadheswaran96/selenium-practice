package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OracleLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://onepluscare.custhelp.com/cgi-bin/onepluscare.cfg/php/sso/saml2/idp/get_token.php?success=https%3A%2F%2Foneplus."
				+ "custhelp.com%2FAgentWeb%2Flogin&logout=https%3A%2F%2Foneplus.custhelp.com%2FAgentWeb%2Flogout&return_path=%2F&osvr=eUVwDY4edubQ4EH%7E2RERav_s"
				+ "YONapKL1likN1mhKlo5W7ieaMDJpAwrVQkc3hApRw7hJMlFMBroF_X9eqYazweeQD46iPh9r6janN6ez_ASFsW3v41UpXN9w%21%21&intf=2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("vjagadheswaran.v@concentrix.com");
		driver.findElement(By.id("password")).sendKeys("Voracle@90");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("initialsText")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("ui-id-29")).click();
	}

}
