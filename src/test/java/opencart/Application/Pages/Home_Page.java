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
	
	
	
	@FindBy (xpath="//a[text()='Desktops']")
	private WebElement desktop_Menu  ;
	
	@FindBy (xpath="//a[text()='Laptops & Notebooks']")
	private WebElement laptop_Notebooks ;
	
	@FindBy (xpath="//a[text()='Components']")
	private WebElement components  ;
	
	@FindBy (xpath="//a[text()='Tablets']")
	private WebElement tablets  ;
	
	@FindBy (xpath="//a[text()='Software']")
	private WebElement software ;
	
	
	@FindBy (xpath="//a[text()='Phones & PDAs']")
	private WebElement  phones ;
	
	@FindBy (xpath="//a[text()='Cameras']")
	private WebElement  cameras;
	
	@FindBy (xpath="//a[text()='MP3 Players']")
	private WebElement  mp3Players;

	
	/*
	 * 
	 	
	@FindBy (xpath="")
	private WebElement  ;
	
	  @FindBy (xpath="")
	private WebElement  ;
	
	@FindBy (xpath="")
	private WebElement  ;
	@FindBy (xpath="")
	private WebElement  ;
	
	@FindBy (xpath="")
	private WebElement  ;
	@FindBy (xpath="")
	private WebElement  ;
	
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
	
	
	
	public void verifyDesktop_Menu() {
		implicitWait(3);
		Assert.assertTrue(checkAvailability(desktop_Menu));
		Assert.assertTrue(checkEnability(desktop_Menu));
		elementScreenshot(desktop_Menu, "Desktop_Menu");
		report("Desktop_Menu is Displayed & Enabled");
		
	}
	
	
	public void verifyLaptop_NotebooksMenu() {
		implicitWait(3);
		Assert.assertTrue(checkAvailability(laptop_Notebooks));
		Assert.assertTrue(checkEnability(laptop_Notebooks));
		elementScreenshot(laptop_Notebooks, "laptop_Notebooks");
		report("laptop_Notebooks Menu is Displayed & Enabled");
		
	}
	
	
	
	public void verifyComponentsMenu() {
		implicitWait(3);
		Assert.assertTrue(checkAvailability(components));
		Assert.assertTrue(checkEnability(components));
		elementScreenshot(components, "Components Menu");
		report("Components Menu is Displayed & Enabled");
		
	}
	
	
	
	public void verifyTabletsMenu () {
		implicitWait(3);
		Assert.assertTrue(checkAvailability(tablets));
		Assert.assertTrue(checkEnability(tablets));
		elementScreenshot(tablets, "Tablets Menu ");
		report("Tablets Menu  is Displayed & Enabled");
		
	}
	
	
	
	
	public void verifySoftwareMenu() {
		implicitWait(3);
		Assert.assertTrue(checkAvailability(software));
		Assert.assertTrue(checkEnability(software));
		elementScreenshot(software, "Software Menu ");
		report("Software Menu  is Displayed & Enabled");
		
	}
	
	
	
	public void verifyPhonesMenu() {
		implicitWait(3);
		Assert.assertTrue(checkAvailability(phones));
		Assert.assertTrue(checkEnability(phones));
		elementScreenshot(phones, "Phones Menu");
		report("Phones Menu is Displayed & Enabled");
		
	}
	
	
	
	public void verifyCamerasMenu() {
		implicitWait(3);
		Assert.assertTrue(checkAvailability(cameras));
		Assert.assertTrue(checkEnability(cameras));
		elementScreenshot(cameras, " Cameras Menu");
		report("Cameras Menu is Displayed & Enabled");
		
	}
	
	
	
	public void verifymp3Players() {
		implicitWait(3);
		Assert.assertTrue(checkAvailability(mp3Players));
		Assert.assertTrue(checkEnability(mp3Players));
		elementScreenshot(mp3Players, "Mp3 Players Menu");
		report("Mp3 Players menu is Displayed & Enabled");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static Home_Page getHomePage() {
		return PageFactory.initElements(WebdriverClass.getDriver(), Home_Page.class);
	}
	
}
