package dataProvidersDemo;

import java.util.Scanner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPC3 {

	Scanner userInput = new Scanner(System.in);

	@Test(dataProvider = "dp3")
	public void testDp3(int id, String name) {
		System.out.println("person id: "+id + " and fullName: " + name);
	}

	@DataProvider(name = "dp3")
	public Object[][] dp3() {
		System.out.println("Enter id and fullName: ");
		return new Object[][] { { userInput.nextInt(), userInput.next() } };
	}
}
