package opencart.Application.Test;

import org.testng.annotations.Test;

import opencart.Application.Pages.Home_Page;
import opencart.framework.WebDriver.WebdriverClass;

public class Application_Test extends WebdriverClass {

	@Test(priority=1)
	public void Verify_Currency_DropDown() {
		Home_Page hp = Home_Page.getHomePage();
		hp.verifyCurrencyDropdown();
	}
	
	@Test(priority=2)
	public void Verify_Search_Box() {
		Home_Page hp = Home_Page.getHomePage();
		hp.verifySearchBox();
	}
	
	
	@Test (priority=3)
	public void Verify_Search_Button() {
		Home_Page hp = Home_Page.getHomePage();
		hp.verifySearchButton();
	}
	
	
	@Test (priority=4)
	public void Verify_HomePage_Title() {
		Home_Page hp = Home_Page.getHomePage();
		hp.verifyTitle();
	}
	
}
