package keyPressEvents;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class CombinationOfKeys {
	WebDriver driver;
	String baseUrl;

	@BeforeEach
	void setUp() throws Exception {
		baseUrl = "https://learn.letskodeit.com/p/practice";
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@Test
	void testWithoutChord() throws InterruptedException {
		driver.findElement(By.id("bmwradio")).sendKeys(Keys.CONTROL + "a"); //"a" is small case not upper case.
		Thread.sleep(2000);
	}
	
	@Test
	void testWithChord() throws InterruptedException {
		driver.findElement(By.id("bmwradio")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
		Thread.sleep(2000);
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

}
