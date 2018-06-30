package testNGExercise;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTestNG {
  @Test
  @Parameters({"browser","platform"})
  public void test1(String browser, String platform) {
	  System.out.println("TestNG parameter set up from xml file for test1 method");
	  System.out.println("1. Parameter from testng_parameters.xml file: " + browser);
	  System.out.println("2. Parameter from testng_parameters.xml file: " + platform);
	  System.out.println("===========================================================");
  }
  
  @Test
  @Parameters({"platform","response"})
  public void test2(String platform, String response) {
	  System.out.println("TestNG parameter set up from xml file for test2 method");
	  String[] strArray = response.split(",");
	  System.out.println("2. Parameter from testng_parameters.xml file: " + platform);
	  for(String ele : strArray) {
		  System.out.println(ele);
	  }
	  /*System.out.println("2. Parameter from testng_parameters.xml file: " + strArray[0]);
	  System.out.println("2. Parameter from testng_parameters.xml file: " + strArray[1]);
	  System.out.println("2. Parameter from testng_parameters.xml file: " + strArray[2]);*/
  }
}
