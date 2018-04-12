package propackage_1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// set properties to "webdriver.gecko.driver"
		System.setProperty("webdriver.gecko.driver","F:\\SeleniumWebdriver\\Tutorials\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseurl = "http://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = ""; //declare an empty string
		
		driver.get(baseurl);
		actualTitle = driver.getTitle();
		
		//perform validation
		if (actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Test Passed!");
		}
		else
		{
			System.out.println("Test Failed!");
		}
		
		driver.close();
	}

}
