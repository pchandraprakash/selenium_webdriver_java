package workingWithWebElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class DropDownElement {
	WebDriver driver;
	String baseUrl;

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "http://automationpractice.com/index.php";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	void test() throws InterruptedException {
		driver.get(baseUrl);
		driver.findElement(By.xpath(".//a[@title='Women']")).click();
		Thread.sleep(5000);
		WebElement dropDowm = driver.findElement(By.xpath(".//select[@id='selectProductSort']"));
		Select sel = new Select(dropDowm);
		Thread.sleep(2000);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByValue("name:desc");
		Thread.sleep(2000);
		sel.selectByVisibleText("Reference: Highest first");
		Thread.sleep(2000);
		
		List<WebElement> s1 = sel.getOptions();
		int count = s1.size();
		for (int i=0; i<count; i++) {
			System.out.println(s1.get(i).getText());
		}
	}
	
	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}
}
