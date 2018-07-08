package browserProfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FirefoxProfileDemo {

	public static void main(String[] args) {
		WebDriver driver;
		String baseUrl = "https://www.google.com/";
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile ffp = profile.getProfile("seltestauto");
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(ffp);
		driver = new FirefoxDriver(option);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.quit();
	}
}