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

class SwitchWindowFocus {
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
	void test() {
		//go to the page
		driver.get(baseUrl);
		
		//get parent window handle
		String parentHandle = driver.getWindowHandle();
		System.out.println("Parent Window Handle: " + parentHandle);
		
		//identify the object which opens a new window
		WebElement window = driver.findElement(By.id("openwindow"));
		window.click();
		
		//get all the window handles
		Set<String> handles = driver.getWindowHandles();
		for(String handle: handles) {
			System.out.println(handle);
		}
			
 		
		/*//perform an action on the new window
		WebElement searchBox = driver.findElement(By.id("search-courses"));
		searchBox.sendKeys("python");*/
		
	}
	
	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

}
