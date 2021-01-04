package test2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import pages2.BasePage;
import pages2.Page;

public class BaseTest {
	String driverPath = "D:\\Flickr_AutomationTesting_Final\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver;
	public Page page;
	String websiteURL = "www.flickr.com";
	
	
	public BaseTest() {
		
	}
	
	@BeforeMethod
	public void setupTest() throws Exception {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(websiteURL);
		try {
			Thread.sleep(6000);

		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		page = new BasePage(driver);
		
		
	}
	
	@AfterMethod
	public void quitDriver() {
		if (driver != null) {
			driver.quit();     
			driver = null;    
			}	
		}
	
	

}
