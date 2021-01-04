package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class FlickrIntroductionPage extends FlickrAbstractClass{

	private By IntroductionPage = By.xpath("//div[@class='copy']/h1");
	private By FlickrSignIn = By.cssSelector(".gn-signin");


	public FlickrIntroductionPage(WebDriver driver){

		this.driver = driver;

	}

	// Click on Sign In button
	
	public void ClickSignIn() {

		driver.findElement(FlickrSignIn).click();

	}

	public String getIntroductionPageTitle(){

		return driver.findElement(IntroductionPage).getText();

	}
	
	public void IntroductionPageAction() {
		
		// Click Sign In button
		this.ClickSignIn();
	}

}