package testNGExercise;

import org.testng.annotations.Test;

import browserTest.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ClassTestNG_2 extends BaseTest {
	@BeforeClass(alwaysRun=true)
	public void beforeClass() {
		System.out.println("This is beforeClass method of ClassTestNG_2 class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is beforeMethod method of ClassTestNG_2 class");
	}

	@Test(groups=("priority2"))
	public void test5() {
		int a = 3;
		int b = 4;
		int result = a * b;
		System.out.println("product of two numbers from ClassTestNG_2: " + result);
	}
	
	@Test(groups=("priority1"))
	public void test6() {
		int a = 8;
		int b = 4;
		int result = a/b;
		System.out.println("division of two numbers from ClassTestNG_2: " + result);
	}
	
	@Test(groups=("priority1"))
	public void test7() {
		int a = 30;
		int b = 40;
		int result = a * b;
		System.out.println("product of two numbers from ClassTestNG_2: " + result);
	}
	
	@Test(groups=("priority2"))
	public void test8() {
		int a = 20;
		int b = 4;
		int result = a/b;
		System.out.println("division of two numbers from ClassTestNG_2: " + result);
	}
	
	@Test(groups={"add","string"})
	public void addString() {
		String a = "hello";
		String b = "world";
		String result = a+" "+b;
		System.out.println("division of two string variables from ClassTestNG_2: " + result);
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This is afterMethod method of ClassTestNG_2 class");
	}

	@AfterClass(alwaysRun=true)
	public void afterClass() {
		System.out.println("This is AfterClass method of ClassTestNG_2 class");
	}
}