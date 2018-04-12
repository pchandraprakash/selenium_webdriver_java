package propackage_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass_4 {

	public static void main(String[] args) throws InterruptedException {
		// How to handle pop up windows
		System.setProperty("webdriver.gecko.driver","F:\\SeleniumWebdriver\\Tutorials\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://output.jsbin.com/usidix/1");
		driver.findElement(By.cssSelector("input[type='button']")).click();
		String alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        System.out.println(alertMessage);
        driver.quit();
	}
}
