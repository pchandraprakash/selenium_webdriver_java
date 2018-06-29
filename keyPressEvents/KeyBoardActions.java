package keyPressEvents;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class KeyBoardActions {
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
	void test() {
		driver.findElement(By.xpath(".//a[@href='/sign_in']")).click();
		driver.findElement(By.id("user_email")).sendKeys("test@email.com");
		driver.findElement(By.id("user_email")).sendKeys(Keys.TAB);
		driver.findElement(By.id("user_password")).sendKeys("password");
		driver.findElement(By.name("commit")).sendKeys(Keys.ENTER);
	}
	

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

}
