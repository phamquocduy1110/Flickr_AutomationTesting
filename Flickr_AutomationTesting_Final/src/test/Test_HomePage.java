package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.FlickrAbstractClass;
import pages.FlickrHomePage;
import pages.FlickrLogin;

public class Test_HomePage extends FlickrAbstractClass{

	WebDriver driver;
	
	FlickrLogin objLogin;
	FlickrHomePage objHome;
	Test_FlickrLogin objTestLogin;

	@Test(priority=0)
	public void CreateHomePageObject() {

		// Create Home Page object
		objHome = new FlickrHomePage(driver);

	}
	
	@Test(priority=1)
	public void VerifyHomePageObject() {
		
		// Verify Home Page object
		String HomePageTitle = objHome.getHomePageTitle();
		if (HomePageTitle.toLowerCase().contains("home | flickr"))
		{
			System.out.println("===============================================");
			System.out.println("Checked title Home page successfully");
			System.out.println("===============================================");
		}
		else {
			System.out.println("===============================================");
			System.out.println("Checked title Home page failed");
			System.out.println("===============================================");
		}
	}
}
