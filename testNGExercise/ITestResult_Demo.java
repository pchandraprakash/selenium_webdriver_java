package testNGExercise;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ITestResult_Demo {
  
  @Test
  public void test1() {
	  System.out.println("running test1 method");
	  try {
	  Assert.assertTrue(false);
	  }catch(Exception e) {
		  System.out.println(e);
	  }
  }
  
  @Test
  public void test2() {
	  System.out.println("running test2 method");
	  Assert.assertTrue(true);
  }
  
  @AfterMethod
  public void afterMethod(ITestResult result) {
	  if(result.getStatus() == ITestResult.FAILURE) {
		  System.out.println("this is the failed method: " + result.getMethod().getMethodName());
	  }
	  if(result.getStatus() == ITestResult.SUCCESS) {
		  System.out.println("this is the passed method: " + result.getName());
	  }
  }
}
