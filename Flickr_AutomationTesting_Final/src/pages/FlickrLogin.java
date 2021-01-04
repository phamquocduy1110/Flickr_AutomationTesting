package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class FlickrLogin extends FlickrAbstractClass{
	
	private By LoginEmail = By.id("login-email");
	private By LoginPassword = By.id("login-password");
	private By LoginButton = By.cssSelector("form > button");
	private By NextButton = By.cssSelector("form > button");
	private By LoginPageTitle = By.xpath("//*[contains(text(), 'Flickr Login')]");
//	By LoginPageTitle = By.xpath("//div[@class='layout-centered-card flex column h-100-vh pos-relative']/div[position()=2]/div[@class='pa-4 b-rad-1 bg-white card pos-relative flickr-card--slim']/div[position()=2]/h6");

	public FlickrLogin(WebDriver driver) {

		this.driver = driver;

	}

	// Input account's email in email textbox
	public void InputEmail(String strUserName) {

		driver.findElement(LoginEmail).sendKeys(strUserName);

	}

	// Input account's password in password textbox
	public void InputPassword(String strPassword) {

		driver.findElement(LoginPassword).sendKeys(strPassword);

	}

	// Click on login button
	public void clickLogin() {

		driver.findElement(LoginButton).click();

	}

	// Click on next button
	public void clickNext() {

		driver.findElement(NextButton).click();

	}

	//Get the title from Login page
	public String getLoginPageTitle() {

		return driver.findElement(LoginPageTitle).getText();

	}

	public void LoginFlickr(String strUserName, String strPassword) {

		// Fill user name
		this.InputEmail(strUserName);

		// Fill password
		this.InputPassword(strPassword);

		//Click Login button
		this.clickLogin();

		// Click Next button
		this.clickNext();
	}
}