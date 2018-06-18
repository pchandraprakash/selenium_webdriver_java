package commonMethodsAndProperties;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class GenericMethodsToFindElements {
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
	void test() throws InterruptedException {
		driver.get(baseUrl);
		WebElement e1 = gmc.getElements("package-origin-hp-package", "id");
		e1.sendKeys("Chicago");
	}
	
	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}


}
