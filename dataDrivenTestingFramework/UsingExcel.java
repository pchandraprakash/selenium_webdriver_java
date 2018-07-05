package dataDrivenTestingFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingExcel {
	private WebDriver driver;

	@BeforeClass
	public void beforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.get(Constants.URL);
		driver.findElement(By.xpath(".//a[@href='/sign_in']")).click();
		ExcelUtility.setExcelFile(Constants.File_Path + Constants.File_Name, "LoginTest");
	}
	
	
	@DataProvider(name = "logindata")
	public Object[][] dataProvider() {
		Object [][] testData = ExcelUtility.getTestData("Invalid_Login");
		return testData;
	}
	
	@Test(dataProvider = "logindata")
	public void testUsingExcel(String username, String password) throws InterruptedException {
		driver.findElement(By.id("user_email")).sendKeys(username);
		driver.findElement(By.id("user_password")).sendKeys(password);
		driver.findElement(By.name("commit")).click();
		Thread.sleep(5000);
		boolean errorText = driver.findElements(By.xpath(".//div[@class='alert alert-danger']")).size()!= 0;
		Assert.assertTrue(errorText);
		driver.findElement(By.id("user_email")).clear();
		driver.findElement(By.id("user_password")).clear();
	}


	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
