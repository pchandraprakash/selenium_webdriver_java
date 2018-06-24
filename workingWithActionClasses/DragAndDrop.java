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

class DragAndDrop {
	WebDriver driver;
	String baseUrl;
	
	@BeforeEach
	void setUp() throws Exception {
		baseUrl = "https://jqueryui.com/droppable/";
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}
	
	@Test
	void test1() throws InterruptedException {
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement dragMeItem = driver.findElement(By.id("draggable"));//source element
		WebElement dropHereItem = driver.findElement(By.id("droppable"));//target element
		
		Actions action = new Actions(driver);
		
		//drag and drop
		Thread.sleep(2000);
		action.dragAndDrop(dragMeItem, dropHereItem).perform();
	}
	
	@Test
	void test2() throws InterruptedException {
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement dragMeItem = driver.findElement(By.id("draggable"));//source element
		WebElement dropHereItem = driver.findElement(By.id("droppable"));//target element
		
		Actions action = new Actions(driver);
		
		//click and hold, move to element, release, build and perform
		Thread.sleep(2000);
		action.clickAndHold(dragMeItem).moveToElement(dropHereItem).release().build().perform();
	}

	@AfterEach
	void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	
}
