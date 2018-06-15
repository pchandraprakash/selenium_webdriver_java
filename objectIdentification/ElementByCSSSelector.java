package objectIdentification;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementByCSSSelector {

	public static void main(String[] args) throws InterruptedException {
		String ChrDriver = "webdriver.chrome.driver";
		String ChrDriverPath = "F://Udemy_Selenium//SeleniumWebDriver//drivers//chromedriver.exe";
		System.setProperty(ChrDriver, ChrDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://learn.letskodeit.com/p/practice");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='bmwcheck']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#bmwradio")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#hondaradio")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("abc");
		Thread.sleep(2000);
	/*	driver.findElement(By.cssSelector(".btn-style.class1.class2")).click();
		Thread.sleep(2000);*/
		
		List<WebElement> list1 = driver.findElements(By.cssSelector("input[class^='btn-style']"));
		System.out.println("matching elements?: "+ list1.size());
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i).getTagName());
		}
		
		List<WebElement> list2 = driver.findElements(By.cssSelector("fieldset>input"));
		System.out.println("matching elements?: "+ list2.size());
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i).getText());
		}
		driver.quit();
	}

}
