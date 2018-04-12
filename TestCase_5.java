package propackage_1;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase_5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","F:\\SeleniumWebdriver\\Tutorials\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.100forms.com/display-form/QZ579RTAZGT4/");
		Thread.sleep(5000);
		// validation for element enabled or not
		WebElement checkBox = driver.findElement(By.id("data_5_0"));
		if(checkBox.isEnabled()) {
			System.out.println("Check Box is Enabled");
		}
		else {
			System.out.println("Check Box is not Enabled");
		}
		Thread.sleep(2000);
		
		// validation for element displayed or not
		try
		{
			if(driver.findElement(By.id("data_0")).isDisplayed())
			{
				driver.findElement(By.id("data_0")).sendKeys("Element is First Name");
			}
		}
		catch(NoSuchElementException e)
		{
			driver.findElement(By.id("data_3")).sendKeys("Element is Last Name");
		}
		
		// validation for checkbox and radio button selection
		
		try
		{
			if(driver.findElement(By.id("data_5_9")).isSelected())
			{
				System.out.println("Yes, check box is selected!");
			}
			else
			{
				System.out.println("No, check box is not selected");
			}
		}
		catch(NoSuchElementException e)
		{
			driver.findElement(By.id("data_3")).sendKeys("Element is Last Name");
			Thread.sleep(2000);
			driver.findElement(By.id("data_3")).clear();
		}
		Thread.sleep(2000);
		
		// action on radio button
		
		try
		{
			if(driver.findElement(By.id("data_6_0")).isDisplayed())
			{
				driver.findElement(By.id("data_6_0")).click();
			}
			else
			{
				driver.findElement(By.id("data_6_1")).click();
			}
		}
		catch(NoSuchElementException e)
		{
			System.out.println(e);
		}
		Thread.sleep(2000);
		driver.close();
		
	}
}