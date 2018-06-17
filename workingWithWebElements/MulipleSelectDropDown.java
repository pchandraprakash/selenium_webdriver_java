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
import org.openqa.selenium.support.ui.Select;

class MulipleSelectDropDown {
	WebDriver driver;
	String baseUrl;

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "http://toolsqa.com/automation-practice-form/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}
	
	@Test
	void selectAll() throws InterruptedException {
		driver.get(baseUrl);
		WebElement mdd = driver.findElement(By.xpath(".//select[@id='selenium_commands']"));
		Select s1 = new Select((WebElement) mdd);
		for(int i=0; i<5; i++) {
			Thread.sleep(1000);
			s1.selectByIndex(i);
		}
		
		for (WebElement options: s1.getAllSelectedOptions())
		{
			System.out.println(options.getText());
		}
		
		//de-selecting all the selected elements
		for(int i=0; i<5; i++) {
			Thread.sleep(1000);
			s1.deselectByIndex(i);
		}
	}
	
	@Test
	void selectSome() throws InterruptedException {
		driver.get(baseUrl);
		WebElement mdd = driver.findElement(By.xpath(".//select[@id='selenium_commands']"));
		Select s1 = new Select(mdd);
		s1.selectByIndex(0);
		Thread.sleep(1000);
		s1.selectByVisibleText("Switch Commands");
	}
	
	@AfterEach
	void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}