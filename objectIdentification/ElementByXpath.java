package objectIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementByXpath {

	public static void main(String[] args) throws InterruptedException {
		String ChrDriver = "webdriver.chrome.driver";
		String ChrDriverPath = "F://Udemy_Selenium//SeleniumWebDriver//drivers//chromedriver.exe";
		System.setProperty(ChrDriver, ChrDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://learn.letskodeit.com");
		driver.get("https://learn.letskodeit.com/p/practice");
		//driver.findElement(By.xpath(".//p[@id='DrpDwnMn05label']")).click();
		//absolute xpath
		//driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div/div/ul/li[2]/a")).click();
		//driver.findElement(By.xpath(".//a[text()='Enroll now']")).click();
		//driver.findElement(By.xpath(".//a[contains(@class,'navbar-link fedora')]")).click();
		String price = driver.findElement(By.xpath(".//td[contains(text(),'30')]")).getText();
		System.out.println("Python Programming Language price: $"+price);
		Thread.sleep(5000);
		driver.close();
	}

}
