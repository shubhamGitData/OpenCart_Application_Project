package opencart.Application.Test;

import org.testng.annotations.Test;

import opencart.Application.Pages.Home_Page;
import opencart.Application.Pages.Registration_Page;
import opencart.framework.WebDriver.WebdriverClass;

public class Application_Test extends WebdriverClass {

	@Test(priority=1, groups="Home_Page")
	public void Verify_Currency_DropDown() {
		Home_Page hp = Home_Page.getHomePage();
		hp.verifyCurrencyDropdown();
	}
	
	@Test(priority=2, groups="Home_Page")
	public void Verify_Search_Box() {
		Home_Page hp = Home_Page.getHomePage();
		hp.verifySearchBox();
	}
	
	
	@Test (priority=3, groups="Home_Page")
	public void Verify_Search_Button() {
		Home_Page hp = Home_Page.getHomePage();
		hp.verifySearchButton();
	}
	
	
	@Test (priority=4,  groups="Home_Page")
	public void Verify_HomePage_Title() {
		Home_Page hp = Home_Page.getHomePage();
		hp.verifyTitle();
	}
	
	
	
	@Test (priority=5, groups="Home_Page")
	public void Verify_Desktop_Menu() {
		Home_Page hp = Home_Page.getHomePage();
		hp.verifyDesktop_Menu();
	}
	
	
	
	@Test (priority=6,  groups="Home_Page")
	public void VerifyLaptop_Notebooks_Menu() {
		Home_Page hp = Home_Page.getHomePage();
		hp.verifyLaptop_NotebooksMenu();
	}
	
	
	@Test (priority=7, groups="Home_Page")
	public void Verify_Components_Menu() {
		Home_Page hp = Home_Page.getHomePage();
		hp.verifyComponentsMenu();
	}
	
	
	@Test (priority=8,  groups="Home_Page")
	public void Verify_Tablets_Menu() {
		Home_Page hp = Home_Page.getHomePage();
		hp.verifyTabletsMenu();
	}
	
	
	@Test (priority=9,  groups="Home_Page")
	public void Verify_Software_Menu() {
		Home_Page hp = Home_Page.getHomePage();
		hp.verifySoftwareMenu();
	}
	
	
	@Test (priority=10,  groups="Home_Page")
	public void Verify_Phones_Menu() {
		Home_Page hp = Home_Page.getHomePage();
		hp.verifyPhonesMenu();
	}
	
	
	@Test (priority=11,  groups="Home_Page")
	public void Verify_Cameras_Menu() {
		Home_Page hp = Home_Page.getHomePage();
		hp.verifyCamerasMenu();
	}
	
	
	
	@Test (priority=12, groups="Home_Page")
	public void Verify_Mp3Players_Menu() {
		Home_Page hp = Home_Page.getHomePage();
		hp.verifymp3Players();
	}
	
	

	@Test (priority=13, groups="Registration_Page")
	public void Verify_MyAccount_Menu() {
		Registration_Page rp = Registration_Page.getRegistration_Page();
		rp.Registration_Page_Landing();
		rp.verifyMyAccountButton();
	}
	
	
	
	@Test (priority=14, groups="Registration_Page")
	public void Verify_Restration_Menu() {
		Registration_Page rp = Registration_Page.getRegistration_Page();
		rp.Registration_Page_Landing();

		rp.verifyRegiLink();
	}
	
	
	@Test (priority=15, groups="Registration_Page")
	public void Verify_Registration_Header() {
		Registration_Page rp = Registration_Page.getRegistration_Page();
		rp.Registration_Page_Landing();

		rp.verifyregistration_Page_Header();
	}
	
	
	
	
	@Test (priority=16, groups="Registration_Page")
	public void Verify_Registration_Header2() {
		Registration_Page rp = Registration_Page.getRegistration_Page();
		rp.verifyregistration_Page_Header2();
	}
	
	
	
	
	@Test (priority=17, groups="Registration_Page")
	public void Verify_FirstName_Textbox() {
		Registration_Page rp = Registration_Page.getRegistration_Page();
		rp.Registration_Page_Landing();

		rp.verifyFirstnameTextbox();
	}
	
	
	
	
	@Test (priority=18, groups="Registration_Page")
	public void Verify_LastName_Textbox() {
		Registration_Page rp = Registration_Page.getRegistration_Page();
		rp.Registration_Page_Landing();

		rp.verifyLastnameTextbox();
	}
	
	
	
	
	
	@Test (priority=19, groups="Registration_Page")
	public void Verify_Email_Textbox() {
		Registration_Page rp = Registration_Page.getRegistration_Page();
		rp.Registration_Page_Landing();

		rp.verifyEmailTextbox();
	}
	
	
	
	
	@Test (priority=20, groups="Registration_Page")
	public void Verify_Password_Textbox_Header() {
		Registration_Page rp = Registration_Page.getRegistration_Page();
		rp.Registration_Page_Landing();

		rp.verifypasswordTextboxHeader();
	}
	
	
	

	@Test (priority=21, groups="Registration_Page")
	public void Verify_Password_Textbox() {
		Registration_Page rp = Registration_Page.getRegistration_Page();
		rp.Registration_Page_Landing();

		rp.verifypasswordTextboxHeader();
	}
	
	
	
	

	@Test (priority=22, groups="Registration_Page")
	public void Verify_NewsLetter_Header() {
		Registration_Page rp = Registration_Page.getRegistration_Page();
		rp.Registration_Page_Landing();

		rp.verifynewsletterHeader();
	}
	
	
	
	
	

	@Test (priority=23, groups="Registration_Page")
	public void Verify_Radio_Button_Yes() {
		Registration_Page rp = Registration_Page.getRegistration_Page();
		rp.Registration_Page_Landing();

		rp.verifyRadio_Button_Yes();
	}
	
	
	

	@Test (priority=24, groups="Registration_Page")
	public void Verify_Radio_Button_No() {
		Registration_Page rp = Registration_Page.getRegistration_Page();
		rp.Registration_Page_Landing();

		rp.verifyRadio_Button_No();
	}
	
	
	
	
	
	
	
	

	@Test (priority=25, groups="Registration_Page")
	public void Verify_Agree_Checkbox() {
		Registration_Page rp = Registration_Page.getRegistration_Page();
		rp.Registration_Page_Landing();

		rp.verifyAgreeCheckBox();
	}
	
	
	
	
	
	
	

	@Test (priority=26, groups="Registration_Page")
	public void Verify_Privacy_Policy_Link() {
		Registration_Page rp = Registration_Page.getRegistration_Page();
		rp.Registration_Page_Landing();

		rp.verifyPrivacyPolicy();
	}
	
	
	
	
	
	

	@Test (priority=27, groups="Registration_Page")
	public void Verify_Continue_Button() {
		Registration_Page rp = Registration_Page.getRegistration_Page();
		rp.Registration_Page_Landing();

		rp.verifyContinueButton();
	}
	
	
	
}
