package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	private By loginButton = By.className("gn-title");
	private By username = By.id("login-email");
	private By password = By.id("login-password");
	private By nextButton = By.cssSelector("#login-form > button");
	private By loginHeader = By.xpath(".//div[@class=\"content-container\"]/h6");
	
	private String title = driver.getTitle();
	private String usn = "ax4409h@gmail.com";
	private String pwd = "123456789thy";
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebElement getLoginButton() {
		return getElement(loginButton);
	}


	public WebElement getUsername() {
		return getElement(username);
	}

	public String getPageHeader() {
		return getElement(loginHeader).toString();
	}

	public WebElement getPassword() {
		return getElement(password);
	}

	public WebElement getNextButton() {
		return getElement(nextButton);
	}


	public String getTitle() {
		return title;
	}


	public HomePage doLogin(String usn, String pwd)
	{
		getLoginButton().click();
		getUsername().sendKeys(usn);
		getNextButton().click();
		getPassword().sendKeys(pwd);
		getNextButton().click();
		
		return getInstance(HomePage.class);
	}

	
	//getters
	
	
	
}
