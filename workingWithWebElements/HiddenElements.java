package workingWithWebElements;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class HiddenElements {
	WebDriver driver;
	String baseUrl1;
	String baseUrl2;

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl1 = "https://www.expedia.com/";
		baseUrl2 = "https://learn.letskodeit.com/p/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}
	
	@Test
	void testExpedia() throws InterruptedException {
		driver.get(baseUrl1);
		WebElement checkBox = driver.findElement(By.xpath(".//select[@id='package-advanced-preferred-class-hp-package']"));
		System.out.println("is checkbox enabled? " + checkBox.isDisplayed());
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//a[@id='flight-advanced-options-hp-flight']"));
		System.out.println("is checkbox enabled? " + checkBox.isDisplayed());
	}
	
	@Test
	void testLetsKodeIt() throws InterruptedException {
		driver.get(baseUrl2);
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		System.out.println("is the textbox active?: " + textbox.isDisplayed());
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(2000);
		System.out.println("is the textbox active?: " + textbox.isDisplayed());
		driver.findElement(By.id("show-textbox")).click();
		Thread.sleep(2000);
		System.out.println("is the textbox active?: " + textbox.isDisplayed());
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	

}
