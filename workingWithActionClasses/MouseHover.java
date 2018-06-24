package workingWithActionClasses;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class MouseHover {
	WebDriver driver;
	String baseUrl;
	JavascriptExecutor jse;
	
	@BeforeEach
	void setUp() throws Exception {
		baseUrl = "https://learn.letskodeit.com/p/practice";
		driver = new ChromeDriver();
		jse = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}
	
	@Test
	void withoutActionClass() throws InterruptedException {
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		driver.findElement(By.id("mousehover")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//a[@href='#top']")).click();
		Thread.sleep(2000);
	}
	
	@Test
	void withActionClass() throws InterruptedException {
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		WebElement mouseHover = driver.findElement(By.id("mousehover"));
		Actions action = new Actions(driver);
		action.moveToElement(mouseHover).perform();
		Thread.sleep(2000);
		WebElement subElement = driver.findElement(By.xpath(".//a[@href='#top']"));
		action.moveToElement(subElement).click().perform();
		Thread.sleep(2000);
	}
	
	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

}
