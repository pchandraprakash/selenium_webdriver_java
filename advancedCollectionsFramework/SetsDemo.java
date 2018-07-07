package advancedCollectionsFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {

	public static void main(String[] args) {

		// HashSet does not maintain any order and hence its faster
		Set<String> cars1 = new HashSet<String>();

		cars1.add("bmw");
		cars1.add("benz");
		cars1.add("audi");
		cars1.add("honda");
		cars1.add("honda");

		System.out.println("printing set: " + cars1);

		for (String car : cars1) {
			System.out.println("for Set: " + car);
		}

		// LinkedHashSet will maintains the order in which elements are added
		Set<String> cars3 = new LinkedHashSet<String>();
		cars3.add("bmw");
		cars3.add("benz");
		cars3.add("audi");
		cars3.add("honda");
		cars3.add("honda");
		for (String car : cars3) {
			System.out.println("for LinkedHashSet: " + car);
		}

		// TreeSet, maintains the natural sorting order 1,2,3,.....alphabetical
		Set<String> cars4 = new TreeSet<String>();
		cars4.add("bmw");
		cars4.add("benz");
		cars4.add("audi");
		cars4.add("honda");
		cars4.add("honda");
		for (String car : cars4) {
			System.out.println("for TreeSet: " + car);
		}

		List<String> cars2 = new ArrayList<String>();

		cars2.add("bmw");
		cars2.add("benz");
		cars2.add("audi");
		cars2.add("honda");
		cars2.add("honda");

		System.out.println("printing array list: " + cars2);
	}

}
