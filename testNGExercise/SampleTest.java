package testNGExercise;

public class SampleTest {
	
	public int addNumbers(int a, int b) {
		return a+b;
	}
	
	public String addTwoStrings(String a, String b) {
		return a + " " + b;
	}
	
	public int[] getArray(){
		int[] arraySample = {1,2,3,4,5};
		return arraySample;
	}
	
	public String reverseString(String str) {
		String s = str;
		char[] c = s.toCharArray();
		String rev = "";
		for(int i = c.length-1; i>=0; i--) {
			rev += c[i];
		}
		return rev;
	}

}
