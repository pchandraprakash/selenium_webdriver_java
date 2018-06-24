package windowsAndFrames;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JavaScriptPopUp {
	WebDriver driver;
	String baseUrl;
	
	@BeforeEach
	void setUp() throws Exception {
		baseUrl = "https://learn.letskodeit.com/p/practice";
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@Test
	void testAlertPopUp() throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys("Phanindra");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	
	@Test
	void testConfirmPopUp() throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys("Phanindra");
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Phanindra");
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		String alertText = driver.switchTo().alert().getText();
		System.out.println("alert text message: " + alertText);
		driver.switchTo().alert().dismiss();
		//Alert alert = driver.switchTo().alert(); //creating an alert element using Alert api from selenium
		
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

}
