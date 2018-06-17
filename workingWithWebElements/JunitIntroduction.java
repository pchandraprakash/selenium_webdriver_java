package workingWithWebElements;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JunitIntroduction {

	@BeforeAll //this method will be called before starting the test execution
	static void setUpBeforeClass() throws Exception {
		System.out.println("***********");
		System.out.println("Executing BeforeAll Method");
		System.out.println("Check the pre-conditions");
		System.out.println("***********");
	}

	@AfterAll //this method will be called after starting the test execution
	static void tearDownAfterClass() throws Exception {
		System.out.println("***********");
		System.out.println("Executing AfterAll Method");
		System.out.println("Check the post-conditions");
		System.out.println("Clear the temporary files and run garbage collector");
		System.out.println("***********");
	}

	@BeforeEach //this method will be called before each test
	void setUp() throws Exception {
		System.out.println("***********");
		System.out.println("Executing BeforeEach Method");
		System.out.println("Check the test data and test environment");
		System.out.println("***********");
	}

	@AfterEach //this method will be called after each test
	void tearDown() throws Exception {
		System.out.println("***********");
		System.out.println("Executing AfterEach Method");
		System.out.println("Check the test results, clean the test environment");
		System.out.println("***********");
	}

	@Test
	void test1() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = input.nextInt();
		
		System.out.println("Enter the second number: " );
		int b = input.nextInt();
		
		System.out.println("Sum of two numbers: " + (a+b));
		System.out.println("End of test 1");
	}
	
	@Test
	void test2() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = input.nextInt();
		
		System.out.println("Enter the second number: " );
		int b = input.nextInt();
		
		System.out.println("Difference of two numbers: " + (a-b));
		System.out.println("End of test 2");
	}

}
