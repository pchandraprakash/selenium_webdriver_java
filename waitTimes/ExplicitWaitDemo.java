package waitTimes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class ExplicitWaitDemo {
	private WebDriver driver;
	private String baseUrl;
	

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";
		driver.manage().window().maximize();
	}
	
	@Test
	void test() {
		driver.get(baseUrl);
		driver.findElement(By.xpath(".//a[@href=\"/sign_in\"]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
		element.sendKeys("testmail.com");
	}
	
	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}


}
