package advancedCollectionsFramework;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		// how to declare and initialize an array list
		ArrayList<String> cars = new ArrayList<String>();
		// how to add elements to the array list?
		cars.add("bmw");
		cars.add("benz");
		cars.add("audi");
		cars.add("honda");

		// how to check the size of the array list?
		System.out.println("size of array list:" + cars.size());

		// how to get the contents from array list? using regular for loop
		for (int i = 0; i < cars.size(); i++) {
			System.out.println("item at index " + i + " is: " + cars.get(i));
		}

		// using for-each loop
		for (String car : cars) {
			System.out.println(car);
		}

		// how to remove the items?
		cars.remove(2);
		for (int i = 0; i < cars.size(); i++) {
			System.out.println("item at index " + i + " is: " + cars.get(i));
		}
	}
}
