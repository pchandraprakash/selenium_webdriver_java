package testNGExercise;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class TestNGCustomListeners2 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// when test starts this block will be executed.
		System.out.println("test method " + result.getName() + " execution started");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// executed when after a successful test run
		System.out.println("test method " + result.getName() + " successfully executed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// executed when after a failed test run
		System.out.println("test method " + result.getName() + " has failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// before <test> tag of xml file NOT the @Test annotation
		System.out.println("onStart -> test tag name: " + context.getName());
		ITestNGMethod method[] = context.getAllTestMethods();
		System.out.println("these are the test methods under the test tag of the xml: ");
		for (ITestNGMethod methodNames : method) {
			System.out.println(methodNames.getMethodName());
		}
	}

	@Override
	public void onFinish(ITestContext context) {
		// after <test> tag of xml file NOT the @Test annotation
		System.out.println("end of the xml tag");
		System.out.println("===================");
	}

}
