package workingWithCalendars;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class AutoComplete {
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
	void test() throws InterruptedException {
		//using send keys if we know the date format.
		driver.get(baseUrl);
		Thread.sleep(5000);
		String partialText = "new";
		String searchingText = "Delhi (DEL-Indira Gandhi Intl.) near New Delhi, India";
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(partialText);
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(".//div[@class='display-group-results']"));
		Thread.sleep(3000);
		List<WebElement> cities = element.findElements(By.tagName("li"));
		int size = cities.size();
		System.out.println(size);
		Thread.sleep(3000);
		for (WebElement result: cities) {
			System.out.println(result.getText());
			if(result.getText().equals(searchingText)) {
				result.click(); 
				break;
			}
		}
	}
	
	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}
}
