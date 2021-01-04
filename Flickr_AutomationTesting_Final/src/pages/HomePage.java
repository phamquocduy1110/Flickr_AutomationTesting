package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
	private By searchField = By.xpath(".//input[@id='search-field']");
	private By searchButton = By.xpath(".//input[@type='submit']");
	private By uploadBtn = By.xpath(".//i[@class='upload-icon']");
	private By notiBell = By.xpath(".//span[@class='c-notification-icon']");
	private By personalInformationBtn = By.xpath(".//div[@class='avatar person tiny']");
	private By youBtn = By.xpath(".//a[@data-track=\"gnYouMainClick\"]");
	private String keyword = "aurora sky";
	

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	public WebElement getSearchField() {
		return getElement(searchField);
	}

	public WebElement getSearchButton() {
		return getElement(searchButton);
	}

	public WebElement getNotiBell() {
		return getElement(notiBell);
	}

	public WebElement getUploadBtn() {
		return getElement(uploadBtn);
	}


	public WebElement getPersonalInformationBtn() {
		return getElement(personalInformationBtn);
	}
	
	public void doSearching(String keyword) {
		getSearchField().click();
		getSearchField().sendKeys(keyword);
		getSearchButton().click();
		
	}
	
	public void openNotifications() {
		
	}
	
	public String getHomePageHeader() {
		return getElement(youBtn).toString();
		
	}
	
	

}
