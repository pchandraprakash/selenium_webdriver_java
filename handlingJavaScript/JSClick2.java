package handlingJavaScript;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class JSClick2 {
	private WebDriver driver;
	private JavascriptExecutor js;

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		js = (JavascriptExecutor)driver;
	}

	@Test
	void testUsingSelenium() throws InterruptedException {
		driver.get("https://www.retailmenot.com/");
		driver.findElement(By.xpath(".//div[text()='Log In / Sign up']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.id(".//label[@class='input-checkbox-label ']")).click();
		driver.findElement(By.id("subscribe")).click();
		Thread.sleep(3000);
	}
	
	@Test
	void testUsingJS() throws InterruptedException {
		js.executeScript("window.location = 'https://www.retailmenot.com/';");
		driver.findElement(By.xpath(".//div[text()='Log In / Sign up']")).click();
		Thread.sleep(13000);
		WebElement checkBox = driver.findElement(By.id("subscribe"));
		js.executeScript("arguments[0].click()", checkBox);
		Thread.sleep(3000);
	}
	
	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

}
