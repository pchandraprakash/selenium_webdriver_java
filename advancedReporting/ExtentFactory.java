package advancedReporting;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {
	public static ExtentReports getInstance() {

		ExtentReports extent;
		String path = "F:\\Udemy_Selenium\\SeleniumWebDriver\\SeleniumWebDriver\\extentReport\\report.html";
		extent = new ExtentReports(path, false);
		return extent;
	}
}