package advancedCollectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVSLinkedList {
	/*
	 * Array List --> {1,2,3,4,5} unidirectional and there is no relation between to
	 * add and remove at the end get elements fast
	 * 
	 * elements Linked List --> [1] <-> [2] <-> [3] <-> [4] <-> [5] bidirectional
	 * and there is head/tail relationship between elements to add and remove at the
	 * beginning
	 */
	
	public static void runDuration(List<Integer> list, String listType) {
		System.out.println("\nTime started for " + listType);
		
		for(int i=0; i<200000; i++) {
			list.add(i);
		}
		int size = list.size();
		int elementsToAdd = size + 200000;
		long startTime = System.currentTimeMillis();
		
		/*for(int i=size; i<elementsToAdd; i++) {
			//list.add(i);
			list.add(0, i);
		}*/
		
		/*for(int i=90000; i<92000; i++) {
			list.remove(i);
		}*/
		
		for(int i=0; i<10000; i++) {
			list.remove(i);
		}
		
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("Time ended for " + listType);
		System.out.println("Duration of the list " + listType + " is: " + duration +" ms");
	}
	
	public static void main(String[] args) {
		List<Integer> bikeID = new LinkedList<Integer>();
		List<Integer> truckID = new ArrayList<Integer>();
		
		runDuration(truckID, "Array List");
		runDuration(bikeID, "Linked List");
	}
}