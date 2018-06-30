package testNGExercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest_1 {
	
	WebDriver driver;
	String baseUrl = "https://learn.letskodeit.com/p/practice";
	
  @Test
  public void browserTest1() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	  	driver.get(baseUrl);
	  	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	  	Thread.sleep(5000);
	  	String radioText = driver.findElement(By.xpath(".//input[@id='bmwradio']")).getAttribute("value");
		System.out.println("the radion button text is: " + radioText);
		driver.quit();
  }
}
