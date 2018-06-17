package workingWithWebElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class ListOfElements {
	WebDriver driver;
	String baseUrl;
	
	@BeforeEach
	void setUp() throws Exception {
		baseUrl = "https://learn.letskodeit.com/p/practice";
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	void test() throws InterruptedException {
		driver.get(baseUrl);
		boolean isChecked = false;
		List<WebElement> radioButtons = driver.findElements(By.xpath(".//input[contains(@type,'radio') and contains(@name,'cars')]"));
		int count = radioButtons.size();
		for(int i = 0; i < count; i++) {
			isChecked = radioButtons.get(i).isSelected();
			if(!isChecked) {
				radioButtons.get(i).click();
				Thread.sleep(5000);
			}
		}
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

}
