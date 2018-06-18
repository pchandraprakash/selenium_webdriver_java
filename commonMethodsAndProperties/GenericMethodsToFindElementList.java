package commonMethodsAndProperties;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class GenericMethodsToFindElementList {
	private WebDriver driver;
	private String baseUrl;
	private GMC1 gmc;
	

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://www.expedia.com/";
		gmc = new GMC1(driver);// this has be given after initiating the driver and the later give it to the class
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}
	
	@Test
	void test1() throws InterruptedException {
		driver.get(baseUrl);
		List<WebElement> e1 = gmc.getElementsList(".//button[@type='button']", "xpath");
		System.out.println("Elememt list size: " + e1.size());
		System.out.println("**********");
		for (int i=0; i<e1.size(); i++) {
			System.out.println(e1.get(i).getText());
		}
	}
	
	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}


}
