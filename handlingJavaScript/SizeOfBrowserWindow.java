package handlingJavaScript;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SizeOfBrowserWindow {
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
		long height = (long) js.executeScript("return window.innerHeight;");
		long width = (long) js.executeScript("return window.innerWidth;");
		System.out.println("Height of the browser window: " + height);
		System.out.println("Width of the browser window: " + width);
	}
	
	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

}
