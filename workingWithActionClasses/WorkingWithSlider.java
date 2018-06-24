package workingWithActionClasses;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class WorkingWithSlider {
	WebDriver driver;
	String baseUrl;
	
	@BeforeEach
	void setUp() throws Exception {
		baseUrl = "https://jqueryui.com/slider/";
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@Test
	void test() throws InterruptedException {
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));
	
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.dragAndDropBy(slider, 50, 0).perform();
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}
	
}
