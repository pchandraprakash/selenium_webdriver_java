package handlingJavaScript;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class WebPageScroll {
	private WebDriver driver;
	private JavascriptExecutor js;

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		js = (JavascriptExecutor)driver;
	}

	@Test
	void test() throws InterruptedException {
		js.executeScript("window.location = 'https://learn.letskodeit.com/p/practice';");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 1900)"); //scroll down
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -1900)"); //scroll up
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("mousehover"));
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -190)");
		
	}
	
	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

}
