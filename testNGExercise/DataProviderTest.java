package testNGExercise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@DataProvider(name = "inputs")
	public Object[][] getData(){
		return new Object[][] {
			{"bmw","m3"},
			{"benz","c300"},
			{"audi","q4"},
		};
	}
	
	@Test(dataProvider = "inputs")
	public void checkDataProvider(String input1, String input2) {
		System.out.println("inpu1: " + input1);
		System.out.println("inpu2: " + input2);
	}
}
