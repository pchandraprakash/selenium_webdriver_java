package workingWithWebElements;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class BasicActions {
	WebDriver driver;
	String baseUrl;
	
	@BeforeEach
	void setUp() throws Exception {
		baseUrl = "https://learn.letskodeit.com/p/practice";
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	void test() {
		driver.get(baseUrl);
		driver.findElement(By.id("bmwcheck")).click();
		driver.findElement(By.id("bmwradio")).click();
		driver.findElement(By.name("enter-name")).sendKeys("test automation");
		driver.findElement(By.name("enter-name")).clear();
	}
	
	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}
	
}
