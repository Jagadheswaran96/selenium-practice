Selenium Concepts 🚀

This repository contains examples and notes on Selenium 4 concepts, useful for interview preparation and automation practice.

📌 Core Components of Selenium
Selenium IDE – Record & playback tool.
Selenium WebDriver – Most important component; interacts directly with browsers.
Selenium Grid – Parallel/distributed test execution.

📸 Screenshots
Entire Page:
File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
Specific WebElement (Selenium 4):

java WebElement element = driver.findElement(By.id("logo")); File screenshot = element.getScreenshotAs(OutputType.FILE);

🧭 Locators By ID: driver.findElement(By.id("username"));

By Name: driver.findElement(By.name("password"));

By Class: driver.findElement(By.className("btn"));

By CSS Selector: driver.findElement(By.cssSelector("h1.title"));

By XPath: driver.findElement(By.xpath("//h1[@class='title']"));

🆕 Selenium 4 Features

Relative Locators:
driver.findElement(RelativeLocator.with(By.tagName("button")).above(referenceElement)); Keywords: above(), below(), toLeftOf(), toRightOf(), near()

W3C WebDriver Standard – Better browser compatibility.

DevTools Protocol (CDP) Integration – Network interception, console logs, geolocation mocking.

Window/Tab Management: driver.switchTo().newWindow(WindowType.TAB); driver.switchTo().newWindow(WindowType.WINDOW);

⏳ Waits Implicit Wait: driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

Explicit Wait: WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

🌐 XPath Tips Union Operator: //book | //author → selects dissimilar nodes. Sibling Axes: following-sibling::div preceding-sibling::div

⚙️ Selenium Grid 4 Distributed architecture. Supports Docker. Observability & scalability improvements.

📚 Interview Nuggets Most important Selenium component → WebDriver Screenshot of element → getScreenshotAs() Relative locators → above(), below(), toLeftOf(), toRightOf(), near() XPath union operator → |

🔗 References

Selenium Official Docs (https://www.selenium.dev/documentation/)

WebDriverManager (https://bonigarcia.dev/webdrivermanager/ & https://github.com/bonigarcia/webdrivermanager)