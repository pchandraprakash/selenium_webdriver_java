package advancedCollectionsFramework;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// how to declare and initialize a linked list
		LinkedList<String> cars = new LinkedList<String>();
		// how to add elements to the array list?
		cars.add("bmw");
		cars.add("benz");
		cars.add("audi");
		cars.add("honda");

		// how to check the size of the array list?
		System.out.println("size of linked list:" + cars.size());

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

		/*
		 * Array List --> {1,2,3,4,5} 
		 * unidirectional and there is no relation between
		 * to add and remove at the end
		 * get elements fast
		 * 
		 * elements Linked List --> [1] <-> [2] <-> [3] <-> [4] <-> [5] 
		 * bidirectional and there is head/tail relationship between elements
		 * to add and remove at the beginning	
		 */
		
		List<Integer> bikeID = new LinkedList<Integer>();
		//List<Integer> bikeArray = new ArrayList<Integer>();
		
		bikeID.add(0, 5);
		System.out.println(bikeID.size());
		for (int i = 0; i < bikeID.size(); i++) {
			System.out.println("item at index " + i + " is: " + bikeID.get(i));
		}

	}

}
