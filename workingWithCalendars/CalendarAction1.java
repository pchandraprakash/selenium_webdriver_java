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

class CalendarAction1 {
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
	void test1() {
		//through xpath
		driver.get(baseUrl);
		driver.findElement(By.id("package-departing-hp-package")).click();
		driver.findElement(By.xpath(".//div[@class='datepicker-cal-month'][position()=1]//button[text()='30']")).click();
	}
	
	@Test
	void test2() {
		//using send keys if we know the date format.
		driver.get(baseUrl);
		driver.findElement(By.id("package-departing-hp-package")).sendKeys("06/30/2018");
	}
	
	@Test
	void test3() {
		//using send keys if we know the date format.
		driver.get(baseUrl);
		driver.findElement(By.id("package-departing-hp-package")).click();
		WebElement element = driver.findElement(By.xpath(".//div[@class='datepicker-cal-month'][position()=1]"));
		List<WebElement> validDates = element.findElements(By.tagName("button"));
		for (WebElement date: validDates) {
			if(date.getText().equals("30")) {
				date.click();
				break;
			}
		}
	}
	
	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

}
