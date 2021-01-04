package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class FlickrAbstractClass {
	String driverPath = "D:\\Flickr_AutomationTesting_Final\\chromedriver_win32\\chromedriver.exe";
	public WebDriver driver;
	
	@BeforeTest
	public void LaunchBrowser(){

		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://flickr.com/");

	}
	
	@AfterTest
	public void CloseBrowser() throws InterruptedException{
		Thread.sleep(9000);
		driver.close();
	}
	
}
