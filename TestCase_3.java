package propackage_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase_3 {

	public static void main(String[] args) throws InterruptedException {
		// Handling frames
		System.setProperty("webdriver.gecko.driver","F:\\SeleniumWebdriver\\Tutorials\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		Thread.sleep(5000);
		driver.switchTo().frame("packageListFrame");
		Thread.sleep(5000);
		driver.findElement(By.linkText("All Classes")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent(); //come out of all the frames and identify another frame by its name
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Deprecated")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
