package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Refresh {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("jagadhes");
		
		//one way
		//driver.navigate().refresh();
		
		//2n way
		//driver.get(driver.getCurrentUrl()); 
			
		//3rd way using javascript executor interface
		/*JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("location.reload()");
		*/
		
		//2nd option in 3rd way
		/*JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("history.go(0)");*/
		
		//4th way using robot class
		/*try {
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		}
		catch (Exception e){
			
		}*/
		//5th way sending F5 key
		driver.findElement(By.name("q")).sendKeys(Keys.F5);
		
		//driver.quit();
		
	}

}
