package test2;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages2.HomePage;
import pages2.LoginPage;

public class TestLoginPage extends BaseTest{
	
	
	@Test(priority=0)
	public void test_Login_Page_Title() {
		String title = page.getInstance(LoginPage.class).getTitle();
		System.out.println("Title");
		Assert.assertEquals(title,"Flickr Login");
		
	}
	
	@Test(priority=1)
	public void test_Login_Page_Header() {
		String header = page.getInstance(LoginPage.class).getPageHeader();
		System.out.println("Header");
		Assert.assertEquals(header,"Choose an account");
	}
	
	@Test(priority = 2)
	public void test_Login() {
		HomePage homePage = page.getInstance(LoginPage.class).doLogin("ax4409h@gmail.com", "123456789thy");
		String headerHome = homePage.getPageHeader();
		System.out.println(headerHome);
		Assert.assertEquals(headerHome,"You");
		
	}
}