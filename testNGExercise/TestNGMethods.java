package testNGExercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGMethods {
	WebDriver driver;
 
  @BeforeMethod
  public void beforeMethod1() {
	  driver = new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
  }
  
  public String test1() {
	 String str = driver.getTitle();
	 return str;
  }
  
  @Test
  public void test2() {
	 System.out.println("method 2");
  }
  
  @AfterMethod
  public void afterMethod1() {
	  driver.manage().deleteAllCookies();
	  driver.close();
  }

}
