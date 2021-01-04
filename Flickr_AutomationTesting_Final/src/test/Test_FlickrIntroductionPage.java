package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FlickrAbstractClass;
import pages.FlickrIntroductionPage;
import pages.FlickrLogin;
import test.Test_FlickrLogin;

public class Test_FlickrIntroductionPage extends FlickrAbstractClass{

	FlickrIntroductionPage objIntroduction;

	@Test(priority=0)
	public void CreateIntroductionPageObject(){

		// Create Inroduction Page object
		objIntroduction = new FlickrIntroductionPage(driver);
		
	}
	
	@Test(priority=1)
	public void VerifyIntroductionPageObject() {
		
		// Verify Inroduction Page object
		String IntroductionPageTitle = objIntroduction.getIntroductionPageTitle();
		if (IntroductionPageTitle.toLowerCase().contains("find your inspiration.")) 
		{
			System.out.println("===============================================");
			System.out.println("Checked title Introduction page successfully");
			System.out.println("===============================================");
		}
		else {
			System.out.println("===============================================");
			System.out.println("Checked title Introduction page failed");
			System.out.println("===============================================");
		}

	}
	
	@Test(priority=2)
	public void StartAction() {
		
		// Start action
		objIntroduction.IntroductionPageAction();
		
	}
}