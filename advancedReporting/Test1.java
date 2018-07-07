package advancedReporting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Test1 {
	private WebDriver driver;
	private String baseUrl;
	ExtentReports report; // declare a report variable
	ExtentTest test; // declare a test variable

	@BeforeClass
	public void beforeClass() {
		report = ExtentFactory.getInstance();
		test = report.startTest("Test 1");

		driver = new ChromeDriver();
		test.log(LogStatus.INFO, "browser started after new chrome driver");

		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "browser maximized");

		baseUrl = "https://learn.letskodeit.com/p/practice";
		driver.get(baseUrl);
		test.log(LogStatus.INFO, "web application opened");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}

	@Test
	public void TC001_invalidLoginCheck() {
		test.log(LogStatus.INFO, "started test case TC001_invalidLoginCheck()");
		driver.findElement(By.xpath(".//a[@class='navbar-link fedora-navbar-link']")).click();
		test.log(LogStatus.INFO, "clicked on login link");

		driver.findElement(By.id("user_email")).sendKeys("test@email.com");
		test.log(LogStatus.INFO, "entered username");

		driver.findElement(By.id("user_password")).sendKeys("abcdabcd");
		test.log(LogStatus.INFO, "entered password");

		driver.findElement(By.name("commit")).click();
		test.log(LogStatus.INFO, "clicked on login button");

		WebElement errorText = driver.findElement(By.xpath(".//div[@class='alert alert-danger']"));
		String expectedMessage = "Invalid email or password";
		String actualMessage = errorText.getText();
		Assert.assertEquals(actualMessage, expectedMessage);
		test.log(LogStatus.INFO, "check the error message");
		test.log(LogStatus.PASS, "verified the error message");
		test.log(LogStatus.INFO, "ended test case TC001_invalidLoginCheck()");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
		report.endTest(test);
		report.flush();
	}
}