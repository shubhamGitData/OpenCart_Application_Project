package opencart.Application.Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import opencart.framework.Utility.Read_Property_File;
import opencart.framework.WebCommons.WebCommons;
import opencart.framework.WebDriver.WebdriverClass;

public class Home_Page extends WebCommons{
	
	
	// Home Page  WebElement
	
	@FindBy (xpath="//span[text()='Currency']")
	private WebElement  currency;

	
	
	@FindBy (xpath="//a[text()='€ Euro']")
	private WebElement euro  ;
	
	
	
	@FindBy (xpath="//input[@name='search']")
	private WebElement search_Box ;
	
	
	@FindBy (xpath="//i[@class='fas fa-search']")
	private WebElement search_Button ;
	
	@FindBy (xpath="//a[text()='Apple Cinema 30\"']")
	private WebElement apple_TV  ;
	
	
	/*
	@FindBy (xpath="")
	private WebElement  ;
	
	@FindBy (xpath="")
	private WebElement  ;
	
	@FindBy (xpath="")
	private WebElement  ;
	
	*/
	
	//=================================================
	// Action Method for WebElement
	
	
	
	public void verifyCurrencyDropdown() {
		implicitWait(3);
		Assert.assertTrue(checkAvailability(currency));
		Assert.assertTrue(checkEnability(currency));
		elementScreenshot(currency, "Currency DropDown");
		report("Currency Dropdown is Displayed & Enabled");
		
	}
	
	
	
	public void verifySearchBox() {
		implicitWait(3);
		Assert.assertTrue(checkAvailability(search_Box));
		Assert.assertTrue(checkEnability(search_Box));
		elementScreenshot(search_Box, "Search Box");
		report("Search Box is Displayed & Enabled");
		
	}
	
	
	public void verifySearchButton() {
		implicitWait(3);
		Assert.assertTrue(checkAvailability(search_Button));
		Assert.assertTrue(checkEnability(search_Button));
		elementScreenshot(search_Button, "Search Button");
		report("Search Button is Displayed & Enabled");
		
	}
	
	
	public void verifyTitle() {
		implicitWait(3);
		Assert.assertEquals(Read_Property_File.readData("Configuration_File.properties").getProperty("title"), driver.getTitle());
		report("Page Title is Matched : "+driver.getTitle());
		takescreenshot("Home Page Title");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static Home_Page getHomePage() {
		return PageFactory.initElements(WebdriverClass.getDriver(), Home_Page.class);
	}
	
}
