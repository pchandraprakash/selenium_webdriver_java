package workingWithWebElements;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class WebElementState {
	WebDriver driver;
	String baseUrl;

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		baseUrl = "https://www.google.com/";
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@Test
	void test() {
		WebElement e1 = driver.findElement(By.id("gs_taif0"));
		System.out.println("is element e1 enabled? "+ e1.isEnabled());
		if(e1.isEnabled()==true) {
			e1.sendKeys("letskodeit");
		}
		else
			System.out.println("element e1 is not enabled");
		
		WebElement e2 = driver.findElement(By.id("gs_htif0"));
		System.out.println("is element e2 enabled? "+ e2.isEnabled());
		if(e2.isEnabled()==true) {
			e2.sendKeys("letskodeit");
		}
		else
			System.out.println("element e2 is not enabled");
		
		WebElement e3 = driver.findElement(By.id("lst-ib"));
		System.out.println("is element e3 enabled? "+ e3.isEnabled());
		if(e3.isEnabled()==true) {
			e3.sendKeys("letskodeit");
		}
		else
			System.out.println("element e3 is not enabled");
	}
	
	
	
	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

}
