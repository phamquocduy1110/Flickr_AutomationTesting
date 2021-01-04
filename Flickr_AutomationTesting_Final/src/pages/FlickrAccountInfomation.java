package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlickrAccountInfomation extends FlickrAbstractClass{
	
	private By ChangeRealName = By.cssSelector(".change-real-name");
	
	public FlickrAccountInfomation(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	// Move to change real name then click on
	public void ClickOnChangeRealName() {
		
		driver.findElement(ChangeRealName).click();
	}
	
	// Perform action click on change real name
	public void ClickOnChangeRealNameAction() {
		
		this.ClickOnChangeRealName();
		
	}
}
