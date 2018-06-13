package browserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		String ffDriver = "webdriver.gecko.driver";
		String ffDriverPath = "F://Udemy_Selenium//SeleniumWebDriver//drivers//geckodriver.exe";
		System.setProperty(ffDriver, ffDriverPath);
		WebDriver driver = new FirefoxDriver();
		String url = "https://www.google.com";
		driver.get(url);
		driver.manage().window().maximize();
		driver.close();
	}
}