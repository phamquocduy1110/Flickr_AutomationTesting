package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import pages.FlickrAbstractClass;

//import pages.FlickrHomePage;

import pages.FlickrLogin;

public class Test_FlickrLogin extends FlickrAbstractClass{

	FlickrLogin objLogin;

	@Test(priority=0)
	public void CreateLoginPageObject() {
		
		// Create Login Page object
		objLogin = new FlickrLogin(driver);

	}

	@Test(priority=1)
	public void VerifyLoginPageObject() {
		
		// Verify Login Page object
		String LoginPageTitle = objLogin.getLoginPageTitle();
		if(LoginPageTitle.toLowerCase().contains(" log in to flickr "))
		{
			System.out.println("===============================================");
			System.out.println("Checked title Login page successfully");
			System.out.println("===============================================");
		}
		else {
			System.out.println("===============================================");
			System.out.println("Checked title Login page failed");
			System.out.println("===============================================");
		}
		
	}
//	@Test(priority=0)
//	public void CreateLoginPageObject1(){
//
//		//Create Login Page object
//		objLogin = new FlickrLogin(driver);
//
//		//Verify login page title
//		String loginPageTitle = objLogin.getLoginPageTitle();
//		Assert.assertTrue(loginPageTitle.toLowerCase().contains("home | flickr"));
//
//		//login to application
//		objLogin.LoginFlickr("sakurakinomoto185@gmail.com", "Sakuraandusagi*01041996");
//
//	}
//	
//	@Test(priority=5)
//	public void StartActionLoginPage() {
//		
//		// Start action Login page
//		objTestLogin = new Test_FlickrLogin();
//		
//	}
}