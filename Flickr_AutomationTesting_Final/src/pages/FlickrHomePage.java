package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlickrHomePage extends FlickrAbstractClass{
	
	private By HomePageTitle = By.xpath("//*[contains(text(), 'Home | Flickr')]");
	private By AvatarIcon = By.cssSelector(".c-account-menu");
	private By Settings = By.cssSelector(".menu-section li:nth-of-type(2)");
	private By TitleYou = By.cssSelector(".gn-title.you");
	private By Album = By.cssSelector(".gn-submenu li:nth-of-type(3)");
	private By TitleExplore = By.cssSelector(".gn-title.explore");
	private By Waiting = By.cssSelector(".moola-container.feed-ba.upsell-fallback");

	public FlickrHomePage(WebDriver driver) {

		this.driver = driver;

	}

	// Wating for a while
	public void Waiting() {
		
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.presenceOfElementLocated(Waiting));
		
	}
	// Move pointer to avatar icon then click on 
	public void ClickOnAvatarIcon() {
		
		WebElement Avatar = driver.findElement(AvatarIcon);
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder
				.moveToElement(Avatar)
				//.moveToElement(titleAlbum)
				.click()
				.build();
		seriesOfActions.perform();
	}
	
	// Move pointer to Title You
	public void MoveToTitleYou() {
		
		WebElement titleYou = driver.findElement(TitleYou);
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder
				.moveToElement(titleYou)
				.build();
		seriesOfActions.perform();
	}
	
	// Click on Album
	public void ClickOnAlbum() {
		
		WebElement album = driver.findElement(Album);
		Actions builder = new Actions(driver);
		Action seriesOfActions2 = builder
				.moveToElement(album)
				.click()
				.build();
		seriesOfActions2.perform();
		
	}
	
	
	// Click on title 
	//Get Login page's title
	public String getHomePageTitle(){

		return driver.findElement(HomePageTitle).getText();

	}
	
	
	// Perform action click on avatar icon
	public void ClickOnAvatarIconAction() {
		
		this.ClickOnAvatarIcon();
		
	}
	
	//Perform action move to title you
	public void MoveToTitleYouAction() {
		
		this.MoveToTitleYou();
	}
	
	// Perform action click on album
	public void ClickOnAlbumAction() {
		
		this.ClickOnAlbum();
		
	}
}
