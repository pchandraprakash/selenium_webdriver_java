package eventListeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WDEListeners {

	public static void main(String[] args) {
		String baseUrl = "https://learn.letskodeit.com/p/practice";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		EventFiringWebDriver efDriver = new EventFiringWebDriver(driver);
		HandlingEvents he = new HandlingEvents();
		efDriver.register(he);
		
		efDriver.get(baseUrl);
		efDriver.findElement(By.id("bmwcheck")).click();
		efDriver.findElement(By.id("bmwradio")).click();
		efDriver.findElement(By.name("enter-name")).sendKeys("test automation");
		efDriver.findElement(By.name("enter-name")).clear();
		efDriver.quit();

	}

}
