package dataProvidersDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPC2 {
  @Test(dataProvider="dp2")
  public void testDp(int studentId, String StudentFN, String StudentLN) {
	  System.out.println(studentId + "," + StudentFN + "," + StudentLN);
  }
  
  @DataProvider(name="dp2")
  public Object[][] dp2Method(){
	  return new Object[][] {
		  {1,"phanindra",""},
		  {2,"suchindra","chandraprakash"},
		  {3,"shreegowri","ubrani anantharam"}
	  };
  }
}
