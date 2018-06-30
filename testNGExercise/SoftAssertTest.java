package testNGExercise;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	
	SampleTest s1 = new SampleTest();
	SoftAssert sa = new SoftAssert();

	@Test
	public void test1() {
		System.out.println("Executing first assert statement");
		int actualInt = s1.addNumbers(1, 3);
		int expectedInt = 4;
		sa.assertEquals(actualInt, expectedInt);
		
		System.out.println("Executing second assert statement");
		String actualStr = s1.addTwoStrings("hello", "world");
		String expectedStr = "dlrow olleh";
		sa.assertEquals(actualStr, expectedStr);
		
		System.out.println("Executing third assert statement");
		String Str = s1.reverseString("hello world");
		String strRev = "dlrow olleh";
		sa.assertEquals(Str, strRev);
		
		sa.assertAll();
	}
}
