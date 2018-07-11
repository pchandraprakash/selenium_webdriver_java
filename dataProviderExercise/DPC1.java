package dataProvidersDemo;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DPC1 {
	// Step 1: create a test annotation method and pass an argument consisting of dataProvider name
	@Test(dataProvider = "giveData")
	// Step 2: create a test method with required parameters
	public void testDataProviderMethod(int id, String fn, String ln) {
		// Step 3: print the respective values from the data provider.
		System.out.println(
				"\nThe id of the employee is " + id + " and the firstname is " + fn + " and the lastname is " + ln);
	}
	
	// step 4: declare and initialize the DataProvider annotation with a name
		// syntax: @DataProvider(name="data_provider_name)
		@DataProvider(name = "giveData")
		// step 5: create a data provider method of 2D Object array: Object[][]
		public Object[][] dataProviderMethod() {
			// Step 6: this method will return a new 2D Object array: new Object[][]
			return new Object[][] {
					// Step 7: give the values for the array
					{ 1, "phanindra", "chandraprakash" }, // create arguments matching the parameters in the test method
					{ 2, "shreegowri", "anantharam" }, { 3, "srivats", "bharadwaj" },
					{ 4, "suchindra", "chandraprakash" } };
		}
}
