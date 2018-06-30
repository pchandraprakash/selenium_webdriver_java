package testNGExercise;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class TestNGCustomListeners3 implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		// at the start of the test suite
		System.out.println("Suite " + suite.getName() + " execution started");
		
	}

	@Override
	public void onFinish(ISuite suite) {
		// at the end of the test suite
		System.out.println("Suite " + suite.getName() + " execution ended");
	}
}
