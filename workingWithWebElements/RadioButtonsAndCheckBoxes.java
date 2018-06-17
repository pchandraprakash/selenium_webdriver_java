package workingWithWebElements;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class RadioButtonsAndCheckBoxes {
	WebDriver driver;
	String baseUrl;

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	void checkTextBox() throws InterruptedException {
		driver.get(baseUrl);
		driver.findElement(By.xpath(".//input[@id='bmwcheck']")).click();
		Thread.sleep(5000);
	}
	
	@Test
	void checkRadioButton() throws InterruptedException {
		driver.get(baseUrl);
		driver.findElement(By.xpath(".//input[@id='bmwradio']")).click();
		Thread.sleep(5000);
	}
	
	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

}
