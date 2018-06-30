package testNGExercise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class PriorityTestNG {

	@BeforeClass
	public void beforeClass() {
		System.out.println("executing BeforClass annotation for beforeClass method");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("executing BeforMethod annotation for beforeMethod method");
	}

	@Test(priority=3)
	public void test1() {
		System.out.println("executing test1 method");
	}
	
	@Test(priority=2)
	public void test2() {
		System.out.println("executing test2 method");
	}
	
	@Test(priority=1)
	public void test3() {
		System.out.println("executing test3 method");
	}
	
	@Test(priority=0)
	public void test4() {
		System.out.println("executing test4 method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("executing AfterMethod annotation for afterMethod method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("executing AfterClass annotation for afterClass method");
	}

}
