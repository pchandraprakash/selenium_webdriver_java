package waitTimes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class ExplicitWaitUtilityDemo {
	private WebDriver driver;
	private String baseUrl;
	WaitTypeUtility wt;
	

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";
		wt = new WaitTypeUtility(driver);
		driver.manage().window().maximize();
	}
	
	@Test
	void test() {
		driver.get(baseUrl);
		driver.findElement(By.xpath(".//a[@href=\"/sign_in\"]")).click();
		WebElement element = wt.waitForElement(By.id("user_email"), 3);
		element.sendKeys("testmail.com");
		
		wt.clickWhenReady(By.name("commit"), 3);
	}
	
	@AfterEach
	void tearDown() throws Exception {
		//driver.quit();
	}


}
