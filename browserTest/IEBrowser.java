package browserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "F://Udemy_Selenium//SeleniumWebDriver//drivers//IEDriverServer.exe");
		String url = "https://www.google.com";
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.close();
		driver.quit();
		System.out.println("Test this statement!!!");
	}
}