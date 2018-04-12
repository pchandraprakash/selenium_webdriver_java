package propackage_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","F:\\SeleniumWebdriver\\Tutorials\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// Locating UI Elements
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.close();
	}
}