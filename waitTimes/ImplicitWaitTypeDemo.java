package waitTimes;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ImplicitWaitTypeDemo {
	private WebDriver driver;
	private String baseUrl;
	

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}

	@Test
	void test() {
		driver.get(baseUrl);
		driver.findElement(By.xpath(".//a[@href=\"/sign_in\"]")).click();
		driver.findElement(By.id("user_email")).sendKeys("testmail.com");
	}
	
	@AfterEach
	void tearDown() {
		driver.quit();
	}

}
