package commonMethodsAndProperties;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GMC1 {
	WebDriver driver;

	public GMC1(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElements(String locator, String type) {
		type = type.toLowerCase();
		if (type.equals("id")) {
			System.out.println("element found with id: " + locator);
			return this.driver.findElement(By.id(locator));
		} else if (type.equals("xpath")) {
			System.out.println("element found with xpath: " + locator);
			return this.driver.findElement(By.xpath(locator));
		} else if (type.equals("css")) {
			System.out.println("element found with cssSelector: " + locator);
			return this.driver.findElement(By.cssSelector(locator));
		} else if (type.equals("linktext")) {
			System.out.println("element found with linktext: " + locator);
			return this.driver.findElement(By.linkText(locator));
		} else if (type.equals("partiallinktest")) {
			System.out.println("element found with partiallinktext: " + locator);
			return this.driver.findElement(By.partialLinkText(locator));
		} else if (type.equals("tagname")) {
			System.out.println("element found with tagname: " + locator);
			return this.driver.findElement(By.tagName(locator));
		} else if (type.equals("name")) {
			System.out.println("element found with name: " + locator);
			return this.driver.findElement(By.name(locator));
		} else if (type.equals("classname")) {
			System.out.println("element found with classname: " + locator);
			return this.driver.findElement(By.className(locator));
		} else {
			System.out.println("element locator type is not supported");
			return null;
		}
	}

	public List<WebElement> getElementsList(String locator, String type) {
		type = type.toLowerCase();
		List<WebElement> elementList = new ArrayList<WebElement>();
		if (type.equals("id")) {
			elementList = this.driver.findElements(By.id(locator));
		}
		else if (type.equals("name")) {
			elementList = this.driver.findElements(By.name(locator));
		}
		else if (type.equals("xpath")) {
			elementList = this.driver.findElements(By.xpath(locator));
		}
		else if (type.equals("css")) {
			elementList = this.driver.findElements(By.cssSelector(locator));
		}
		else if (type.equals("classname")) {
			elementList = this.driver.findElements(By.className(locator));
		}
		else if (type.equals("tagname")) {
			elementList = this.driver.findElements(By.tagName(locator));
		}
		else if (type.equals("linktext")) {
			elementList = this.driver.findElements(By.linkText(locator));
		}
		else if (type.equals("partiallinktext")) {
			elementList = this.driver.findElements(By.partialLinkText(locator));
		}
		else {
			System.out.println("Locator type not supported");
		}
		if (elementList.isEmpty()) {
			System.out.println("Element not found with " + type +": " + locator);
			
		} else {
			System.out.println("Element found with " + type +": " + locator);
		}
		return elementList;
	}
	

	public boolean isElementPresent(String locator, String type) {
		List<WebElement> elementList = getElementsList(locator, type);
		int size = elementList.size();
		if(size>0) {
			return true;
		} else {
			return false;
		}
	}
}
