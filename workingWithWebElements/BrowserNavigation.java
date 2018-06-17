package workingWithWebElements;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class BrowserNavigation {

	WebDriver driver;
	String baseUrl;
	
	@BeforeEach
	void setUp() throws Exception {
		baseUrl = "https://learn.letskodeit.com/p/practice";
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	void test() {
		driver.get(baseUrl);
		String title = driver.getTitle();
		System.out.println("title of the page is: " + title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("current url is: " + currentUrl);
		
		String navigationUrl = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
		driver.navigate().to(navigationUrl);
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		/*String pagespurce = driver.getPageSource();
		System.out.println("page source: "+ pagespurce);*/
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

}
