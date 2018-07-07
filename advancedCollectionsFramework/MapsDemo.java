package advancedCollectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {

	public static void main(String[] args) {
		// Maps will store the elements in key/value pairs (key -> value)
		// one (k,v) pair is one entry
		Map<Integer, String> map1 = new HashMap<Integer, String>();

		// how to add key,value pairs into the maps
		map1.put(1, "bmw");
		map1.put(2, "benz");
		map1.put(3, "audi");
		map1.put(4, "honda");
		map1.put(5, "toyota");
		map1.put(6, "toyota");
		map1.put(7, "toyota");

		// how to print the key,value pairs in dictionary format {key=value} format
		System.out.println(map1);

		for (int i = 1; i < map1.size() + 1; i++) {
			System.out.println("value of key " + i + " is: " + map1.get(i));
		}

		// how to remove a key,value pair
		map1.remove(7);
		System.out.println(map1);
	}

}
