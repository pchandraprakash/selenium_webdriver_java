package browserProfiles;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeProfileDemo {
	
	//
	
	public static void main(String[] args) {
		String extensionPath = "C:\\Users\\phani\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\aapocclcgogkmnckokdopfmhonfmgoek\\0.10_0.crx";
		WebDriver driver;	
		String baseUrl = "https://www.google.com/";
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File(extensionPath));
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		//driver.quit();
	}
	
	
	

}
