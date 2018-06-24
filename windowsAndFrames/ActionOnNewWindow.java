package windowsAndFrames;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class ActionOnNewWindow {
	WebDriver driver;
	String baseUrl;

	@BeforeEach
	void setUp() throws Exception {
		baseUrl = "https://learn.letskodeit.com/p/practice";
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	void test() throws InterruptedException {
		// go to the page
		driver.get(baseUrl);

		// get parent window handle
		String parentHandle = driver.getWindowHandle();
		System.out.println("Parent Window Handle: " + parentHandle);

		// identify the object which opens a new window
		WebElement window = driver.findElement(By.id("openwindow"));
		window.click();

		// get all the window handles
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			System.out.println(handle);
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle); // switch the focus
				driver.manage().window().maximize();
				Thread.sleep(3000);
				// perform an action on the new window
				WebElement searchBox = driver.findElement(By.id("search-courses"));
				searchBox.sendKeys("python");
				driver.findElement(By.id("search-course-button")).click();
				Thread.sleep(5000);
				driver.close();
				break;
			}
		}
		// Switching back to parent window
		driver.switchTo().window(parentHandle);
		driver.findElement(By.id("bmwradio")).click();
		Thread.sleep(3000);
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

}
