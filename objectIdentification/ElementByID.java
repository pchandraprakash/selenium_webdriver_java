package objectIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementByID {

	public static void main(String[] args)  {
		String ChrDriver = "webdriver.chrome.driver";
		String ChrDriverPath = "F://Udemy_Selenium//SeleniumWebDriver//drivers//chromedriver.exe";
		System.setProperty(ChrDriver, ChrDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("letskodeit");
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		driver.close();
	}

}
