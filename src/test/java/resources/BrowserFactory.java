package resources;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	public WebDriver driver;

	// CONSTRUCTOR
	BrowserFactory(String browser, String url) {

		Path chromeDriverPath = Paths.get("C:\\library\\driver\\chromedriver.exe");


		System.setProperty("webdriver.chrome.driver",chromeDriverPath.toString());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}// closing startBrowser method

	// ------------------------------------------------------------------------------------------

	public void closeBrowser() {
		driver.close();
		driver.quit();
	}// closing closeBrowser method

}// closing class
