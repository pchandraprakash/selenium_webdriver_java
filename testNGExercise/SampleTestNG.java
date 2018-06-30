package testNGExercise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestNG {

	SampleTest s1 = new SampleTest();
	
	@Test
	public void test1() {
		System.out.println("Calling addNumbers method of SampleTest class");
		int actual = s1.addNumbers(5, 5);
		int expected = 10;
		Assert.assertEquals(actual, expected);
		System.out.println("Ending test1 method");
	}
	
	@Test
	public void test2() {
		System.out.println("Calling reverseString method of SampleTest class");
		String actual = s1.reverseString("hello world");
		String expected = "dlrow olleh";
		Assert.assertEquals(actual, expected);
		System.out.println("Ending test2 method");
	}

}
