package commonMethodsAndProperties;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class GetTextOfElement {
	WebDriver driver;
	String baseUrl;

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://www.expedia.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}
	

	@Test
	void test() {
		driver.get(baseUrl);
		WebElement e1 = driver.findElement(By.xpath(".//a[@id='primary-header-package']"));
		String text1 = e1.getText();
		System.out.println(text1);
	}

	
	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}
}
