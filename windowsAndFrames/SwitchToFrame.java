package windowsAndFrames;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SwitchToFrame {
	WebDriver driver;
	String baseUrl;

	@BeforeEach
	void setUp() throws Exception {
		baseUrl = "https://learn.letskodeit.com/p/practice";
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	void test() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);
		/*//identify frame by using index
		driver.switchTo().frame(0);*/
		//identfiy frame using id/name
		//driver.switchTo().frame("courses-iframe");//id
		driver.switchTo().frame("iframe-name");//name
		Thread.sleep(2000);
		driver.findElement(By.name("query")).sendKeys("python");
		driver.findElement(By.id("search-course-button")).click();
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

}
