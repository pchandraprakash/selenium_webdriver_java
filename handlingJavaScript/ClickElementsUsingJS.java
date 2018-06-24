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

class ClickElementsUsingJS {
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
	void test() {
		js.executeScript("window.location = 'https://learn.letskodeit.com/p/practice';");
		WebElement checkBox = driver.findElement(By.id("bmwcheck"));
		js.executeScript("arguments[0].click()", checkBox);
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

}
