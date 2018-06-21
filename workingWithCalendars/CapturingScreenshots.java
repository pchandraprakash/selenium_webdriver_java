package workingWithCalendars;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class CapturingScreenshots {
	WebDriver driver;
	String baseUrl;

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://www.expedia.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}
	
	@Test
	void test() {
		driver.get(baseUrl);
		driver.findElement(By.id("package-departing-hp-package")).sendKeys("06/21/2018");
		driver.findElement(By.id("package-departing-hp-package")).sendKeys("06/25/2018");
		driver.findElement(By.id("package-origin-hp-package")).sendKeys("New York");
		driver.findElement(By.id("package-destination-hp-package")).sendKeys("New York");
		driver.findElement(By.id("search-button-hp-package")).click();
	}
	
	public static String getRandomString(int length) {
		StringBuilder sb = new StringBuilder();
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMONOPQRSTUVWXYZ1234567890";
		for(int i=0; i<length; i++) {
			int index = (int) Math.random() * characters.length();
			sb.append(characters.charAt(index));
		}
		return sb.toString();
	}

	@AfterEach
	void tearDown() throws Exception {
		String fileName = getRandomString(5) + ".png";
		String directory = "F:\\Udemy_Selenium\\SeleniumWebDriver\\screenshots\\";
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + fileName));
		driver.quit();
	}
}
