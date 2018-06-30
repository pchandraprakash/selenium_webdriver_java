package testNGExercise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

//@Listeners(TestNGCustomListeners.class)
public class TestNGListenersDemo {

	@BeforeClass
	public void beforeClass() {
		System.out.println("this is beforeClass method");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this is beforeMethod method");
	}

	@Test
	public void test1() {
		System.out.println("this is test1 method");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test2() {
		System.out.println("this is test2 method");
		Assert.assertTrue(true);
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("this is afterMethod method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("this is afterClass method");
	}

}
