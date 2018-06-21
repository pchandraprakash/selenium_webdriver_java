package waitTimes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypeUtility {
	WebDriver driver;
	
	public WaitTypeUtility(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement waitForElement(By locator, int timeout) {
		WebElement element = null;
		try {
			System.out.println("waiting for max:: " + timeout + " seconds for the element to appear");
			WebDriverWait wait = new WebDriverWait(driver, 3);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			System.out.println("element appeared on th web page");
		}catch(Exception e) {
			System.out.println("element did not appeared on the web page");
		}
		return element;
	}
	
	public void clickWhenReady(By locator, int timeout) {
		try {
			WebElement element = null;
			System.out.println("waiting for max:: " + timeout + " seconds for the element to appear to click");
			WebDriverWait wait = new WebDriverWait(driver, 3);
			element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			element.click();
			System.out.println("element clicked on the web page");
		}catch(Exception e) {
			System.out.println("element did not appeared on the web page to click");
		}
	}
}
