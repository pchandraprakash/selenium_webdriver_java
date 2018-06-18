package commonMethodsAndProperties;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class IsElementPresentCheck {
	private WebDriver driver;
	private String baseUrl;
	private GMC1 gmc;
	

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";
		gmc = new GMC1(driver);// this has be given after initiating the driver and the later give it to the class
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}
	
	@Test
	void test1() {
		driver.get(baseUrl);
		boolean result1 = gmc.isElementPresent("name", "id");
		System.out.println("is element present? "+result1);
		
		boolean result2 = gmc.isElementPresent("name-not-present", "id");
		System.out.println("is element present? "+result2);
	}
	
	@AfterEach
	void tearDown() throws Exception {
		driver.close();
	}


}
