package advancedCollectionsFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TypeOfMaps {

	public static void main(String[] args) {

		Map<Integer, String> generalMap = new HashMap<Integer, String>();

		generalMap.put(1, "bmw");
		generalMap.put(2, "benz");
		generalMap.put(3, "audi");
		generalMap.put(4, "honda");
		generalMap.put(5, "toyota");
		generalMap.put(6, "toyota");
		generalMap.put(7, "toyota");

		for (Map.Entry<Integer, String> mapElements : generalMap.entrySet()) {
			int key = mapElements.getKey();
			String value = mapElements.getValue();
			System.out.println("key: " + key + ", value: " + value);
		}

		System.out.println("==============================");
		// Linked HashMap: maintains the order in which elements are added.
		Map<Integer, String> linkedMap = new LinkedHashMap<Integer, String>();
		linkedMap.put(1, "bmw");
		linkedMap.put(2, "benz");
		linkedMap.put(3, "audi");
		linkedMap.put(4, "honda");
		linkedMap.put(5, "toyota");
		linkedMap.put(6, "toyota");
		linkedMap.put(7, "toyota");
		
		for (Map.Entry<Integer, String> mapElements : linkedMap.entrySet()) {
			int key = mapElements.getKey();
			String value = mapElements.getValue();
			System.out.println("key: " + key + ", value: " + value);
		}
		
		System.out.println("==============================");
		// Tree HashMap: maintains natural sorting order
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(1, "bmw");
		treeMap.put(2, "benz");
		treeMap.put(3, "audi");
		treeMap.put(4, "honda");
		treeMap.put(5, "toyota");
		treeMap.put(6, "toyota");
		treeMap.put(7, "toyota");
		
		for (Map.Entry<Integer, String> mapElements : treeMap.entrySet()) {
			int key = mapElements.getKey();
			String value = mapElements.getValue();
			System.out.println("key: " + key + ", value: " + value);
		}
	}

}
