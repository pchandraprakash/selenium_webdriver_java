package objectIdentification;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementByTagName {

	public static void main(String[] args) {
		String ChrDriver = "webdriver.chrome.driver";
		String ChrDriverPath = "F://Udemy_Selenium//SeleniumWebDriver//drivers//chromedriver.exe";
		System.setProperty(ChrDriver, ChrDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demostore.x-cart.com");
		List <WebElement> list = driver.findElements(By.tagName("a"));//elements plural;
		System.out.println("list size: "+list.size());
		for (int i = 0; i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
		driver.close();
	}
}