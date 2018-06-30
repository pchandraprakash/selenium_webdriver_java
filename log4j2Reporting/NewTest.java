package log4j2Reporting;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	private WebDriver driver;
	private String baseUrl;
	private static final Logger log = LogManager.getLogger(log4j2Reporting.NewTest.class.getName());
  
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  baseUrl = "https://www.google.com/";
	  driver.manage().window().maximize();
  }
  
  @Test
  public void test() {
	  driver.get(baseUrl);
	  log.info("this message is from test method");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
