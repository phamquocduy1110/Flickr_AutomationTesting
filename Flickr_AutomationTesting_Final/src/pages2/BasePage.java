package pages2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Page{

	public BasePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPageTitle() {
		return driver.getTitle();
		
	}

	@Override
	public String getPageHeader() {
		By locator = null;
		return getElement(locator).getText();
		
	}

	@Override
	public WebElement getElement(By locator) {
		WebElement thisElement = null;
		try {
			thisElement = driver.findElement(locator);
			return thisElement;
		}catch(Exception e)
		{
			System.out.println("Error while creating this element" + locator.toString());
			e.printStackTrace();
		}
		return thisElement;

		
	}

	@Override
	public void waitForElementDisplay(By locator) {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}catch(Exception e)
		{
			System.out.println("This element at " + locator.toString() + " can not be found.");
			e.printStackTrace();
		}
	}

	@Override
	public void waitForPageTitle(String title) {
		try {
			wait.until(ExpectedConditions.titleContains(title));
		}catch(Exception e)
		{
			System.out.println("This element at " + title.toString() + " can not be found.");
		}
	}


	

}

