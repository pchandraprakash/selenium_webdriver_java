package testNGExercise;

import org.testng.annotations.Test;

import browserTest.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ClassTestNG_3 extends BaseTest {
	@BeforeClass(alwaysRun=true)
	public void beforeClass() {
		System.out.println("This is beforeClass method of ClassTestNG_1 class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is beforeMethod method of ClassTestNG_1 class");
	}

	@Test(enabled=false)
	public void test1() {
		int a = 3;
		int b = 4;
		int result = a + b;
		System.out.println("sum of two numbers from ClassTestNG_1: " + result);
	}
	
	@Test()
	public void test2() {
		int a = 7;
		int b = 4;
		int result = a - b;
		System.out.println("difference of two numbers from ClassTestNG_1: " + result);
	}
	
	@Test(timeOut=5000)
	public void test3() throws InterruptedException {
		int a = 10;
		int b = 20;
		int result = a + b;
		System.out.println("sum of two numbers from ClassTestNG_1: " + result);
		Thread.sleep(6000);
	}
	
	@Test(groups=("priority1"))
	public void test4() {
		int a = 10;
		int b = 20;
		int result = a - b;
		System.out.println("difference of two numbers from ClassTestNG_1: " + result);
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This is afterMethod method of ClassTestNG_1 class");
	}
	
	@Test(groups= {"add","float"})
	public void addFloat() {
		float a = 3.4f;
		float b = 4.2f;
		float result = a + b;
		System.out.println("sum of two floating numbers from ClassTestNG_1: " + result);
	}
	
	@Test(groups= {"add","double"})
	public void addDouble() {
		double a = 3.254d;
		double b = 4.63597d;
		double result = a + b;
		System.out.println("sum of two double numbers from ClassTestNG_1: " + result);
	}
	
	
	@AfterClass(alwaysRun=true)
	public void afterClass() {
		System.out.println("This is AfterClass method of ClassTestNG_1 class");
		System.out.println("======================================================");
	}
}