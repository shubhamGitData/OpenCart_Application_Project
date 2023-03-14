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
	
	
	
	@Test (priority=5)
	public void Verify_Desktop_Menu() {
		Home_Page hp = Home_Page.getHomePage();
		hp.verifyDesktop_Menu();
	}
	
	
	
	@Test (priority=6)
	public void VerifyLaptop_Notebooks_Menu() {
		Home_Page hp = Home_Page.getHomePage();
		hp.verifyLaptop_NotebooksMenu();
	}
	
	
	@Test (priority=7)
	public void Verify_Components_Menu() {
		Home_Page hp = Home_Page.getHomePage();
		hp.verifyComponentsMenu();
	}
	
	
	@Test (priority=8)
	public void Verify_Tablets_Menu() {
		Home_Page hp = Home_Page.getHomePage();
		hp.verifyTabletsMenu();
	}
	
	
	@Test (priority=9)
	public void Verify_Software_Menu() {
		Home_Page hp = Home_Page.getHomePage();
		hp.verifySoftwareMenu();
	}
	
	
	@Test (priority=10)
	public void Verify_Phones_Menu() {
		Home_Page hp = Home_Page.getHomePage();
		hp.verifyPhonesMenu();
	}
	
	
	@Test (priority=11)
	public void Verify_Cameras_Menu() {
		Home_Page hp = Home_Page.getHomePage();
		hp.verifyCamerasMenu();
	}
	
	
	
	@Test (priority=12)
	public void Verify_Mp3Players_Menu() {
		Home_Page hp = Home_Page.getHomePage();
		hp.verifymp3Players();
	}
}
